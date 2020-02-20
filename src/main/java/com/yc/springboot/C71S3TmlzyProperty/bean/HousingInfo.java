package com.yc.springboot.C71S3TmlzyProperty.bean;

import java.util.Date;

public class HousingInfo {
    private Integer id;

    private Integer housId;

    private Integer owneId;

    private Integer status;

    private Date moveIntoTime;

    private Date moveOutTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHousId() {
        return housId;
    }

    public void setHousId(Integer housId) {
        this.housId = housId;
    }

    public Integer getOwneId() {
        return owneId;
    }

    public void setOwneId(Integer owneId) {
        this.owneId = owneId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getMoveIntoTime() {
        return moveIntoTime;
    }

    public void setMoveIntoTime(Date moveIntoTime) {
        this.moveIntoTime = moveIntoTime;
    }

    public Date getMoveOutTime() {
        return moveOutTime;
    }

    public void setMoveOutTime(Date moveOutTime) {
        this.moveOutTime = moveOutTime;
    }
}