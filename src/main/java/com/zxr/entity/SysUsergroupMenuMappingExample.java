package com.zxr.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUsergroupMenuMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsergroupMenuMappingExample() {
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

        public Criteria andSysUsergroupMenuMappingIdIsNull() {
            addCriterion("sys_usergroup_menu_mapping_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdIsNotNull() {
            addCriterion("sys_usergroup_menu_mapping_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdEqualTo(Long value) {
            addCriterion("sys_usergroup_menu_mapping_id =", value, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdNotEqualTo(Long value) {
            addCriterion("sys_usergroup_menu_mapping_id <>", value, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdGreaterThan(Long value) {
            addCriterion("sys_usergroup_menu_mapping_id >", value, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_usergroup_menu_mapping_id >=", value, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdLessThan(Long value) {
            addCriterion("sys_usergroup_menu_mapping_id <", value, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_usergroup_menu_mapping_id <=", value, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdIn(List<Long> values) {
            addCriterion("sys_usergroup_menu_mapping_id in", values, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdNotIn(List<Long> values) {
            addCriterion("sys_usergroup_menu_mapping_id not in", values, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdBetween(Long value1, Long value2) {
            addCriterion("sys_usergroup_menu_mapping_id between", value1, value2, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupMenuMappingIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_usergroup_menu_mapping_id not between", value1, value2, "sysUsergroupMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIsNull() {
            addCriterion("sys_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIsNotNull() {
            addCriterion("sys_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdEqualTo(Long value) {
            addCriterion("sys_menu_id =", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotEqualTo(Long value) {
            addCriterion("sys_menu_id <>", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdGreaterThan(Long value) {
            addCriterion("sys_menu_id >", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_menu_id >=", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdLessThan(Long value) {
            addCriterion("sys_menu_id <", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_menu_id <=", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIn(List<Long> values) {
            addCriterion("sys_menu_id in", values, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotIn(List<Long> values) {
            addCriterion("sys_menu_id not in", values, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdBetween(Long value1, Long value2) {
            addCriterion("sys_menu_id between", value1, value2, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_menu_id not between", value1, value2, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdIsNull() {
            addCriterion("sys_usergroup_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdIsNotNull() {
            addCriterion("sys_usergroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdEqualTo(Long value) {
            addCriterion("sys_usergroup_id =", value, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdNotEqualTo(Long value) {
            addCriterion("sys_usergroup_id <>", value, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdGreaterThan(Long value) {
            addCriterion("sys_usergroup_id >", value, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_usergroup_id >=", value, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdLessThan(Long value) {
            addCriterion("sys_usergroup_id <", value, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_usergroup_id <=", value, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdIn(List<Long> values) {
            addCriterion("sys_usergroup_id in", values, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdNotIn(List<Long> values) {
            addCriterion("sys_usergroup_id not in", values, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdBetween(Long value1, Long value2) {
            addCriterion("sys_usergroup_id between", value1, value2, "sysUsergroupId");
            return (Criteria) this;
        }

        public Criteria andSysUsergroupIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_usergroup_id not between", value1, value2, "sysUsergroupId");
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