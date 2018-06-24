package com.zxr.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUserGroupMappingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserGroupMappingExample() {
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

        public Criteria andSysUserGroupMappingIdIsNull() {
            addCriterion("sys_user_group_mapping_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdIsNotNull() {
            addCriterion("sys_user_group_mapping_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdEqualTo(Long value) {
            addCriterion("sys_user_group_mapping_id =", value, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdNotEqualTo(Long value) {
            addCriterion("sys_user_group_mapping_id <>", value, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdGreaterThan(Long value) {
            addCriterion("sys_user_group_mapping_id >", value, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user_group_mapping_id >=", value, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdLessThan(Long value) {
            addCriterion("sys_user_group_mapping_id <", value, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user_group_mapping_id <=", value, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdIn(List<Long> values) {
            addCriterion("sys_user_group_mapping_id in", values, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdNotIn(List<Long> values) {
            addCriterion("sys_user_group_mapping_id not in", values, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdBetween(Long value1, Long value2) {
            addCriterion("sys_user_group_mapping_id between", value1, value2, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupMappingIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user_group_mapping_id not between", value1, value2, "sysUserGroupMappingId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdIsNull() {
            addCriterion("sys_user_group_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdIsNotNull() {
            addCriterion("sys_user_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdEqualTo(Long value) {
            addCriterion("sys_user_group_id =", value, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdNotEqualTo(Long value) {
            addCriterion("sys_user_group_id <>", value, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdGreaterThan(Long value) {
            addCriterion("sys_user_group_id >", value, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user_group_id >=", value, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdLessThan(Long value) {
            addCriterion("sys_user_group_id <", value, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user_group_id <=", value, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdIn(List<Long> values) {
            addCriterion("sys_user_group_id in", values, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdNotIn(List<Long> values) {
            addCriterion("sys_user_group_id not in", values, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdBetween(Long value1, Long value2) {
            addCriterion("sys_user_group_id between", value1, value2, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user_group_id not between", value1, value2, "sysUserGroupId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(Long value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(Long value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(Long value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(Long value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<Long> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<Long> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(Long value1, Long value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user_id not between", value1, value2, "sysUserId");
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