package com.example.deviceEnvironment.service;

import org.springframework.web.multipart.MultipartFile;

public interface DeviceEnvironmentService2 {

    public String saveDeviceEnvironment2(String pDeviceID,
                                         double pCurrentValue) throws Exception;
}
