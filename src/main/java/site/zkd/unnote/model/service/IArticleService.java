package site.zkd.unnote.model.service;

import org.apache.ibatis.annotations.Param;
import site.zkd.unnote.model.mybatis.bean.ArticleBean;

import java.util.List;

public interface IArticleService {

    /**
     * 查找文章，根据文章ID
     * @param userId
     * @param articleId
     * @return
     */
    ArticleBean selectById(Long userId,Long articleId);

    /**
     * 根据用户ID查找对应状态文章
     * @param userId
     * @param status
     * @return statues有误返回一个size为0的集合
     */
    List<ArticleBean> selectByStatus(Long userId, String status);

    /**
     * 分页查询 默认createtime降序排列
     * @param userId
     * @param status
     * @param offset 开始
     * @param limit  结束
     * @return statues有误返回一个size为0的集合
     */
    List<ArticleBean> selectPagingByStatus(Long userId, String status,@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 添加新的文章
     * @param articleBean
     * @throws Exception
     */
    int insertArticle(ArticleBean articleBean);

    /**
     * 更新文章,根据文章ID
     * @param articleBean
     * @return
     */
    int updateById(ArticleBean articleBean);

    /**
     * 删除文章,根据文章ID
     * @param userId
     * @param articleId
     * @return
     */
    int deleteById(Long userId,Long articleId);

    /**
     * 根据用户，查找所有文章数目
     * @param userId
     * @return
     */
    int countAllArticleByUserId(Long userId);

    /**
     * 根据用户，查找对应状态文章数目
     * @param userId
     * @param status
     * @return -1 为状态输入出错
     */
    int countAllArticleByUserId(Long userId,String status);


}
