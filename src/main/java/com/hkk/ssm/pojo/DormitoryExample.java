package com.hkk.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class DormitoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public DormitoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
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
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
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

        public Criteria andDormitoryIdIsNull() {
            addCriterion("dormitory_id is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIsNotNull() {
            addCriterion("dormitory_id is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdEqualTo(Integer value) {
            addCriterion("dormitory_id =", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotEqualTo(Integer value) {
            addCriterion("dormitory_id <>", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdGreaterThan(Integer value) {
            addCriterion("dormitory_id >", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormitory_id >=", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdLessThan(Integer value) {
            addCriterion("dormitory_id <", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("dormitory_id <=", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIn(List<Integer> values) {
            addCriterion("dormitory_id in", values, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotIn(List<Integer> values) {
            addCriterion("dormitory_id not in", values, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_id between", value1, value2, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_id not between", value1, value2, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidIsNull() {
            addCriterion("dormitory_dormitoryid is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidIsNotNull() {
            addCriterion("dormitory_dormitoryid is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidEqualTo(Integer value) {
            addCriterion("dormitory_dormitoryid =", value, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidNotEqualTo(Integer value) {
            addCriterion("dormitory_dormitoryid <>", value, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidGreaterThan(Integer value) {
            addCriterion("dormitory_dormitoryid >", value, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormitory_dormitoryid >=", value, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidLessThan(Integer value) {
            addCriterion("dormitory_dormitoryid <", value, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidLessThanOrEqualTo(Integer value) {
            addCriterion("dormitory_dormitoryid <=", value, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidIn(List<Integer> values) {
            addCriterion("dormitory_dormitoryid in", values, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidNotIn(List<Integer> values) {
            addCriterion("dormitory_dormitoryid not in", values, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_dormitoryid between", value1, value2, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_dormitoryid not between", value1, value2, "dormitoryDormitoryid");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingIsNull() {
            addCriterion("dormitory_dormitorybuilding is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingIsNotNull() {
            addCriterion("dormitory_dormitorybuilding is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingEqualTo(String value) {
            addCriterion("dormitory_dormitorybuilding =", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingNotEqualTo(String value) {
            addCriterion("dormitory_dormitorybuilding <>", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingGreaterThan(String value) {
            addCriterion("dormitory_dormitorybuilding >", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory_dormitorybuilding >=", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingLessThan(String value) {
            addCriterion("dormitory_dormitorybuilding <", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingLessThanOrEqualTo(String value) {
            addCriterion("dormitory_dormitorybuilding <=", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingLike(String value) {
            addCriterion("dormitory_dormitorybuilding like", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingNotLike(String value) {
            addCriterion("dormitory_dormitorybuilding not like", value, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingIn(List<String> values) {
            addCriterion("dormitory_dormitorybuilding in", values, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingNotIn(List<String> values) {
            addCriterion("dormitory_dormitorybuilding not in", values, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingBetween(String value1, String value2) {
            addCriterion("dormitory_dormitorybuilding between", value1, value2, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitorybuildingNotBetween(String value1, String value2) {
            addCriterion("dormitory_dormitorybuilding not between", value1, value2, "dormitoryDormitorybuilding");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaIsNull() {
            addCriterion("dormitory_dormitoryarea is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaIsNotNull() {
            addCriterion("dormitory_dormitoryarea is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaEqualTo(String value) {
            addCriterion("dormitory_dormitoryarea =", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaNotEqualTo(String value) {
            addCriterion("dormitory_dormitoryarea <>", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaGreaterThan(String value) {
            addCriterion("dormitory_dormitoryarea >", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory_dormitoryarea >=", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaLessThan(String value) {
            addCriterion("dormitory_dormitoryarea <", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaLessThanOrEqualTo(String value) {
            addCriterion("dormitory_dormitoryarea <=", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaLike(String value) {
            addCriterion("dormitory_dormitoryarea like", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaNotLike(String value) {
            addCriterion("dormitory_dormitoryarea not like", value, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaIn(List<String> values) {
            addCriterion("dormitory_dormitoryarea in", values, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaNotIn(List<String> values) {
            addCriterion("dormitory_dormitoryarea not in", values, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaBetween(String value1, String value2) {
            addCriterion("dormitory_dormitoryarea between", value1, value2, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryDormitoryareaNotBetween(String value1, String value2) {
            addCriterion("dormitory_dormitoryarea not between", value1, value2, "dormitoryDormitoryarea");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalIsNull() {
            addCriterion("dormitory_bedtotal is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalIsNotNull() {
            addCriterion("dormitory_bedtotal is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalEqualTo(String value) {
            addCriterion("dormitory_bedtotal =", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalNotEqualTo(String value) {
            addCriterion("dormitory_bedtotal <>", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalGreaterThan(String value) {
            addCriterion("dormitory_bedtotal >", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory_bedtotal >=", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalLessThan(String value) {
            addCriterion("dormitory_bedtotal <", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalLessThanOrEqualTo(String value) {
            addCriterion("dormitory_bedtotal <=", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalLike(String value) {
            addCriterion("dormitory_bedtotal like", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalNotLike(String value) {
            addCriterion("dormitory_bedtotal not like", value, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalIn(List<String> values) {
            addCriterion("dormitory_bedtotal in", values, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalNotIn(List<String> values) {
            addCriterion("dormitory_bedtotal not in", values, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalBetween(String value1, String value2) {
            addCriterion("dormitory_bedtotal between", value1, value2, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryBedtotalNotBetween(String value1, String value2) {
            addCriterion("dormitory_bedtotal not between", value1, value2, "dormitoryBedtotal");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinIsNull() {
            addCriterion("dormitory_livein is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinIsNotNull() {
            addCriterion("dormitory_livein is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinEqualTo(Integer value) {
            addCriterion("dormitory_livein =", value, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinNotEqualTo(Integer value) {
            addCriterion("dormitory_livein <>", value, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinGreaterThan(Integer value) {
            addCriterion("dormitory_livein >", value, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormitory_livein >=", value, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinLessThan(Integer value) {
            addCriterion("dormitory_livein <", value, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinLessThanOrEqualTo(Integer value) {
            addCriterion("dormitory_livein <=", value, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinIn(List<Integer> values) {
            addCriterion("dormitory_livein in", values, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinNotIn(List<Integer> values) {
            addCriterion("dormitory_livein not in", values, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_livein between", value1, value2, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLiveinNotBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_livein not between", value1, value2, "dormitoryLivein");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderIsNull() {
            addCriterion("dormitory_leader is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderIsNotNull() {
            addCriterion("dormitory_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderEqualTo(String value) {
            addCriterion("dormitory_leader =", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderNotEqualTo(String value) {
            addCriterion("dormitory_leader <>", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderGreaterThan(String value) {
            addCriterion("dormitory_leader >", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory_leader >=", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderLessThan(String value) {
            addCriterion("dormitory_leader <", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderLessThanOrEqualTo(String value) {
            addCriterion("dormitory_leader <=", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderLike(String value) {
            addCriterion("dormitory_leader like", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderNotLike(String value) {
            addCriterion("dormitory_leader not like", value, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderIn(List<String> values) {
            addCriterion("dormitory_leader in", values, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderNotIn(List<String> values) {
            addCriterion("dormitory_leader not in", values, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderBetween(String value1, String value2) {
            addCriterion("dormitory_leader between", value1, value2, "dormitoryLeader");
            return (Criteria) this;
        }

        public Criteria andDormitoryLeaderNotBetween(String value1, String value2) {
            addCriterion("dormitory_leader not between", value1, value2, "dormitoryLeader");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dormitory
     *
     * @mbggenerated do_not_delete_during_merge Sun Feb 19 23:02:18 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dormitory
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
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