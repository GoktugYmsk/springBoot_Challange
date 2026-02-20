package com.example.home_devices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "devices")
public class Device {
    @Id
    private String id;
    private String name;     // "Salon Lambası"
    private String type;     // "LIGHT", "AC", "TV"
    private boolean status;   // true: açık, false: kapalı


    public Device() {
    }

    public Device(String id, String name, String type, boolean status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId(){
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
