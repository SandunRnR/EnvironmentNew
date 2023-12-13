package com.example.deviceEnvironment.controller;


import com.example.deviceEnvironment.dto.DeviceEnvironmentEntity1DTO;
import com.example.deviceEnvironment.service.DeviceEnvironmentService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// @RequestMapping("/api/deviceEnvironment2")
public class DeviceEnvironmentController2 {

    @Autowired
    private DeviceEnvironmentService2 deviceEnvironmentService2;

    @PostMapping("/api/deviceEnvironment2/save")
    public String saveEnvironment(
            @RequestParam("deviceID") String pDeviceID,
            @RequestParam("currentValue") double pCurrentValue/*,
            @RequestParam("uploadDateAndTime") LocalDateTime pUploadDateTime,
            @RequestParam("file") MultipartFile pFile*/) throws Exception {
        return deviceEnvironmentService2.saveDeviceEnvironment2(pDeviceID,
                pCurrentValue
//                pUploadDateTime,
                );
    }

    @PostMapping("/api/deviceEnvironment2/saveDTO")
    public String saveEnvironmentWithDTO(
            @RequestBody DeviceEnvironmentEntity1DTO pDeviceEnvironmentEntity1DTO) throws Exception {
        return deviceEnvironmentService2.saveDeviceEnvironment2(pDeviceEnvironmentEntity1DTO.getDeviceID(),
                pDeviceEnvironmentEntity1DTO.getCurrentValue()
        );
    }
}