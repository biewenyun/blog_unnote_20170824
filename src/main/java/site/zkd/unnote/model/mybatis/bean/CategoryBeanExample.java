package site.zkd.unnote.model.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryBeanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public CategoryBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
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
     * This method corresponds to the database table t_blog_category
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
     * This method corresponds to the database table t_blog_category
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_category
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
     * This class corresponds to the database table t_blog_category
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIsNull() {
            addCriterion("category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIsNotNull() {
            addCriterion("category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdEqualTo(Long value) {
            addCriterion("category_parent_id =", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotEqualTo(Long value) {
            addCriterion("category_parent_id <>", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdGreaterThan(Long value) {
            addCriterion("category_parent_id >", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_parent_id >=", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdLessThan(Long value) {
            addCriterion("category_parent_id <", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdLessThanOrEqualTo(Long value) {
            addCriterion("category_parent_id <=", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIn(List<Long> values) {
            addCriterion("category_parent_id in", values, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotIn(List<Long> values) {
            addCriterion("category_parent_id not in", values, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdBetween(Long value1, Long value2) {
            addCriterion("category_parent_id between", value1, value2, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotBetween(Long value1, Long value2) {
            addCriterion("category_parent_id not between", value1, value2, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopIsNull() {
            addCriterion("category_istop is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopIsNotNull() {
            addCriterion("category_istop is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopEqualTo(Integer value) {
            addCriterion("category_istop =", value, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopNotEqualTo(Integer value) {
            addCriterion("category_istop <>", value, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopGreaterThan(Integer value) {
            addCriterion("category_istop >", value, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_istop >=", value, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopLessThan(Integer value) {
            addCriterion("category_istop <", value, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopLessThanOrEqualTo(Integer value) {
            addCriterion("category_istop <=", value, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopIn(List<Integer> values) {
            addCriterion("category_istop in", values, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopNotIn(List<Integer> values) {
            addCriterion("category_istop not in", values, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopBetween(Integer value1, Integer value2) {
            addCriterion("category_istop between", value1, value2, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("category_istop not between", value1, value2, "categoryIstop");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeIsNull() {
            addCriterion("category_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeIsNotNull() {
            addCriterion("category_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeEqualTo(Date value) {
            addCriterion("category_last_update_time =", value, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("category_last_update_time <>", value, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeGreaterThan(Date value) {
            addCriterion("category_last_update_time >", value, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("category_last_update_time >=", value, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeLessThan(Date value) {
            addCriterion("category_last_update_time <", value, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("category_last_update_time <=", value, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeIn(List<Date> values) {
            addCriterion("category_last_update_time in", values, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("category_last_update_time not in", values, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("category_last_update_time between", value1, value2, "categoryLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCategoryLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("category_last_update_time not between", value1, value2, "categoryLastUpdateTime");
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
     * This class corresponds to the database table t_blog_category
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
     * This class corresponds to the database table t_blog_category
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