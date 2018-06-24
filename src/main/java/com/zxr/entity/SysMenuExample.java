package com.zxr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

        public Criteria andMeunCodeIsNull() {
            addCriterion("meun_code is null");
            return (Criteria) this;
        }

        public Criteria andMeunCodeIsNotNull() {
            addCriterion("meun_code is not null");
            return (Criteria) this;
        }

        public Criteria andMeunCodeEqualTo(String value) {
            addCriterion("meun_code =", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeNotEqualTo(String value) {
            addCriterion("meun_code <>", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeGreaterThan(String value) {
            addCriterion("meun_code >", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeGreaterThanOrEqualTo(String value) {
            addCriterion("meun_code >=", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeLessThan(String value) {
            addCriterion("meun_code <", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeLessThanOrEqualTo(String value) {
            addCriterion("meun_code <=", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeLike(String value) {
            addCriterion("meun_code like", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeNotLike(String value) {
            addCriterion("meun_code not like", value, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeIn(List<String> values) {
            addCriterion("meun_code in", values, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeNotIn(List<String> values) {
            addCriterion("meun_code not in", values, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeBetween(String value1, String value2) {
            addCriterion("meun_code between", value1, value2, "meunCode");
            return (Criteria) this;
        }

        public Criteria andMeunCodeNotBetween(String value1, String value2) {
            addCriterion("meun_code not between", value1, value2, "meunCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeIsNull() {
            addCriterion("parent_menu_code is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeIsNotNull() {
            addCriterion("parent_menu_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeEqualTo(String value) {
            addCriterion("parent_menu_code =", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeNotEqualTo(String value) {
            addCriterion("parent_menu_code <>", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeGreaterThan(String value) {
            addCriterion("parent_menu_code >", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_menu_code >=", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeLessThan(String value) {
            addCriterion("parent_menu_code <", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_menu_code <=", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeLike(String value) {
            addCriterion("parent_menu_code like", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeNotLike(String value) {
            addCriterion("parent_menu_code not like", value, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeIn(List<String> values) {
            addCriterion("parent_menu_code in", values, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeNotIn(List<String> values) {
            addCriterion("parent_menu_code not in", values, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeBetween(String value1, String value2) {
            addCriterion("parent_menu_code between", value1, value2, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andParentMenuCodeNotBetween(String value1, String value2) {
            addCriterion("parent_menu_code not between", value1, value2, "parentMenuCode");
            return (Criteria) this;
        }

        public Criteria andMeunNameIsNull() {
            addCriterion("meun_name is null");
            return (Criteria) this;
        }

        public Criteria andMeunNameIsNotNull() {
            addCriterion("meun_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeunNameEqualTo(String value) {
            addCriterion("meun_name =", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotEqualTo(String value) {
            addCriterion("meun_name <>", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameGreaterThan(String value) {
            addCriterion("meun_name >", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameGreaterThanOrEqualTo(String value) {
            addCriterion("meun_name >=", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameLessThan(String value) {
            addCriterion("meun_name <", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameLessThanOrEqualTo(String value) {
            addCriterion("meun_name <=", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameLike(String value) {
            addCriterion("meun_name like", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotLike(String value) {
            addCriterion("meun_name not like", value, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameIn(List<String> values) {
            addCriterion("meun_name in", values, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotIn(List<String> values) {
            addCriterion("meun_name not in", values, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameBetween(String value1, String value2) {
            addCriterion("meun_name between", value1, value2, "meunName");
            return (Criteria) this;
        }

        public Criteria andMeunNameNotBetween(String value1, String value2) {
            addCriterion("meun_name not between", value1, value2, "meunName");
            return (Criteria) this;
        }

        public Criteria andFaIsNull() {
            addCriterion("fa is null");
            return (Criteria) this;
        }

        public Criteria andFaIsNotNull() {
            addCriterion("fa is not null");
            return (Criteria) this;
        }

        public Criteria andFaEqualTo(String value) {
            addCriterion("fa =", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotEqualTo(String value) {
            addCriterion("fa <>", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaGreaterThan(String value) {
            addCriterion("fa >", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaGreaterThanOrEqualTo(String value) {
            addCriterion("fa >=", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaLessThan(String value) {
            addCriterion("fa <", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaLessThanOrEqualTo(String value) {
            addCriterion("fa <=", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaLike(String value) {
            addCriterion("fa like", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotLike(String value) {
            addCriterion("fa not like", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaIn(List<String> values) {
            addCriterion("fa in", values, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotIn(List<String> values) {
            addCriterion("fa not in", values, "fa");
            return (Criteria) this;
        }

        public Criteria andFaBetween(String value1, String value2) {
            addCriterion("fa between", value1, value2, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotBetween(String value1, String value2) {
            addCriterion("fa not between", value1, value2, "fa");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNull() {
            addCriterion("sort_index is null");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNotNull() {
            addCriterion("sort_index is not null");
            return (Criteria) this;
        }

        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("sort_index =", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("sort_index <>", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("sort_index >", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_index >=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("sort_index <", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("sort_index <=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexIn(List<Integer> values) {
            addCriterion("sort_index in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotIn(List<Integer> values) {
            addCriterion("sort_index not in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("sort_index between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_index not between", value1, value2, "sortIndex");
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

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
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