package com.example.home_devices.dto;

import org.springframework.data.annotation.Id;

public class DeviceRequest {
    @Id
    private String id;
    private String name;
    private String type;

    public DeviceRequest() {
    } // Unutma

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
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