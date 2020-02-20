package com.yc.springboot.C71S3TmlzyProperty.bean;

public class Garage {
    private Integer id;

    private String name;

    private Integer villId;

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

    public Integer getVillId() {
        return villId;
    }

    public void setVillId(Integer villId) {
        this.villId = villId;
    }
}