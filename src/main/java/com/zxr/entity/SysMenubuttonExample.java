package com.zxr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenubuttonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenubuttonExample() {
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

        public Criteria andButtonNameIsNull() {
            addCriterion("button_name is null");
            return (Criteria) this;
        }

        public Criteria andButtonNameIsNotNull() {
            addCriterion("button_name is not null");
            return (Criteria) this;
        }

        public Criteria andButtonNameEqualTo(String value) {
            addCriterion("button_name =", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotEqualTo(String value) {
            addCriterion("button_name <>", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameGreaterThan(String value) {
            addCriterion("button_name >", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameGreaterThanOrEqualTo(String value) {
            addCriterion("button_name >=", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLessThan(String value) {
            addCriterion("button_name <", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLessThanOrEqualTo(String value) {
            addCriterion("button_name <=", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameLike(String value) {
            addCriterion("button_name like", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotLike(String value) {
            addCriterion("button_name not like", value, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameIn(List<String> values) {
            addCriterion("button_name in", values, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotIn(List<String> values) {
            addCriterion("button_name not in", values, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameBetween(String value1, String value2) {
            addCriterion("button_name between", value1, value2, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonNameNotBetween(String value1, String value2) {
            addCriterion("button_name not between", value1, value2, "buttonName");
            return (Criteria) this;
        }

        public Criteria andButtonCodeIsNull() {
            addCriterion("button_code is null");
            return (Criteria) this;
        }

        public Criteria andButtonCodeIsNotNull() {
            addCriterion("button_code is not null");
            return (Criteria) this;
        }

        public Criteria andButtonCodeEqualTo(String value) {
            addCriterion("button_code =", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotEqualTo(String value) {
            addCriterion("button_code <>", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeGreaterThan(String value) {
            addCriterion("button_code >", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("button_code >=", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeLessThan(String value) {
            addCriterion("button_code <", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeLessThanOrEqualTo(String value) {
            addCriterion("button_code <=", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeLike(String value) {
            addCriterion("button_code like", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotLike(String value) {
            addCriterion("button_code not like", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeIn(List<String> values) {
            addCriterion("button_code in", values, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotIn(List<String> values) {
            addCriterion("button_code not in", values, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeBetween(String value1, String value2) {
            addCriterion("button_code between", value1, value2, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotBetween(String value1, String value2) {
            addCriterion("button_code not between", value1, value2, "buttonCode");
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

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andHtmlIsNull() {
            addCriterion("html is null");
            return (Criteria) this;
        }

        public Criteria andHtmlIsNotNull() {
            addCriterion("html is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlEqualTo(String value) {
            addCriterion("html =", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotEqualTo(String value) {
            addCriterion("html <>", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlGreaterThan(String value) {
            addCriterion("html >", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("html >=", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLessThan(String value) {
            addCriterion("html <", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLessThanOrEqualTo(String value) {
            addCriterion("html <=", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlLike(String value) {
            addCriterion("html like", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotLike(String value) {
            addCriterion("html not like", value, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlIn(List<String> values) {
            addCriterion("html in", values, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotIn(List<String> values) {
            addCriterion("html not in", values, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlBetween(String value1, String value2) {
            addCriterion("html between", value1, value2, "html");
            return (Criteria) this;
        }

        public Criteria andHtmlNotBetween(String value1, String value2) {
            addCriterion("html not between", value1, value2, "html");
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