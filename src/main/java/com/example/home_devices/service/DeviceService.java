package com.example.home_devices.service;

import com.example.home_devices.dto.DeviceRequest;
import com.example.home_devices.exception.DeviceNotFoundException;
import com.example.home_devices.model.Device;
import com.example.home_devices.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device addDevice(DeviceRequest request) {
        Device newDevice = new Device();
        newDevice.setName(request.getName());
        newDevice.setType(request.getType());
        newDevice.setId(request.getId());
        newDevice.setStatus(false);

        return deviceRepository.save(newDevice);
    }

    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }



    public void deleteDevice(Long id) {
        deviceRepository.findById(id)
                .orElseThrow(() -> new DeviceNotFoundException("Cihaz bulunamadı! ID: " + id));

        deviceRepository.deleteById(id);
    }

}