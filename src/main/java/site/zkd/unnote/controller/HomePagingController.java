package site.zkd.unnote.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import site.zkd.unnote.model.custom.PageSplit;
import site.zkd.unnote.model.custom.ResponseList;
import site.zkd.unnote.model.mybatis.bean.ArticleBean;
import site.zkd.unnote.model.mybatis.bean.CategoryBean;
import site.zkd.unnote.model.mybatis.bean.LabelBean;
import site.zkd.unnote.model.service.IArticleService;
import site.zkd.unnote.model.service.ICategoryService;
import site.zkd.unnote.model.service.ILabelService;
import site.zkd.unnote.model.service.IUserService;
import site.zkd.unnote.utils.GlobalConstants;
import site.zkd.unnote.utils.GsonUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;


@Controller
@RequestMapping("/homepaging")
@Api(value = "/homepaging", description = "前台页面")
public class HomePagingController {

    @Autowired
    private IArticleService iArticleService;

    @Autowired
    private IUserService iUserService;

    @Autowired
    private ICategoryService iCategoryService;

    @Autowired
    private ILabelService iLabelService;


    /**
     * 页面
     * homepage页面（包含user列表）
     * 起始页面index.jsp中include 这个页面
     * 或者直接/homepaging/users
     * @return
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ApiOperation(value = "user列表vieAndModel", notes = "首页user列表")
    public ModelAndView view(HttpServletRequest request){
        ModelAndView view = new ModelAndView("homePage");
        view.addObject("userJson",getUserJson());
        return view;
    }
    /**
     * 页面
     * userHomepage 用户的首页
     * @return
     */
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ApiOperation(value = "打开用户首页界面", notes = "用户首页web界面，js模板加载网页数据")
    public ModelAndView userHomepaging(HttpServletRequest request,@PathVariable Long userId) throws Exception {
        ModelAndView view = new ModelAndView("userHomePage");

        //应该在此处加载用户的配置信息，比如pagesplit的数据，多少篇为一页等等，后续添加 TODO
        view.addObject("categorysJson", getCategoryList(request,userId));
        view.addObject("articlesJson", getArticlesJson(request,userId));
        view.addObject("labelsJson",getLabelJson(request,userId));
        return view;
    }



    /**
     * 页面
     * 用户文章详情
     * @return
     */
    @RequestMapping(value = "/artilcleDetail/{articleId}", method = RequestMethod.GET)
    @ApiOperation(value = "用户文章详情", notes = "通过userHomepage跳转的页面")
    public ModelAndView articleDetail(HttpServletRequest request,@PathVariable Long articleId) throws Exception {
        ModelAndView view = new ModelAndView("userArticleDetail");
        return view;
    }



