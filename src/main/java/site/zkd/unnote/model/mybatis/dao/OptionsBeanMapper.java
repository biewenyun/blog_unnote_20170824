package site.zkd.unnote.model.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import site.zkd.unnote.model.mybatis.bean.OptionsBean;
import site.zkd.unnote.model.mybatis.bean.OptionsBeanExample;

public interface OptionsBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int countByExample(OptionsBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int deleteByExample(OptionsBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("optionsId") Long optionsId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int insert(OptionsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int insertSelective(OptionsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    List<OptionsBean> selectByExampleWithRowbounds(OptionsBeanExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    List<OptionsBean> selectByExample(OptionsBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    OptionsBean selectByPrimaryKey(@Param("optionsId") Long optionsId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OptionsBean record, @Param("example") OptionsBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OptionsBean record, @Param("example") OptionsBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OptionsBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OptionsBean record);
}