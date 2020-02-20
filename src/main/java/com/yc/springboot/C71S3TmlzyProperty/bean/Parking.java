package com.yc.springboot.C71S3TmlzyProperty.bean;

public class Parking {
    private Integer id;

    private String name;

    private Integer garaId;

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

    public Integer getGaraId() {
        return garaId;
    }

    public void setGaraId(Integer garaId) {
        this.garaId = garaId;
    }
}