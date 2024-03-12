package com.next.model;

import java.io.Serializable;
import java.util.Date;

public class TrainOrderDetail implements Serializable {
    private Long id;

    private String orderId;

    private String parentOrderId;

    private String ticket;

    private Long userId;

    private Long travellerId;

    private Integer trainNumId;

    private Integer fromStationId;

    private Integer toStationId;

    private Integer carriageNum;

    private Integer rowNum;

    private Integer setNum;

    private Integer seatLevel;

    private Date trainStart;

    private Date trainEnd;

    private Integer money;

    private String showNum;

    private Integer status;

    private Date createTime;

    private Date expireTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId == null ? null : parentOrderId.trim();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTravellerId() {
        return travellerId;
    }

    public void setTravellerId(Long travellerId) {
        this.travellerId = travellerId;
    }

    public Integer getTrainNumId() {
        return trainNumId;
    }

    public void setTrainNumId(Integer trainNumId) {
        this.trainNumId = trainNumId;
    }

    public Integer getFromStationId() {
        return fromStationId;
    }

    public void setFromStationId(Integer fromStationId) {
        this.fromStationId = fromStationId;
    }

    public Integer getToStationId() {
        return toStationId;
    }

    public void setToStationId(Integer toStationId) {
        this.toStationId = toStationId;
    }

    public Integer getCarriageNum() {
        return carriageNum;
    }

    public void setCarriageNum(Integer carriageNum) {
        this.carriageNum = carriageNum;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public Integer getSetNum() {
        return setNum;
    }

    public void setSetNum(Integer setNum) {
        this.setNum = setNum;
    }

    public Integer getSeatLevel() {
        return seatLevel;
    }

    public void setSeatLevel(Integer seatLevel) {
        this.seatLevel = seatLevel;
    }

    public Date getTrainStart() {
        return trainStart;
    }

    public void setTrainStart(Date trainStart) {
        this.trainStart = trainStart;
    }

    public Date getTrainEnd() {
        return trainEnd;
    }

    public void setTrainEnd(Date trainEnd) {
        this.trainEnd = trainEnd;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getShowNum() {
        return showNum;
    }

    public void setShowNum(String showNum) {
        this.showNum = showNum == null ? null : showNum.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", parentOrderId=").append(parentOrderId);
        sb.append(", ticket=").append(ticket);
        sb.append(", userId=").append(userId);
        sb.append(", travellerId=").append(travellerId);
        sb.append(", trainNumId=").append(trainNumId);
        sb.append(", fromStationId=").append(fromStationId);
        sb.append(", toStationId=").append(toStationId);
        sb.append(", carriageNum=").append(carriageNum);
        sb.append(", rowNum=").append(rowNum);
        sb.append(", setNum=").append(setNum);
        sb.append(", seatLevel=").append(seatLevel);
        sb.append(", trainStart=").append(trainStart);
        sb.append(", trainEnd=").append(trainEnd);
        sb.append(", money=").append(money);
        sb.append(", showNum=").append(showNum);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}