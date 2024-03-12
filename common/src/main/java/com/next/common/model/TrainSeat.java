package com.next.model;

import java.io.Serializable;
import java.util.Date;

public class TrainSeat implements Serializable {
    private Long id;

    private String ticket;

    private Long userId;

    private Long travellerId;

    private Integer trainNumId;

    private Integer carriageNum;

    private Integer rowNum;

    private Integer seatNum;

    private Integer seatLevel;

    private Date trainStart;

    private Date trainEnd;

    private Integer money;

    private String showNum;

    private Integer status;

    private Integer fromStarionId;

    private Integer toStationId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
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

    public Integer getFromStarionId() {
        return fromStarionId;
    }

    public void setFromStarionId(Integer fromStarionId) {
        this.fromStarionId = fromStarionId;
    }

    public Integer getToStationId() {
        return toStationId;
    }

    public void setToStationId(Integer toStationId) {
        this.toStationId = toStationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ticket=").append(ticket);
        sb.append(", userId=").append(userId);
        sb.append(", travellerId=").append(travellerId);
        sb.append(", trainNumId=").append(trainNumId);
        sb.append(", carriageNum=").append(carriageNum);
        sb.append(", rowNum=").append(rowNum);
        sb.append(", seatNum=").append(seatNum);
        sb.append(", seatLevel=").append(seatLevel);
        sb.append(", trainStart=").append(trainStart);
        sb.append(", trainEnd=").append(trainEnd);
        sb.append(", money=").append(money);
        sb.append(", showNum=").append(showNum);
        sb.append(", status=").append(status);
        sb.append(", fromStarionId=").append(fromStarionId);
        sb.append(", toStationId=").append(toStationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}