package com.example.home_devices.dto;

public class DeviceRequest {
    private Long id;
    private String name;
    private String type;

    public DeviceRequest() {
    } // Unutma

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }


}