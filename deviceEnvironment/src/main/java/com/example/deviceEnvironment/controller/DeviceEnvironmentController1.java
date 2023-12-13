package com.example.deviceEnvironment.controller;


import com.example.deviceEnvironment.service.DeviceEnvironmentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/deviceEnvironment1")
public class DeviceEnvironmentController1 {

    @Autowired
    private DeviceEnvironmentService1 deviceEnvironmentService1;

    @PostMapping("/save")
    public String saveEnvironment(
            @RequestParam("deviceID") String pDeviceID,
            @RequestParam("deviceType") String pDeviceType,
//    @RequestParam("uploadDateAndTime") LocalDateTime pUploadDateTime,
            @RequestParam("file") MultipartFile pFile) throws Exception {

        return deviceEnvironmentService1.saveDeviceEnvironment1(pDeviceID,
                pDeviceType,
//                pUploadDateTime,
                pFile);
    }




}
