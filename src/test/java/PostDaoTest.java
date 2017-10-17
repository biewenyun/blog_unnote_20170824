import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import site.zkd.unnote.utils.PostInitUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PostDaoTest  extends BaseTest {

//    @Autowired
//    private ArticleDao postDao;
//
//    @Test
//    public void testPostDao() {
//        List<PostCustom> list = postDao.findAllPublish(1, 50);
//        for (ArticleBean bean : list) {
//            System.out.println("postDaoTest:\n" + bean.toString());
//        }
//    }
//
//    @Test
//    public void testGetPostById() {
//        ArticleBean postBean = postDao.findOneById(0);
//
//        System.out.println("postDaoTest:\n" + postBean.toString());
//    }
//
//    @Test
//    public void testInsertPost() {
//        Date atNow = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        formatter.format(atNow);
////        PostCustom postCustom = new PostCustom();
////        postCustom.setId(null);
////        postCustom.setPublish(true);
////        postCustom.setPostAuthor("001");
////        postCustom.setPostDate(atNow);
////        postCustom.setPostDateGmt(atNow);
////        postCustom.setPostContent("1111111");
////        postCustom.setPostTitle("22222");
////        postCustom.setPostExcerpt("11111289489589458");
////        postCustom.setPostStatus("11111289489589458");
////        postCustom.setCommentStatus("11111289489589458");
////        postCustom.setPingStatus("11111289489589458");
////        postCustom.setPostPassword("11111289489589458");
////        postCustom.setPostName("11111289489589458");
////        postCustom.setToPing("11111289489589458");
////        postCustom.setPinged("11111289489589458");
////        postCustom.setPostModified(atNow);
////        postCustom.setPostModifiedGmt(atNow);
////        postCustom.setPostContentFiltered(formatter.format(atNow));
////        postCustom.setGuid(formatter.format(atNow));
////        postCustom.setMenuOrder(11100111);
//
////        postCustom.setCommentStatus();
//        PostCustom postCustom = PostInitUtils.setPostInfo("0", atNow, "luanma ce shi ", "乱码测试测试 content", "");
//        postDao.add(postCustom);
//        System.out.print("id=" + postCustom.getArticle_id());
////        postCustom = PostInitUtils.insertPostLog(postCustom.getId(), postCustom.getPostAuthor(), postCustom.getPostTitle(), postCustom.getGuid(), postCustom.getPostContent());
////        postDao.add(postCustom);
//    }

}
