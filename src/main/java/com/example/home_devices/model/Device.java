package com.example.home_devices.model;

public class Device {
    private Long id;
    private String name;     // "Salon Lambası"
    private String type;     // "LIGHT", "AC", "TV"
    private boolean status;   // true: açık, false: kapalı


    public Device() {
    }

    public Device(Long id, String name, String type, boolean status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId(){
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