    /**
     * 获取首页跳转的用户列表
     * data:{[NAME:用户名，ID:用户ID],...}
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUserJson", produces = {APPLICATION_JSON_UTF8_VALUE}, method = RequestMethod.POST)
    @ApiOperation(value = "获取首页跳转的用户列表", notes = "返回data:[用户名，用户ID]...", response = ResponseList.class)
    private Object getUserJson() {
        List userList = iUserService.getUserNameAndID();
        ResponseList<Map> response=fillReturnData(userList,null);
        return new GsonUtils().toJson(response);
    }


    /**
     * 获取首页中分页文章信息
     * @param request 用户请求
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findPublishArticles", produces = {APPLICATION_JSON_UTF8_VALUE}, method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取文章分页列表", notes = "返回文章列表，分页加载", response = ResponseList.class)
    private Object getArticlesJson(HttpServletRequest request,Long userId) {

        ResponseList<ArticleBean> response = new ResponseList<ArticleBean>();
        PageSplit page;

        try {
            page = new GsonUtils().jsonRequest2Bean(request.getInputStream(), PageSplit.class);

            //无法解析出page 可能是从homepage跳转过来的
            if(null==page&&userId!=null){
                page=new PageSplit();
                page.setUserid(userId);
            }

            //页面的请求用的request 没有用户id 请求错误，直接返回
            if (page.getUserid() < 0L) {
                response.setCode(GlobalConstants.Response.FAILED);
                response.setMsg(GlobalConstants.Response.FAILED_STR + ":userId 有误");
                return new GsonUtils().toJson(response);
            }

            //保证数据有效性，给出默认值(从homepage跳转过来的是没有)
            if (null == page.getStatues() || null == page.getOrderBy() ||
                    page.getStatues().equalsIgnoreCase( "") || page.getOrderBy().equalsIgnoreCase( "")) {
                page.setStatues(GlobalConstants.ARTICLE.Status.PUBLISH);
                page.setOrderBy(GlobalConstants.ARTICLE.OrderBy.CREATETIME);
            }
            if (page.getPageNum() <= 0) {
                page.setPageNum(1);
            }
            if (page.getPageSize() == 0) {
                page.setPageSize(10);
            }

            //文章数目，页数  以服务器查询到的为准，不能以页面发送上来的为准
            page.setTotalArticleNum(iArticleService.countAllArticleByUserId(page.getUserid(), page.getStatues()));
            if (page.getTotalArticleNum() % page.getPageSize() > 0) {
                page.setTotalPageNum(page.getTotalArticleNum() / page.getPageSize() + 1);
            } else {
                page.setTotalPageNum(page.getTotalArticleNum() / page.getPageSize());
            }

            //offset=(PageNum-1) * PageSize,limit=PageSize
            List<ArticleBean> articleBeanList = iArticleService.
                    selectPagingByStatus(page.getUserid(), page.getStatues(), (page.getPageNum() - 1) * page.getPageSize(), page.getPageSize());

            //填充返回数据
            response = fillReturnData(articleBeanList,page);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(GlobalConstants.Response.FAILED);
            response.setMsg(GlobalConstants.Response.FAILED_STR + e);
        }

        return new GsonUtils().toJson(response);
    }

    /**
     * 获取首页中其他信息：1.作者 2.label 3.category
     * 2 label
     * @param request
     * @return
     */
    @RequestMapping(value = "/getLabelList", produces = {APPLICATION_JSON_UTF8_VALUE}, method =  RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取首页中标签信息", notes = "返回label", response = LabelBean.class, responseContainer = "List")
    private Object getLabelJson(HttpServletRequest request, Long userId) {
        List<LabelBean> LabelBeanList =iLabelService.getLabelBeanList(userId);
        ResponseList<Map> response=fillReturnData(LabelBeanList,null);
        return new GsonUtils().toJson(response);
    }

    /**
     * 获取首页中其他信息：1.作者 2.label 3.category
     * 3 category
     * @param request
     * @return
     */
    @RequestMapping(value = "/getCategoryList", produces = {APPLICATION_JSON_UTF8_VALUE}, method =  RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取首页中类别信息", notes = "返回category", response = CategoryBean.class, responseContainer = "List")
    private Object getCategoryList(HttpServletRequest request,Long userId) {
        List<CategoryBean> categoryBeanList =iCategoryService.getCategoryBeanList(userId);
        ResponseList<Map> response=fillReturnData(categoryBeanList,null);
        return new GsonUtils().toJson(response);
    }



    /**
     * 返回给客户端的实体
     * @param dataList 数据实体列表
     * @param pageSplit 分页实体
     * @param <T> data中的类型
     * @return ResponseList
     */
    private <T>ResponseList fillReturnData(List<T> dataList,PageSplit pageSplit){
        ResponseList<T> response = new ResponseList<T>();
        //填充返回数据
        if (null == dataList || dataList.size() == 0) {
            response.setCode(GlobalConstants.Response.EMPTY);
            response.setMsg(GlobalConstants.Response.EMPTY_STR);
        } else {
            response.setCode(GlobalConstants.Response.OK);
            response.setMsg(GlobalConstants.Response.OK_STR);
            response.setData(dataList);
            response.setPageSplit(pageSplit);
        }
        return response;
    }

}
