package com.salesmanager.shop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LanguageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public LanguageExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
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
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andLANGUAGE_IDIsNull() {
            addCriterion("LANGUAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDIsNotNull() {
            addCriterion("LANGUAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDEqualTo(Integer value) {
            addCriterion("LANGUAGE_ID =", value, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDNotEqualTo(Integer value) {
            addCriterion("LANGUAGE_ID <>", value, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDGreaterThan(Integer value) {
            addCriterion("LANGUAGE_ID >", value, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("LANGUAGE_ID >=", value, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDLessThan(Integer value) {
            addCriterion("LANGUAGE_ID <", value, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDLessThanOrEqualTo(Integer value) {
            addCriterion("LANGUAGE_ID <=", value, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDIn(List<Integer> values) {
            addCriterion("LANGUAGE_ID in", values, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDNotIn(List<Integer> values) {
            addCriterion("LANGUAGE_ID not in", values, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDBetween(Integer value1, Integer value2) {
            addCriterion("LANGUAGE_ID between", value1, value2, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andLANGUAGE_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("LANGUAGE_ID not between", value1, value2, "LANGUAGE_ID");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDIsNull() {
            addCriterion("DATE_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDIsNotNull() {
            addCriterion("DATE_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDEqualTo(Date value) {
            addCriterion("DATE_CREATED =", value, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDNotEqualTo(Date value) {
            addCriterion("DATE_CREATED <>", value, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDGreaterThan(Date value) {
            addCriterion("DATE_CREATED >", value, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATED >=", value, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDLessThan(Date value) {
            addCriterion("DATE_CREATED <", value, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDLessThanOrEqualTo(Date value) {
            addCriterion("DATE_CREATED <=", value, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDIn(List<Date> values) {
            addCriterion("DATE_CREATED in", values, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDNotIn(List<Date> values) {
            addCriterion("DATE_CREATED not in", values, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATED between", value1, value2, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_CREATEDNotBetween(Date value1, Date value2) {
            addCriterion("DATE_CREATED not between", value1, value2, "DATE_CREATED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDIsNull() {
            addCriterion("DATE_MODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDIsNotNull() {
            addCriterion("DATE_MODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDEqualTo(Date value) {
            addCriterion("DATE_MODIFIED =", value, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDNotEqualTo(Date value) {
            addCriterion("DATE_MODIFIED <>", value, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDGreaterThan(Date value) {
            addCriterion("DATE_MODIFIED >", value, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_MODIFIED >=", value, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDLessThan(Date value) {
            addCriterion("DATE_MODIFIED <", value, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDLessThanOrEqualTo(Date value) {
            addCriterion("DATE_MODIFIED <=", value, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDIn(List<Date> values) {
            addCriterion("DATE_MODIFIED in", values, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDNotIn(List<Date> values) {
            addCriterion("DATE_MODIFIED not in", values, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDBetween(Date value1, Date value2) {
            addCriterion("DATE_MODIFIED between", value1, value2, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andDATE_MODIFIEDNotBetween(Date value1, Date value2) {
            addCriterion("DATE_MODIFIED not between", value1, value2, "DATE_MODIFIED");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDIsNull() {
            addCriterion("UPDT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDIsNotNull() {
            addCriterion("UPDT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDEqualTo(String value) {
            addCriterion("UPDT_ID =", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDNotEqualTo(String value) {
            addCriterion("UPDT_ID <>", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDGreaterThan(String value) {
            addCriterion("UPDT_ID >", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("UPDT_ID >=", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDLessThan(String value) {
            addCriterion("UPDT_ID <", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDLessThanOrEqualTo(String value) {
            addCriterion("UPDT_ID <=", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDLike(String value) {
            addCriterion("UPDT_ID like", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDNotLike(String value) {
            addCriterion("UPDT_ID not like", value, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDIn(List<String> values) {
            addCriterion("UPDT_ID in", values, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDNotIn(List<String> values) {
            addCriterion("UPDT_ID not in", values, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDBetween(String value1, String value2) {
            addCriterion("UPDT_ID between", value1, value2, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andUPDT_IDNotBetween(String value1, String value2) {
            addCriterion("UPDT_ID not between", value1, value2, "UPDT_ID");
            return (Criteria) this;
        }

        public Criteria andCODEIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCODEIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCODEEqualTo(String value) {
            addCriterion("CODE =", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotEqualTo(String value) {
            addCriterion("CODE <>", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThan(String value) {
            addCriterion("CODE >", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThan(String value) {
            addCriterion("CODE <", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELike(String value) {
            addCriterion("CODE like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotLike(String value) {
            addCriterion("CODE not like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEIn(List<String> values) {
            addCriterion("CODE in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotIn(List<String> values) {
            addCriterion("CODE not in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERIsNull() {
            addCriterion("SORT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERIsNotNull() {
            addCriterion("SORT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDEREqualTo(Integer value) {
            addCriterion("SORT_ORDER =", value, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERNotEqualTo(Integer value) {
            addCriterion("SORT_ORDER <>", value, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERGreaterThan(Integer value) {
            addCriterion("SORT_ORDER >", value, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_ORDER >=", value, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERLessThan(Integer value) {
            addCriterion("SORT_ORDER <", value, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_ORDER <=", value, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERIn(List<Integer> values) {
            addCriterion("SORT_ORDER in", values, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERNotIn(List<Integer> values) {
            addCriterion("SORT_ORDER not in", values, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ORDER between", value1, value2, "SORT_ORDER");
            return (Criteria) this;
        }

        public Criteria andSORT_ORDERNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ORDER not between", value1, value2, "SORT_ORDER");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LANGUAGE
     *
     * @mbg.generated do_not_delete_during_merge Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
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