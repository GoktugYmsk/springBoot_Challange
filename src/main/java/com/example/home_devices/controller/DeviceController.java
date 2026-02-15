package com.example.home_devices.controller;

import com.example.home_devices.dto.DeviceRequest;
import com.example.home_devices.model.Device;
import com.example.home_devices.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }



    // POST http://localhost:8080/api/devices
    @PostMapping
    public Device create(@RequestBody DeviceRequest request) {
        return deviceService.addDevice(request);
    }


//    @PostMapping
//    public Task createTask(@RequestBody TaskRequest request) {
//        return taskService.createTask(request);
//    }

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

//    @GetMapping("/{id}")
//    public Task getTaskGkt(@PathVariable Long id) {
//        return taskService.getTaskById(id);
//    }
//
//    @GetMapping("/title/{taskTitle}")
//    public Task getTaskGktName(@PathVariable String taskTitle) {
//        return taskService.findTaskByTitle(taskTitle);
//    }


    // DeviceController.java içine ekle
    @DeleteMapping("/{id}") // URL: http://localhost:8080/api/devices/1
    public String delete(@PathVariable Long id) {
        deviceService.deleteDevice(id);
        return id + " numaralı cihaz başarıyla silindi.";
    }
}
