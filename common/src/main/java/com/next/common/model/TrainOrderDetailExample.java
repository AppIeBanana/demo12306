package com.next.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainOrderDetailExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIsNull() {
            addCriterion("parent_order_id is null");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIsNotNull() {
            addCriterion("parent_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdEqualTo(String value) {
            addCriterion("parent_order_id =", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotEqualTo(String value) {
            addCriterion("parent_order_id <>", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdGreaterThan(String value) {
            addCriterion("parent_order_id >", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_order_id >=", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLessThan(String value) {
            addCriterion("parent_order_id <", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLessThanOrEqualTo(String value) {
            addCriterion("parent_order_id <=", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLike(String value) {
            addCriterion("parent_order_id like", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotLike(String value) {
            addCriterion("parent_order_id not like", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIn(List<String> values) {
            addCriterion("parent_order_id in", values, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotIn(List<String> values) {
            addCriterion("parent_order_id not in", values, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdBetween(String value1, String value2) {
            addCriterion("parent_order_id between", value1, value2, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotBetween(String value1, String value2) {
            addCriterion("parent_order_id not between", value1, value2, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andTicketIsNull() {
            addCriterion("ticket is null");
            return (Criteria) this;
        }

        public Criteria andTicketIsNotNull() {
            addCriterion("ticket is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEqualTo(String value) {
            addCriterion("ticket =", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotEqualTo(String value) {
            addCriterion("ticket <>", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThan(String value) {
            addCriterion("ticket >", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThanOrEqualTo(String value) {
            addCriterion("ticket >=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThan(String value) {
            addCriterion("ticket <", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThanOrEqualTo(String value) {
            addCriterion("ticket <=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLike(String value) {
            addCriterion("ticket like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotLike(String value) {
            addCriterion("ticket not like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketIn(List<String> values) {
            addCriterion("ticket in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotIn(List<String> values) {
            addCriterion("ticket not in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketBetween(String value1, String value2) {
            addCriterion("ticket between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotBetween(String value1, String value2) {
            addCriterion("ticket not between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdIsNull() {
            addCriterion("traveller_id is null");
            return (Criteria) this;
        }

        public Criteria andTravellerIdIsNotNull() {
            addCriterion("traveller_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravellerIdEqualTo(Long value) {
            addCriterion("traveller_id =", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdNotEqualTo(Long value) {
            addCriterion("traveller_id <>", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdGreaterThan(Long value) {
            addCriterion("traveller_id >", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("traveller_id >=", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdLessThan(Long value) {
            addCriterion("traveller_id <", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdLessThanOrEqualTo(Long value) {
            addCriterion("traveller_id <=", value, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdIn(List<Long> values) {
            addCriterion("traveller_id in", values, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdNotIn(List<Long> values) {
            addCriterion("traveller_id not in", values, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdBetween(Long value1, Long value2) {
            addCriterion("traveller_id between", value1, value2, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTravellerIdNotBetween(Long value1, Long value2) {
            addCriterion("traveller_id not between", value1, value2, "travellerId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdIsNull() {
            addCriterion("train_num_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdIsNotNull() {
            addCriterion("train_num_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdEqualTo(Integer value) {
            addCriterion("train_num_id =", value, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdNotEqualTo(Integer value) {
            addCriterion("train_num_id <>", value, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdGreaterThan(Integer value) {
            addCriterion("train_num_id >", value, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_num_id >=", value, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdLessThan(Integer value) {
            addCriterion("train_num_id <", value, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdLessThanOrEqualTo(Integer value) {
            addCriterion("train_num_id <=", value, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdIn(List<Integer> values) {
            addCriterion("train_num_id in", values, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdNotIn(List<Integer> values) {
            addCriterion("train_num_id not in", values, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdBetween(Integer value1, Integer value2) {
            addCriterion("train_num_id between", value1, value2, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andTrainNumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("train_num_id not between", value1, value2, "trainNumId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdIsNull() {
            addCriterion("from_station_id is null");
            return (Criteria) this;
        }

        public Criteria andFromStationIdIsNotNull() {
            addCriterion("from_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromStationIdEqualTo(Integer value) {
            addCriterion("from_station_id =", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdNotEqualTo(Integer value) {
            addCriterion("from_station_id <>", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdGreaterThan(Integer value) {
            addCriterion("from_station_id >", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_station_id >=", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdLessThan(Integer value) {
            addCriterion("from_station_id <", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_station_id <=", value, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdIn(List<Integer> values) {
            addCriterion("from_station_id in", values, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdNotIn(List<Integer> values) {
            addCriterion("from_station_id not in", values, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdBetween(Integer value1, Integer value2) {
            addCriterion("from_station_id between", value1, value2, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andFromStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_station_id not between", value1, value2, "fromStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdIsNull() {
            addCriterion("to_station_id is null");
            return (Criteria) this;
        }

        public Criteria andToStationIdIsNotNull() {
            addCriterion("to_station_id is not null");
            return (Criteria) this;
        }

        public Criteria andToStationIdEqualTo(Integer value) {
            addCriterion("to_station_id =", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotEqualTo(Integer value) {
            addCriterion("to_station_id <>", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdGreaterThan(Integer value) {
            addCriterion("to_station_id >", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_station_id >=", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLessThan(Integer value) {
            addCriterion("to_station_id <", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_station_id <=", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdIn(List<Integer> values) {
            addCriterion("to_station_id in", values, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotIn(List<Integer> values) {
            addCriterion("to_station_id not in", values, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdBetween(Integer value1, Integer value2) {
            addCriterion("to_station_id between", value1, value2, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_station_id not between", value1, value2, "toStationId");
            return (Criteria) this;
        }

        public Criteria andCarriageNumIsNull() {
            addCriterion("carriage_num is null");
            return (Criteria) this;
        }

        public Criteria andCarriageNumIsNotNull() {
            addCriterion("carriage_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageNumEqualTo(Integer value) {
            addCriterion("carriage_num =", value, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumNotEqualTo(Integer value) {
            addCriterion("carriage_num <>", value, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumGreaterThan(Integer value) {
            addCriterion("carriage_num >", value, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("carriage_num >=", value, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumLessThan(Integer value) {
            addCriterion("carriage_num <", value, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumLessThanOrEqualTo(Integer value) {
            addCriterion("carriage_num <=", value, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumIn(List<Integer> values) {
            addCriterion("carriage_num in", values, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumNotIn(List<Integer> values) {
            addCriterion("carriage_num not in", values, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumBetween(Integer value1, Integer value2) {
            addCriterion("carriage_num between", value1, value2, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andCarriageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("carriage_num not between", value1, value2, "carriageNum");
            return (Criteria) this;
        }

        public Criteria andRowNumIsNull() {
            addCriterion("row_num is null");
            return (Criteria) this;
        }

        public Criteria andRowNumIsNotNull() {
            addCriterion("row_num is not null");
            return (Criteria) this;
        }

        public Criteria andRowNumEqualTo(Integer value) {
            addCriterion("row_num =", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotEqualTo(Integer value) {
            addCriterion("row_num <>", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumGreaterThan(Integer value) {
            addCriterion("row_num >", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_num >=", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumLessThan(Integer value) {
            addCriterion("row_num <", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumLessThanOrEqualTo(Integer value) {
            addCriterion("row_num <=", value, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumIn(List<Integer> values) {
            addCriterion("row_num in", values, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotIn(List<Integer> values) {
            addCriterion("row_num not in", values, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumBetween(Integer value1, Integer value2) {
            addCriterion("row_num between", value1, value2, "rowNum");
            return (Criteria) this;
        }

        public Criteria andRowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("row_num not between", value1, value2, "rowNum");
            return (Criteria) this;
        }

        public Criteria andSetNumIsNull() {
            addCriterion("set_num is null");
            return (Criteria) this;
        }

        public Criteria andSetNumIsNotNull() {
            addCriterion("set_num is not null");
            return (Criteria) this;
        }

        public Criteria andSetNumEqualTo(Integer value) {
            addCriterion("set_num =", value, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumNotEqualTo(Integer value) {
            addCriterion("set_num <>", value, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumGreaterThan(Integer value) {
            addCriterion("set_num >", value, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_num >=", value, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumLessThan(Integer value) {
            addCriterion("set_num <", value, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumLessThanOrEqualTo(Integer value) {
            addCriterion("set_num <=", value, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumIn(List<Integer> values) {
            addCriterion("set_num in", values, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumNotIn(List<Integer> values) {
            addCriterion("set_num not in", values, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumBetween(Integer value1, Integer value2) {
            addCriterion("set_num between", value1, value2, "setNum");
            return (Criteria) this;
        }

        public Criteria andSetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("set_num not between", value1, value2, "setNum");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIsNull() {
            addCriterion("seat_level is null");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIsNotNull() {
            addCriterion("seat_level is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLevelEqualTo(Integer value) {
            addCriterion("seat_level =", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotEqualTo(Integer value) {
            addCriterion("seat_level <>", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelGreaterThan(Integer value) {
            addCriterion("seat_level >", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_level >=", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelLessThan(Integer value) {
            addCriterion("seat_level <", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelLessThanOrEqualTo(Integer value) {
            addCriterion("seat_level <=", value, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelIn(List<Integer> values) {
            addCriterion("seat_level in", values, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotIn(List<Integer> values) {
            addCriterion("seat_level not in", values, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelBetween(Integer value1, Integer value2) {
            addCriterion("seat_level between", value1, value2, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andSeatLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_level not between", value1, value2, "seatLevel");
            return (Criteria) this;
        }

        public Criteria andTrainStartIsNull() {
            addCriterion("train_start is null");
            return (Criteria) this;
        }

        public Criteria andTrainStartIsNotNull() {
            addCriterion("train_start is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStartEqualTo(Date value) {
            addCriterion("train_start =", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartNotEqualTo(Date value) {
            addCriterion("train_start <>", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartGreaterThan(Date value) {
            addCriterion("train_start >", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartGreaterThanOrEqualTo(Date value) {
            addCriterion("train_start >=", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartLessThan(Date value) {
            addCriterion("train_start <", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartLessThanOrEqualTo(Date value) {
            addCriterion("train_start <=", value, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartIn(List<Date> values) {
            addCriterion("train_start in", values, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartNotIn(List<Date> values) {
            addCriterion("train_start not in", values, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartBetween(Date value1, Date value2) {
            addCriterion("train_start between", value1, value2, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainStartNotBetween(Date value1, Date value2) {
            addCriterion("train_start not between", value1, value2, "trainStart");
            return (Criteria) this;
        }

        public Criteria andTrainEndIsNull() {
            addCriterion("train_end is null");
            return (Criteria) this;
        }

        public Criteria andTrainEndIsNotNull() {
            addCriterion("train_end is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEndEqualTo(Date value) {
            addCriterion("train_end =", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotEqualTo(Date value) {
            addCriterion("train_end <>", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndGreaterThan(Date value) {
            addCriterion("train_end >", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndGreaterThanOrEqualTo(Date value) {
            addCriterion("train_end >=", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndLessThan(Date value) {
            addCriterion("train_end <", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndLessThanOrEqualTo(Date value) {
            addCriterion("train_end <=", value, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndIn(List<Date> values) {
            addCriterion("train_end in", values, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotIn(List<Date> values) {
            addCriterion("train_end not in", values, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndBetween(Date value1, Date value2) {
            addCriterion("train_end between", value1, value2, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andTrainEndNotBetween(Date value1, Date value2) {
            addCriterion("train_end not between", value1, value2, "trainEnd");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andShowNumIsNull() {
            addCriterion("show_num is null");
            return (Criteria) this;
        }

        public Criteria andShowNumIsNotNull() {
            addCriterion("show_num is not null");
            return (Criteria) this;
        }

        public Criteria andShowNumEqualTo(String value) {
            addCriterion("show_num =", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumNotEqualTo(String value) {
            addCriterion("show_num <>", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumGreaterThan(String value) {
            addCriterion("show_num >", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumGreaterThanOrEqualTo(String value) {
            addCriterion("show_num >=", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumLessThan(String value) {
            addCriterion("show_num <", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumLessThanOrEqualTo(String value) {
            addCriterion("show_num <=", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumLike(String value) {
            addCriterion("show_num like", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumNotLike(String value) {
            addCriterion("show_num not like", value, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumIn(List<String> values) {
            addCriterion("show_num in", values, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumNotIn(List<String> values) {
            addCriterion("show_num not in", values, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumBetween(String value1, String value2) {
            addCriterion("show_num between", value1, value2, "showNum");
            return (Criteria) this;
        }

        public Criteria andShowNumNotBetween(String value1, String value2) {
            addCriterion("show_num not between", value1, value2, "showNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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