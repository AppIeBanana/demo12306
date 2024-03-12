package com.next.model;

import java.io.Serializable;

public class TrainNumDetail implements Serializable {
    private Integer id;

    private Integer trainNumId;

    private Integer fromStationId;

    private Integer fromCityId;

    private Integer toStationId;

    private Integer toCityId;

    private Integer stationIndex;

    private Integer relativeMinute;

    private Integer waitMinute;

    private String money;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFromCityId() {
        return fromCityId;
    }

    public void setFromCityId(Integer fromCityId) {
        this.fromCityId = fromCityId;
    }

    public Integer getToStationId() {
        return toStationId;
    }

    public void setToStationId(Integer toStationId) {
        this.toStationId = toStationId;
    }

    public Integer getToCityId() {
        return toCityId;
    }

    public void setToCityId(Integer toCityId) {
        this.toCityId = toCityId;
    }

    public Integer getStationIndex() {
        return stationIndex;
    }

    public void setStationIndex(Integer stationIndex) {
        this.stationIndex = stationIndex;
    }

    public Integer getRelativeMinute() {
        return relativeMinute;
    }

    public void setRelativeMinute(Integer relativeMinute) {
        this.relativeMinute = relativeMinute;
    }

    public Integer getWaitMinute() {
        return waitMinute;
    }

    public void setWaitMinute(Integer waitMinute) {
        this.waitMinute = waitMinute;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", trainNumId=").append(trainNumId);
        sb.append(", fromStationId=").append(fromStationId);
        sb.append(", fromCityId=").append(fromCityId);
        sb.append(", toStationId=").append(toStationId);
        sb.append(", toCityId=").append(toCityId);
        sb.append(", stationIndex=").append(stationIndex);
        sb.append(", relativeMinute=").append(relativeMinute);
        sb.append(", waitMinute=").append(waitMinute);
        sb.append(", money=").append(money);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}