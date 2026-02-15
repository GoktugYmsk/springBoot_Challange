package com.example.home_devices.repository;

import com.example.home_devices.model.Device;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DeviceRepository {
    private final List<Device> devices = new ArrayList<>();
    private long idCounter = 1;


    public Device save(Device device) {
        device.setId(idCounter++);
        devices.add(device);
        return device;
    }

    public List<Device> findAll() {
        return devices;
    }

    // DeviceRepository.java içine ekle
    public boolean deleteById(Long id) {
        // removeIf: Listeyi tarar, ID'si uyanı bulur ve siler.
        // Silme işlemi gerçekleşirse true döner.
        return devices.removeIf(device -> device.getId().equals(id));
    }


    public Optional<Device> findById(Long id) {
        return devices.stream().filter(g -> g.getId().equals(id)).findFirst();
    }

//    public Optional<Task> findById(Long id) {
//        return tasks.stream()
//                .filter(t -> t.getId().equals(id))
//                .findFirst(); // findFirst() zaten bir Optional döndürür
//    }
}
