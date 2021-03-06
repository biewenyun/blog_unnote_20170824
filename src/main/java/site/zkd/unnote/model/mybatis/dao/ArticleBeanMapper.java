package site.zkd.unnote.model.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import site.zkd.unnote.model.mybatis.bean.ArticleBean;
import site.zkd.unnote.model.mybatis.bean.ArticleBeanExample;

public interface ArticleBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int countByExample(ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("articleId") Long articleId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int insert(ArticleBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int insertSelective(ArticleBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    List<ArticleBean> selectByExampleWithBLOBsWithRowbounds(ArticleBeanExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    List<ArticleBean> selectByExampleWithBLOBs(ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    List<ArticleBean> selectByExampleWithRowbounds(ArticleBeanExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    List<ArticleBean> selectByExample(ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    ArticleBean selectByPrimaryKey(@Param("articleId") Long articleId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ArticleBean record, @Param("example") ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ArticleBean record, @Param("example") ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ArticleBean record, @Param("example") ArticleBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ArticleBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_article
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleBean record);
}