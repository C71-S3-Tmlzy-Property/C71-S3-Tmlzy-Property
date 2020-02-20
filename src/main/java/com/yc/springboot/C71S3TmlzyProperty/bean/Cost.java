package com.yc.springboot.C71S3TmlzyProperty.bean;

public class Cost {
    private Integer id;

    private String name;

    private Double sumPayable;

    private String paymentCycle;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getSumPayable() {
        return sumPayable;
    }

    public void setSumPayable(Double sumPayable) {
        this.sumPayable = sumPayable;
    }

    public String getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(String paymentCycle) {
        this.paymentCycle = paymentCycle == null ? null : paymentCycle.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}