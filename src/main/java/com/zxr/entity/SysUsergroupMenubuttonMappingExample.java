package com.zxr.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUsergroupMenubuttonMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsergroupMenubuttonMappingExample() {
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

        public Criteria andSysUsergroupMenubuttonMappingIdIsNull() {
            addCriterion("sys_usergroup_menubutton_mapping_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdIsNotNull() {
            addCriterion("sys_usergroup_menubutton_mapping_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdEqualTo(Long value) {
            addCriterion("sys_usergroup_menubutton_mapping_id =", value, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdNotEqualTo(Long value) {
            addCriterion("sys_usergroup_menubutton_mapping_id <>", value, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdGreaterThan(Long value) {
            addCriterion("sys_usergroup_menubutton_mapping_id >", value, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_usergroup_menubutton_mapping_id >=", value, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdLessThan(Long value) {
            addCriterion("sys_usergroup_menubutton_mapping_id <", value, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_usergroup_menubutton_mapping_id <=", value, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdIn(List<Long> values) {
            addCriterion("sys_usergroup_menubutton_mapping_id in", values, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdNotIn(List<Long> values) {
            addCriterion("sys_usergroup_menubutton_mapping_id not in", values, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdBetween(Long value1, Long value2) {
            addCriterion("sys_usergroup_menubutton_mapping_id between", value1, value2, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenubuttonMappingIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_usergroup_menubutton_mapping_id not between", value1, value2, "sysUsergroupMenubuttonMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdIsNull() {
            addCriterion("sys_usegroup_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdIsNotNull() {
            addCriterion("sys_usegroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdEqualTo(Long value) {
            addCriterion("sys_usegroup_id =", value, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdNotEqualTo(Long value) {
            addCriterion("sys_usegroup_id <>", value, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdGreaterThan(Long value) {
            addCriterion("sys_usegroup_id >", value, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_usegroup_id >=", value, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdLessThan(Long value) {
            addCriterion("sys_usegroup_id <", value, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_usegroup_id <=", value, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdIn(List<Long> values) {
            addCriterion("sys_usegroup_id in", values, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdNotIn(List<Long> values) {
            addCriterion("sys_usegroup_id not in", values, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdBetween(Long value1, Long value2) {
            addCriterion("sys_usegroup_id between", value1, value2, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsegroupIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_usegroup_id not between", value1, value2, "sysUsegroupId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdIsNull() {
            addCriterion("sys_menubutton_id is null");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdIsNotNull() {
            addCriterion("sys_menubutton_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdEqualTo(Long value) {
            addCriterion("sys_menubutton_id =", value, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdNotEqualTo(Long value) {
            addCriterion("sys_menubutton_id <>", value, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdGreaterThan(Long value) {
            addCriterion("sys_menubutton_id >", value, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_menubutton_id >=", value, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdLessThan(Long value) {
            addCriterion("sys_menubutton_id <", value, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_menubutton_id <=", value, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdIn(List<Long> values) {
            addCriterion("sys_menubutton_id in", values, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdNotIn(List<Long> values) {
            addCriterion("sys_menubutton_id not in", values, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdBetween(Long value1, Long value2) {
            addCriterion("sys_menubutton_id between", value1, value2, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andSysMenubuttonIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_menubutton_id not between", value1, value2, "sysMenubuttonId");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(String value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(String value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(String value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(String value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(String value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(String value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLike(String value) {
            addCriterion("enable like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotLike(String value) {
            addCriterion("enable not like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<String> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<String> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(String value1, String value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(String value1, String value2) {
            addCriterion("enable not between", value1, value2, "enable");
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