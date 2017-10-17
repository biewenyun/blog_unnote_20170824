package site.zkd.unnote.utils;



import java.text.SimpleDateFormat;
import java.util.Date;

public class PostInitUtils {

//    /**
//     * 发布文章,这时候没有ID
//     */
//    public static PostCustom setPostInfo(
//            String article_author
//            , Date article_create_time
//            , String article_title
//            , String article_content
//            , String guid) {
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//        return new PostCustom.Builder()
//                .article_id("")
//                .article_author(article_author)
//                .article_title(article_title)
//                .article_content(article_content)
//                .article_abstract("")
//                .article_label_name("label_build")
//                .article_istop("1")
//                .article_create_time(atNow)
//                .article_lastmodified_time(atNow)
//                .article_isvisible("1")
//                .article_status("publish")
//                .article_content_html("")
//                .user_id("0")
//                .label_id("0")
//                .category_id("0")
//                .modified_id("0")
//                .comment_id("0")
//                .menu_order(0)
//                .guid(guid)
//                .ping_status("open")
//                .post_type("post")
//                .post_mime_type("html")
//                .build();
//    }
//
//    /**
//     * 更新文章,这时候没有ID
//     */
//    public static PostCustom updatePostInfo(String postId
//            , String article_author
//            , Date article_create_time
//            , String article_title
//            , String article_content
//            , String guid) {
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//        return new PostCustom.Builder()
//                .article_id(postId)
//                .article_author(article_author)
//                .article_title(article_title)
//                .article_content(article_content)
//                .article_abstract("")
//                .article_label_name("label_build")
//                .article_istop("1")
//                .article_create_time(atNow)
//                .article_lastmodified_time(atNow)
//                .article_isvisible("1")
//                .article_status("publish")
//                .article_content_html("")
//                .user_id("0")
//                .label_id("0")
//                .category_id("0")
//                .modified_id("0")
//                .comment_id("0")
//                .menu_order(0)
//                .guid(guid)
//                .ping_status("open")
//                .post_type("post")
//                .post_mime_type("html")
//                .build();
//    }

//    /**
//     * 设置草稿信息
//     */
//    public static PostCustom setDraftInfo(String postAuthor, String postTitle, String postContent) {
//
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//        return new PostCustom.Builder()
//                .id(null)
//                .postAuthor(postAuthor)
//                .postDate(atNow)
//                .postDateGmt(atNow)
//                .postTitle(postTitle)
//                .postExcerpt("")
//                .postStatus(DRAFT_POST_STATUS)
//                .commentStatus(OPEN_COMMENT_STATUS)
//                .commentCount(0L)
//                .pingStatus(OPEN_PING_STATUS)
//                .postPassword("")
//                .postName("")
//                .toPing("")
//                .pinged("")
//                .postModified(atNow)
//                .postModifiedGmt(atNow)
//                .postContentFiltered("")
//                .postContent(postContent)
//                .postParent("0")
//                .guid("")
//                .menuOrder(0)
//                .postType(POST_TYPE)
//                .postMimeType("")
//                .build();
//    }
//
//    /**
//     * 设置更新的草稿信息
//     */
//    public static PostCustom updateDraftInfo(String postId, String postAuthor, String postTitle, String postContent) {
//
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//        return new PostCustom.Builder()
//                .id(postId)
//                .postAuthor(postAuthor)
//                .postDate(atNow)
//                .postDateGmt(atNow)
//                .postTitle(postTitle)
//                .postExcerpt("")
//                .postStatus(DRAFT_POST_STATUS)
//                .commentStatus(OPEN_COMMENT_STATUS)
//                .commentCount(0L)
//                .pingStatus(OPEN_PING_STATUS)
//                .postPassword("")
//                .postName("")
//                .toPing("")
//                .pinged("")
//                .postModified(atNow)
//                .postModifiedGmt(atNow)
//                .postContentFiltered("")
//                .postContent(postContent)
//                .postParent("0")
//                .guid("")
//                .menuOrder(0)
//                .postType(POST_TYPE)
//                .postMimeType("")
//                .build();
//    }
//
//    /**
//     * 文章操作时候，插入日志
//     */
//    public static PostCustom insertPostLog(String parentId, String postAuthor, String postTitle, String guid, String postContent) {
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//        return new PostCustom.Builder()
//                .id(null)
//                .postAuthor(postAuthor)
//                .postDate(atNow)
//                .postDateGmt(atNow)
//                .postTitle(postTitle)
//                .postContent(postContent)
//                .postExcerpt("")
//                .postStatus(INHERIT_POST_STATUS)
//                .commentStatus(CLOSED_COMMENT_STATUS)
//                .commentCount(0L)
//                .pingStatus(CLOSED_COMMENT_STATUS)
//                .postPassword("")
//                .postName(parentId + "-revision-v1")
//                .toPing("")
//                .pinged("")
//                .postModified(atNow)
//                .postModifiedGmt(atNow)
//                .postContentFiltered("")
//                .postParent(parentId)
//                .guid(guid)
//                .menuOrder(0)
//                .postType(REVISION_POST_MIME_TYPE)
//                .postMimeType("")
//                .build();
//    }
//
//    public static PostCustom trashPostInfo(PostCustom postCustom){
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
//        return  new PostCustom.Builder()
//                .id(postCustom.getId())
//                .postAuthor(postCustom.getPostAuthor())
//                .postDate(postCustom.getPostDate())
//                .postDateGmt(postCustom.getPostDateGmt())
//                .postTitle(postCustom.getPostTitle())
//                .postContent(postCustom.getPostContent())
//                .postExcerpt(postCustom.getPostExcerpt())
//                .postStatus(TRASH_POST_STATUS)
//                .commentStatus(postCustom.getCommentStatus())
//                .commentCount(postCustom.getCommentCount())
//                .pingStatus(postCustom.getPingStatus())
//                .postPassword(postCustom.getPostPassword())
//                .postName(TRASH_POST_NAME)
//                .toPing(postCustom.getToPing())
//                .pinged(postCustom.getPinged())
//                .postModified(atNow)
//                .postModifiedGmt(atNow)
//                .postContentFiltered(postCustom.getPostContentFiltered())
//                .postParent(postCustom.getPostParent())
//                .guid(postCustom.getGuid())
//                .menuOrder(postCustom.getMenuOrder())
//                .postType(postCustom.getPostType())
//                .postMimeType(postCustom.getPostMimeType())
//                .build();
//    }
}
