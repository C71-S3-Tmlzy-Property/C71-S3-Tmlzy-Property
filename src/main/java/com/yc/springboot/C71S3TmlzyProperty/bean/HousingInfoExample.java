package com.yc.springboot.C71S3TmlzyProperty.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HousingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HousingInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHousIdIsNull() {
            addCriterion("hous_id is null");
            return (Criteria) this;
        }

        public Criteria andHousIdIsNotNull() {
            addCriterion("hous_id is not null");
            return (Criteria) this;
        }

        public Criteria andHousIdEqualTo(Integer value) {
            addCriterion("hous_id =", value, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdNotEqualTo(Integer value) {
            addCriterion("hous_id <>", value, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdGreaterThan(Integer value) {
            addCriterion("hous_id >", value, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hous_id >=", value, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdLessThan(Integer value) {
            addCriterion("hous_id <", value, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdLessThanOrEqualTo(Integer value) {
            addCriterion("hous_id <=", value, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdIn(List<Integer> values) {
            addCriterion("hous_id in", values, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdNotIn(List<Integer> values) {
            addCriterion("hous_id not in", values, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdBetween(Integer value1, Integer value2) {
            addCriterion("hous_id between", value1, value2, "housId");
            return (Criteria) this;
        }

        public Criteria andHousIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hous_id not between", value1, value2, "housId");
            return (Criteria) this;
        }

        public Criteria andOwneIdIsNull() {
            addCriterion("owne_id is null");
            return (Criteria) this;
        }

        public Criteria andOwneIdIsNotNull() {
            addCriterion("owne_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwneIdEqualTo(Integer value) {
            addCriterion("owne_id =", value, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdNotEqualTo(Integer value) {
            addCriterion("owne_id <>", value, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdGreaterThan(Integer value) {
            addCriterion("owne_id >", value, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owne_id >=", value, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdLessThan(Integer value) {
            addCriterion("owne_id <", value, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdLessThanOrEqualTo(Integer value) {
            addCriterion("owne_id <=", value, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdIn(List<Integer> values) {
            addCriterion("owne_id in", values, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdNotIn(List<Integer> values) {
            addCriterion("owne_id not in", values, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdBetween(Integer value1, Integer value2) {
            addCriterion("owne_id between", value1, value2, "owneId");
            return (Criteria) this;
        }

        public Criteria andOwneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owne_id not between", value1, value2, "owneId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeIsNull() {
            addCriterion("move_into_time is null");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeIsNotNull() {
            addCriterion("move_into_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeEqualTo(Date value) {
            addCriterion("move_into_time =", value, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeNotEqualTo(Date value) {
            addCriterion("move_into_time <>", value, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeGreaterThan(Date value) {
            addCriterion("move_into_time >", value, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("move_into_time >=", value, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeLessThan(Date value) {
            addCriterion("move_into_time <", value, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeLessThanOrEqualTo(Date value) {
            addCriterion("move_into_time <=", value, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeIn(List<Date> values) {
            addCriterion("move_into_time in", values, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeNotIn(List<Date> values) {
            addCriterion("move_into_time not in", values, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeBetween(Date value1, Date value2) {
            addCriterion("move_into_time between", value1, value2, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveIntoTimeNotBetween(Date value1, Date value2) {
            addCriterion("move_into_time not between", value1, value2, "moveIntoTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeIsNull() {
            addCriterion("move_out_time is null");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeIsNotNull() {
            addCriterion("move_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeEqualTo(Date value) {
            addCriterion("move_out_time =", value, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeNotEqualTo(Date value) {
            addCriterion("move_out_time <>", value, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeGreaterThan(Date value) {
            addCriterion("move_out_time >", value, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("move_out_time >=", value, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeLessThan(Date value) {
            addCriterion("move_out_time <", value, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("move_out_time <=", value, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeIn(List<Date> values) {
            addCriterion("move_out_time in", values, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeNotIn(List<Date> values) {
            addCriterion("move_out_time not in", values, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeBetween(Date value1, Date value2) {
            addCriterion("move_out_time between", value1, value2, "moveOutTime");
            return (Criteria) this;
        }

        public Criteria andMoveOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("move_out_time not between", value1, value2, "moveOutTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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