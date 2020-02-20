package com.yc.springboot.C71S3TmlzyProperty.bean;

import java.util.ArrayList;
import java.util.List;

public class CostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSumPayableIsNull() {
            addCriterion("sum_payable is null");
            return (Criteria) this;
        }

        public Criteria andSumPayableIsNotNull() {
            addCriterion("sum_payable is not null");
            return (Criteria) this;
        }

        public Criteria andSumPayableEqualTo(Double value) {
            addCriterion("sum_payable =", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableNotEqualTo(Double value) {
            addCriterion("sum_payable <>", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableGreaterThan(Double value) {
            addCriterion("sum_payable >", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_payable >=", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableLessThan(Double value) {
            addCriterion("sum_payable <", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableLessThanOrEqualTo(Double value) {
            addCriterion("sum_payable <=", value, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableIn(List<Double> values) {
            addCriterion("sum_payable in", values, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableNotIn(List<Double> values) {
            addCriterion("sum_payable not in", values, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableBetween(Double value1, Double value2) {
            addCriterion("sum_payable between", value1, value2, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andSumPayableNotBetween(Double value1, Double value2) {
            addCriterion("sum_payable not between", value1, value2, "sumPayable");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleIsNull() {
            addCriterion("payment_cycle is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleIsNotNull() {
            addCriterion("payment_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleEqualTo(String value) {
            addCriterion("payment_cycle =", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleNotEqualTo(String value) {
            addCriterion("payment_cycle <>", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGreaterThan(String value) {
            addCriterion("payment_cycle >", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleGreaterThanOrEqualTo(String value) {
            addCriterion("payment_cycle >=", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleLessThan(String value) {
            addCriterion("payment_cycle <", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleLessThanOrEqualTo(String value) {
            addCriterion("payment_cycle <=", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleLike(String value) {
            addCriterion("payment_cycle like", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleNotLike(String value) {
            addCriterion("payment_cycle not like", value, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleIn(List<String> values) {
            addCriterion("payment_cycle in", values, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleNotIn(List<String> values) {
            addCriterion("payment_cycle not in", values, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleBetween(String value1, String value2) {
            addCriterion("payment_cycle between", value1, value2, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andPaymentCycleNotBetween(String value1, String value2) {
            addCriterion("payment_cycle not between", value1, value2, "paymentCycle");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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