package com.zxr.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUserMenuMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserMenuMappingExample() {
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

        public Criteria andSysUserMenuMappingIdIsNull() {
            addCriterion("sys_user_menu_mapping_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdIsNotNull() {
            addCriterion("sys_user_menu_mapping_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdEqualTo(Long value) {
            addCriterion("sys_user_menu_mapping_id =", value, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdNotEqualTo(Long value) {
            addCriterion("sys_user_menu_mapping_id <>", value, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdGreaterThan(Long value) {
            addCriterion("sys_user_menu_mapping_id >", value, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user_menu_mapping_id >=", value, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdLessThan(Long value) {
            addCriterion("sys_user_menu_mapping_id <", value, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user_menu_mapping_id <=", value, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdIn(List<Long> values) {
            addCriterion("sys_user_menu_mapping_id in", values, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdNotIn(List<Long> values) {
            addCriterion("sys_user_menu_mapping_id not in", values, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdBetween(Long value1, Long value2) {
            addCriterion("sys_user_menu_mapping_id between", value1, value2, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserMenuMappingIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user_menu_mapping_id not between", value1, value2, "sysUserMenuMappingId");
            return (Criteria) this;
        }

        public Criteria andSysMenuidIsNull() {
            addCriterion("sys_menuId is null");
            return (Criteria) this;
        }

        public Criteria andSysMenuidIsNotNull() {
            addCriterion("sys_menuId is not null");
            return (Criteria) this;
        }

        public Criteria andSysMenuidEqualTo(Long value) {
            addCriterion("sys_menuId =", value, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidNotEqualTo(Long value) {
            addCriterion("sys_menuId <>", value, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidGreaterThan(Long value) {
            addCriterion("sys_menuId >", value, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_menuId >=", value, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidLessThan(Long value) {
            addCriterion("sys_menuId <", value, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidLessThanOrEqualTo(Long value) {
            addCriterion("sys_menuId <=", value, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidIn(List<Long> values) {
            addCriterion("sys_menuId in", values, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidNotIn(List<Long> values) {
            addCriterion("sys_menuId not in", values, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidBetween(Long value1, Long value2) {
            addCriterion("sys_menuId between", value1, value2, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysMenuidNotBetween(Long value1, Long value2) {
            addCriterion("sys_menuId not between", value1, value2, "sysMenuid");
            return (Criteria) this;
        }

        public Criteria andSysUseridIsNull() {
            addCriterion("sys_userId is null");
            return (Criteria) this;
        }

        public Criteria andSysUseridIsNotNull() {
            addCriterion("sys_userId is not null");
            return (Criteria) this;
        }

        public Criteria andSysUseridEqualTo(Long value) {
            addCriterion("sys_userId =", value, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridNotEqualTo(Long value) {
            addCriterion("sys_userId <>", value, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridGreaterThan(Long value) {
            addCriterion("sys_userId >", value, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_userId >=", value, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridLessThan(Long value) {
            addCriterion("sys_userId <", value, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridLessThanOrEqualTo(Long value) {
            addCriterion("sys_userId <=", value, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridIn(List<Long> values) {
            addCriterion("sys_userId in", values, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridNotIn(List<Long> values) {
            addCriterion("sys_userId not in", values, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridBetween(Long value1, Long value2) {
            addCriterion("sys_userId between", value1, value2, "sysUserid");
            return (Criteria) this;
        }

        public Criteria andSysUseridNotBetween(Long value1, Long value2) {
            addCriterion("sys_userId not between", value1, value2, "sysUserid");
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