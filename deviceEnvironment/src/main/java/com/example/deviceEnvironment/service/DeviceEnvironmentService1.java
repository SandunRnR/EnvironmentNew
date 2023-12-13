package com.example.deviceEnvironment.service;

import org.springframework.web.multipart.MultipartFile;

public interface DeviceEnvironmentService1 {

    public String saveDeviceEnvironment1(String pDeviceID,
                                         String pDeviceType,
                                         MultipartFile pFile) throws Exception;
}
