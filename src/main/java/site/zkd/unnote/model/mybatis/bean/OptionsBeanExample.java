package site.zkd.unnote.model.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OptionsBeanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public OptionsBeanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
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
     * This method corresponds to the database table t_blog_sys_options
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
     * This method corresponds to the database table t_blog_sys_options
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog_sys_options
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
     * This class corresponds to the database table t_blog_sys_options
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

        public Criteria andOptionsIdIsNull() {
            addCriterion("options_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIdIsNotNull() {
            addCriterion("options_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsIdEqualTo(Long value) {
            addCriterion("options_id =", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdNotEqualTo(Long value) {
            addCriterion("options_id <>", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdGreaterThan(Long value) {
            addCriterion("options_id >", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("options_id >=", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdLessThan(Long value) {
            addCriterion("options_id <", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdLessThanOrEqualTo(Long value) {
            addCriterion("options_id <=", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdIn(List<Long> values) {
            addCriterion("options_id in", values, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdNotIn(List<Long> values) {
            addCriterion("options_id not in", values, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdBetween(Long value1, Long value2) {
            addCriterion("options_id between", value1, value2, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdNotBetween(Long value1, Long value2) {
            addCriterion("options_id not between", value1, value2, "optionsId");
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

        public Criteria andOptionsNameIsNull() {
            addCriterion("options_name is null");
            return (Criteria) this;
        }

        public Criteria andOptionsNameIsNotNull() {
            addCriterion("options_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsNameEqualTo(String value) {
            addCriterion("options_name =", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameNotEqualTo(String value) {
            addCriterion("options_name <>", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameGreaterThan(String value) {
            addCriterion("options_name >", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameGreaterThanOrEqualTo(String value) {
            addCriterion("options_name >=", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameLessThan(String value) {
            addCriterion("options_name <", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameLessThanOrEqualTo(String value) {
            addCriterion("options_name <=", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameLike(String value) {
            addCriterion("options_name like", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameNotLike(String value) {
            addCriterion("options_name not like", value, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameIn(List<String> values) {
            addCriterion("options_name in", values, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameNotIn(List<String> values) {
            addCriterion("options_name not in", values, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameBetween(String value1, String value2) {
            addCriterion("options_name between", value1, value2, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsNameNotBetween(String value1, String value2) {
            addCriterion("options_name not between", value1, value2, "optionsName");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesIsNull() {
            addCriterion("options_values is null");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesIsNotNull() {
            addCriterion("options_values is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesEqualTo(Integer value) {
            addCriterion("options_values =", value, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesNotEqualTo(Integer value) {
            addCriterion("options_values <>", value, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesGreaterThan(Integer value) {
            addCriterion("options_values >", value, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesGreaterThanOrEqualTo(Integer value) {
            addCriterion("options_values >=", value, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesLessThan(Integer value) {
            addCriterion("options_values <", value, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesLessThanOrEqualTo(Integer value) {
            addCriterion("options_values <=", value, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesIn(List<Integer> values) {
            addCriterion("options_values in", values, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesNotIn(List<Integer> values) {
            addCriterion("options_values not in", values, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesBetween(Integer value1, Integer value2) {
            addCriterion("options_values between", value1, value2, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsValuesNotBetween(Integer value1, Integer value2) {
            addCriterion("options_values not between", value1, value2, "optionsValues");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadIsNull() {
            addCriterion("options_autoload is null");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadIsNotNull() {
            addCriterion("options_autoload is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadEqualTo(Integer value) {
            addCriterion("options_autoload =", value, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadNotEqualTo(Integer value) {
            addCriterion("options_autoload <>", value, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadGreaterThan(Integer value) {
            addCriterion("options_autoload >", value, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("options_autoload >=", value, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadLessThan(Integer value) {
            addCriterion("options_autoload <", value, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadLessThanOrEqualTo(Integer value) {
            addCriterion("options_autoload <=", value, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadIn(List<Integer> values) {
            addCriterion("options_autoload in", values, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadNotIn(List<Integer> values) {
            addCriterion("options_autoload not in", values, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadBetween(Integer value1, Integer value2) {
            addCriterion("options_autoload between", value1, value2, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsAutoloadNotBetween(Integer value1, Integer value2) {
            addCriterion("options_autoload not between", value1, value2, "optionsAutoload");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeIsNull() {
            addCriterion("options_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeIsNotNull() {
            addCriterion("options_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeEqualTo(Date value) {
            addCriterion("options_last_update_time =", value, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("options_last_update_time <>", value, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeGreaterThan(Date value) {
            addCriterion("options_last_update_time >", value, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("options_last_update_time >=", value, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeLessThan(Date value) {
            addCriterion("options_last_update_time <", value, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("options_last_update_time <=", value, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeIn(List<Date> values) {
            addCriterion("options_last_update_time in", values, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("options_last_update_time not in", values, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("options_last_update_time between", value1, value2, "optionsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOptionsLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("options_last_update_time not between", value1, value2, "optionsLastUpdateTime");
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

        public Criteria andOptionsExtendIdIsNull() {
            addCriterion("options_extend_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdIsNotNull() {
            addCriterion("options_extend_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdEqualTo(Long value) {
            addCriterion("options_extend_id =", value, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdNotEqualTo(Long value) {
            addCriterion("options_extend_id <>", value, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdGreaterThan(Long value) {
            addCriterion("options_extend_id >", value, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("options_extend_id >=", value, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdLessThan(Long value) {
            addCriterion("options_extend_id <", value, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdLessThanOrEqualTo(Long value) {
            addCriterion("options_extend_id <=", value, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdIn(List<Long> values) {
            addCriterion("options_extend_id in", values, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdNotIn(List<Long> values) {
            addCriterion("options_extend_id not in", values, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdBetween(Long value1, Long value2) {
            addCriterion("options_extend_id between", value1, value2, "optionsExtendId");
            return (Criteria) this;
        }

        public Criteria andOptionsExtendIdNotBetween(Long value1, Long value2) {
            addCriterion("options_extend_id not between", value1, value2, "optionsExtendId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_blog_sys_options
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
     * This class corresponds to the database table t_blog_sys_options
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