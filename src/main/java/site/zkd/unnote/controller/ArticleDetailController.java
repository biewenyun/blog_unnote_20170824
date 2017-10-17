package site.zkd.unnote.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import site.zkd.unnote.utils.GsonUtils;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

public class ArticleDetailController {

//    /**
//     * RESTful风格的文章页面
//     *
//     * @param postId 文章ID
//     * @return 返回文章页面
//     */
//    @RequestMapping(path = "/post/{postId}", method = RequestMethod.GET)
//    @ApiOperation(
//            value = "打开文章详情web界面"
//            , notes = "文章详情web界面，js模板加载网页数据")
//    public ModelAndView getPostView(@PathVariable long postId) {
//        ModelAndView resultView = new ModelAndView("frontPost");
//        resultView.addObject("framJson", getFramJson());
//        resultView.addObject("postJson", getPostById(postId));
//        return resultView;
//    }
//
//    /**
//     * 根据文章ID获取文章内容
//     *
//     * @param postId 文章ID
//     * @return 返回文章ID对应的文章内容
//     */
//
//    @RequestMapping(value = "/getPost", produces = {APPLICATION_JSON_UTF8_VALUE}, method = {RequestMethod.GET, RequestMethod.POST})
//    @ApiOperation(value = "根据id获取文章json", notes = "根据文章的ID获取文章的详情json", response = PostBean.class)
//    @ResponseBody
//    public Object getPostById(long postId) {
//        ResponseObj<Object> responseObj = new ResponseObj();
//        try {
//            ArticleBean articleBean = postService.findOneById(postId);
//            if (null == articleBean) {
//                responseObj.setCode(ResponseObj.EMPUTY);
//                responseObj.setMsg(ResponseObj.EMPUTY_STR);
//            } else {
//                responseObj.setCode(ResponseObj.OK);
//                responseObj.setMsg(ResponseObj.OK_STR);
//                responseObj.setData(articleBean);
//            }
//            System.out.println(new GsonUtils().toJson(responseObj));
//            return new GsonUtils().toJson(responseObj);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            responseObj.setCode(ResponseObj.FAILED);
//            responseObj.setMsg(ResponseObj.FAILED_STR);
//            return new GsonUtils().toJson(responseObj);
//        }
//    }

}
