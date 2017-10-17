package site.zkd.unnote.controller.backSupporter;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import site.zkd.unnote.utils.GsonUtils;
import site.zkd.unnote.utils.MySiteMap;
import site.zkd.unnote.utils.PublicUtil;
import site.zkd.unnote.utils.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Controller
@RequestMapping(value = "/post")
@Api(value = "/post", description = "文章相关")
public class SysPostController {

//    @Autowired
//    private ArticleDao articleDao;
//
//    @RequestMapping(value = MySiteMap.COMMIT_POST
//            , produces = {APPLICATION_JSON_UTF8_VALUE}
//            , method = RequestMethod.POST)
//    @ApiOperation(
//            value = "提交文章"
//            , notes = "提交已经编辑的文章",
//            response = ResponseObj.class)
//    @ResponseBody
//    public Object commitPost(HttpServletRequest request,
//                             @ApiParam(value = "文章作者", required = false) @RequestParam(value = "article_author", required = true) String article_author,
//                             @ApiParam(value = "文章标题"
//                                     , required = true) @RequestParam(value = "article_title", required = true) String article_title,
//                             @ApiParam(value = "文章正文，多媒体一般没有正文"
//                                     , required = true) @RequestParam(value="article_content",required = true) String article_content,
//
//                             @ApiParam(value = "文章标签", required = true) @RequestParam(value = "article_label_name", required = true) String article_label_name,
//                             @ApiParam(value = "类别表ID", required = true) @RequestParam(value = "category_id", required = true) String category_id,
//                             @ApiParam(value = "是否对他人可见 0不可见 1可见", required = true) @RequestParam(value = "article_isvisible", required = true) String article_isvisible,
//
//                             @ApiParam(value = "文章状态 draft草稿 publish发布 Recycled回收站", required = true) @RequestParam(value = "article_status", required = true) String article_status
//    ) {
//        ResponseObj resultJson = new ResponseObj();
//        ArticleBean articleBean = null; //提交的文章实体
//
////        //作者信息判断
////        if (StringUtils.isEmpty(article_author))
////            try {
////                /**
////                 * 根据登录时候写入到session的用户真实ID获取值
////                 * @see cn.acheng1314.controller.backSupporter.SysUserController#userLogin(HttpServletRequest, HttpServletResponse, String, String)
////                 */
////                article_author = request.getSession().getAttribute("userRealId").toString();
////                Assert.notNull(article_author, "作者信息为空，未登录！");
////            } catch (Exception e) {
////                e.printStackTrace();
////                resultJson.setCode(ResponseObj.FAILED);
////                resultJson.setMsg(e.getMessage());
////                return GsonUtils.toJson(resultJson);
////            }
//
////        if (PublicUtil.isJsonRequest(request)) {
////            try {
////                articleBean = GsonUtils.jsonRequest2Bean(request.getInputStream(), ArticleBean.class);
////                article_author = articleBean.getArticle_author();
////                article_title = articleBean.getArticle_title();
////                article_content = articleBean.getArticle_content();
////                article_label_name = articleBean.getArticle_label_name();
////                category_id = articleBean.getCategory_id();
////                article_isvisible = articleBean.getArticle_isvisible();
////            } catch (IOException e) {
////                e.printStackTrace();
////                resultJson.setCode(ResponseObj.FAILED);
////                resultJson.setMsg(e.getMessage());
////                return GsonUtils.toJson(resultJson);
////            }
////        }
////        else {
////            postCustom = new PostCustom();
////            postCustom.setId(postId);
////            postCustom.setPostTitle(postTile);
////            postCustom.setPostContent(postContent);
////            postCustom.setPostStatus(postStatus);
////            postCustom.setCommentStatus(commentStatus);
////            postCustom.setGuid(guid);
////            postCustom.setPostType(postType);
////            postCustom.setPostMimeType(postMimeType);
////        }
////
//
//        //文章标题和正文为空，返回错误信息
//        if (StringUtils.isEmpty(article_title) || StringUtils.isEmpty(article_content)) {
//            resultJson.setCode(ResponseObj.FAILED);
//            resultJson.setMsg(StringUtils.isEmpty(article_title) ? "文章标题不能为空！" : "文章正文不能为空");
//            return GsonUtils.toJson(resultJson);
//        }
//
//        //保存初始版本
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//
//        PostCustom postCustom= new PostCustom();
//        postCustom.setArticle_id(String.valueOf(System.currentTimeMillis()));
//        postCustom.setArticle_author(article_author);
//        postCustom.setArticle_title(article_title);
//        postCustom.setArticle_content(article_content);
//        postCustom.setArticle_label_name(article_label_name);
//        postCustom.setCategory_id(category_id);
//        postCustom.setArticle_isvisible(article_isvisible);
//        postCustom.setArticle_status(article_status);
//
//        postCustom.setArticle_abstract("摘要");
//
//        articleDao.add(postCustom);
//        resultJson.setCode(ResponseObj.OK);
//        resultJson.setData(postCustom);
//        resultJson.setMsg("保存成功");
//        return GsonUtils.toJson(resultJson);
//
////        if (null != postId && !StringUtils.isEmpty(postId)) {
////            //保存更新，更新文章的时候文章本身的ID是存在的
////            if (!isPublish) {
////                postCustom = PostInitUtils.updateDraftInfo(postId, postAuthor, postTile, postContent);
////            } else {
////                postCustom = PostInitUtils.updatePostInfo(postId, postAuthor, atNow, postTile, urlCode.length() > 199 ? "" : urlCode, postContent, guid);
////            }
////            try {
////                postCustom.setGuid("/front/post/" + postId);
////                postService.update(postCustom);
////                if (null != postTermId)
////                    postService.updatePostTerm(postId, postTermId);
////            } catch (Exception e) {
////                e.printStackTrace();
////                resultJson.setCode(ResponseObj.FAILED);
////                resultJson.setMsg("内部数据处理异常,错误原因：" + e.getMessage());
////                return GsonUtils.toJson(resultJson);
////            }
////            resultJson.setCode(ResponseObj.OK);
////            resultJson.setData(postCustom);
////            resultJson.setMsg((!isPublish) ? "草稿修改成功" : "文章修改成功");
////            return GsonUtils.toJson(resultJson);
////        } else {
//        //在编码期间作出大量的异常判断这种为防御式编程
////        if (!isPublish) {
////            postCustom = PostInitUtils.setDraftInfo(postAuthor, postTile, postContent);
////        } else {
////            postCustom = PostInitUtils.setPostInfo(postAuthor, atNow, postTile, urlCode.length() > 199 ? "" : urlCode, postContent, guid);
////        }
////        try {
////            postService.add(postCustom);
////            if (null != postTermId)
////                postService.updatePostTerm(postCustom.getId(), postTermId);
////        } catch (Exception e) {
////            e.printStackTrace();
////            resultJson.setCode(ResponseObj.FAILED);
////            resultJson.setMsg("内部数据处理异常,错误原因：" + e.getMessage());
////            return GsonUtils.toJson(resultJson);
////        }
////        resultJson.setCode(ResponseObj.OK);
////        resultJson.setData(postCustom);
////        resultJson.setMsg((!isPublish) ? "草稿保存成功" : "文章保存成功");
////        return GsonUtils.toJson(resultJson);
////        }
//    }
}
