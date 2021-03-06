package site.zkd.unnote.model.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabelBeanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public LabelBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLabelIdIsNull() {
            addCriterion("label_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("label_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(Long value) {
            addCriterion("label_id =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(Long value) {
            addCriterion("label_id <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(Long value) {
            addCriterion("label_id >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("label_id >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(Long value) {
            addCriterion("label_id <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(Long value) {
            addCriterion("label_id <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<Long> values) {
            addCriterion("label_id in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<Long> values) {
            addCriterion("label_id not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(Long value1, Long value2) {
            addCriterion("label_id between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(Long value1, Long value2) {
            addCriterion("label_id not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeIsNull() {
            addCriterion("label_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeIsNotNull() {
            addCriterion("label_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeEqualTo(Date value) {
            addCriterion("label_last_update_time =", value, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("label_last_update_time <>", value, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeGreaterThan(Date value) {
            addCriterion("label_last_update_time >", value, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("label_last_update_time >=", value, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeLessThan(Date value) {
            addCriterion("label_last_update_time <", value, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("label_last_update_time <=", value, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeIn(List<Date> values) {
            addCriterion("label_last_update_time in", values, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("label_last_update_time not in", values, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("label_last_update_time between", value1, value2, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("label_last_update_time not between", value1, value2, "labelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdIsNull() {
            addCriterion("label_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdIsNotNull() {
            addCriterion("label_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdEqualTo(Long value) {
            addCriterion("label_parent_id =", value, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdNotEqualTo(Long value) {
            addCriterion("label_parent_id <>", value, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdGreaterThan(Long value) {
            addCriterion("label_parent_id >", value, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("label_parent_id >=", value, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdLessThan(Long value) {
            addCriterion("label_parent_id <", value, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdLessThanOrEqualTo(Long value) {
            addCriterion("label_parent_id <=", value, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdIn(List<Long> values) {
            addCriterion("label_parent_id in", values, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdNotIn(List<Long> values) {
            addCriterion("label_parent_id not in", values, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdBetween(Long value1, Long value2) {
            addCriterion("label_parent_id between", value1, value2, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelParentIdNotBetween(Long value1, Long value2) {
            addCriterion("label_parent_id not between", value1, value2, "labelParentId");
            return (Criteria) this;
        }

        public Criteria andLabelIstopIsNull() {
            addCriterion("label_istop is null");
            return (Criteria) this;
        }

        public Criteria andLabelIstopIsNotNull() {
            addCriterion("label_istop is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIstopEqualTo(Integer value) {
            addCriterion("label_istop =", value, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopNotEqualTo(Integer value) {
            addCriterion("label_istop <>", value, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopGreaterThan(Integer value) {
            addCriterion("label_istop >", value, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_istop >=", value, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopLessThan(Integer value) {
            addCriterion("label_istop <", value, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopLessThanOrEqualTo(Integer value) {
            addCriterion("label_istop <=", value, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopIn(List<Integer> values) {
            addCriterion("label_istop in", values, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopNotIn(List<Integer> values) {
            addCriterion("label_istop not in", values, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopBetween(Integer value1, Integer value2) {
            addCriterion("label_istop between", value1, value2, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andLabelIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("label_istop not between", value1, value2, "labelIstop");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNull() {
            addCriterion("spare_field1 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField1IsNotNull() {
            addCriterion("spare_field1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField1EqualTo(String value) {
            addCriterion("spare_field1 =", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotEqualTo(String value) {
            addCriterion("spare_field1 <>", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThan(String value) {
            addCriterion("spare_field1 >", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field1 >=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThan(String value) {
            addCriterion("spare_field1 <", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1LessThanOrEqualTo(String value) {
            addCriterion("spare_field1 <=", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Like(String value) {
            addCriterion("spare_field1 like", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotLike(String value) {
            addCriterion("spare_field1 not like", value, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1In(List<String> values) {
            addCriterion("spare_field1 in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotIn(List<String> values) {
            addCriterion("spare_field1 not in", values, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1Between(String value1, String value2) {
            addCriterion("spare_field1 between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField1NotBetween(String value1, String value2) {
            addCriterion("spare_field1 not between", value1, value2, "spareField1");
            return (Criteria) this;
        }

        public Criteria andSpareField2IsNull() {
            addCriterion("spare_field2 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField2IsNotNull() {
            addCriterion("spare_field2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField2EqualTo(String value) {
            addCriterion("spare_field2 =", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotEqualTo(String value) {
            addCriterion("spare_field2 <>", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2GreaterThan(String value) {
            addCriterion("spare_field2 >", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field2 >=", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2LessThan(String value) {
            addCriterion("spare_field2 <", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2LessThanOrEqualTo(String value) {
            addCriterion("spare_field2 <=", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2Like(String value) {
            addCriterion("spare_field2 like", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotLike(String value) {
            addCriterion("spare_field2 not like", value, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2In(List<String> values) {
            addCriterion("spare_field2 in", values, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotIn(List<String> values) {
            addCriterion("spare_field2 not in", values, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2Between(String value1, String value2) {
            addCriterion("spare_field2 between", value1, value2, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField2NotBetween(String value1, String value2) {
            addCriterion("spare_field2 not between", value1, value2, "spareField2");
            return (Criteria) this;
        }

        public Criteria andSpareField3IsNull() {
            addCriterion("spare_field3 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField3IsNotNull() {
            addCriterion("spare_field3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField3EqualTo(String value) {
            addCriterion("spare_field3 =", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotEqualTo(String value) {
            addCriterion("spare_field3 <>", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3GreaterThan(String value) {
            addCriterion("spare_field3 >", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field3 >=", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3LessThan(String value) {
            addCriterion("spare_field3 <", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3LessThanOrEqualTo(String value) {
            addCriterion("spare_field3 <=", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3Like(String value) {
            addCriterion("spare_field3 like", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotLike(String value) {
            addCriterion("spare_field3 not like", value, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3In(List<String> values) {
            addCriterion("spare_field3 in", values, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotIn(List<String> values) {
            addCriterion("spare_field3 not in", values, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3Between(String value1, String value2) {
            addCriterion("spare_field3 between", value1, value2, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField3NotBetween(String value1, String value2) {
            addCriterion("spare_field3 not between", value1, value2, "spareField3");
            return (Criteria) this;
        }

        public Criteria andSpareField4IsNull() {
            addCriterion("spare_field4 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField4IsNotNull() {
            addCriterion("spare_field4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField4EqualTo(String value) {
            addCriterion("spare_field4 =", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotEqualTo(String value) {
            addCriterion("spare_field4 <>", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4GreaterThan(String value) {
            addCriterion("spare_field4 >", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field4 >=", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4LessThan(String value) {
            addCriterion("spare_field4 <", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4LessThanOrEqualTo(String value) {
            addCriterion("spare_field4 <=", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4Like(String value) {
            addCriterion("spare_field4 like", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotLike(String value) {
            addCriterion("spare_field4 not like", value, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4In(List<String> values) {
            addCriterion("spare_field4 in", values, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotIn(List<String> values) {
            addCriterion("spare_field4 not in", values, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4Between(String value1, String value2) {
            addCriterion("spare_field4 between", value1, value2, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField4NotBetween(String value1, String value2) {
            addCriterion("spare_field4 not between", value1, value2, "spareField4");
            return (Criteria) this;
        }

        public Criteria andSpareField5IsNull() {
            addCriterion("spare_field5 is null");
            return (Criteria) this;
        }

        public Criteria andSpareField5IsNotNull() {
            addCriterion("spare_field5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpareField5EqualTo(String value) {
            addCriterion("spare_field5 =", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotEqualTo(String value) {
            addCriterion("spare_field5 <>", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5GreaterThan(String value) {
            addCriterion("spare_field5 >", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5GreaterThanOrEqualTo(String value) {
            addCriterion("spare_field5 >=", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5LessThan(String value) {
            addCriterion("spare_field5 <", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5LessThanOrEqualTo(String value) {
            addCriterion("spare_field5 <=", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5Like(String value) {
            addCriterion("spare_field5 like", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotLike(String value) {
            addCriterion("spare_field5 not like", value, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5In(List<String> values) {
            addCriterion("spare_field5 in", values, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotIn(List<String> values) {
            addCriterion("spare_field5 not in", values, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5Between(String value1, String value2) {
            addCriterion("spare_field5 between", value1, value2, "spareField5");
            return (Criteria) this;
        }

        public Criteria andSpareField5NotBetween(String value1, String value2) {
            addCriterion("spare_field5 not between", value1, value2, "spareField5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_blog_label
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_blog_label
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}