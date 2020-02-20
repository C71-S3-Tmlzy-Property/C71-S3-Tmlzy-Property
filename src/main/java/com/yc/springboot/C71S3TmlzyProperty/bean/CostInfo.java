package com.yc.springboot.C71S3TmlzyProperty.bean;

import java.util.Date;

public class CostInfo {
    private Integer id;

    private Integer costId;

    private Integer owneId;

    private Date paymentTime;

    private Integer paymentAmount;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public Integer getOwneId() {
        return owneId;
    }

    public void setOwneId(Integer owneId) {
        this.owneId = owneId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}