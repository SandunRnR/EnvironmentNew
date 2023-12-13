package com.example.deviceEnvironment.service;


import com.example.deviceEnvironment.entity.DeviceEnvironmentEntity1;
import com.example.deviceEnvironment.repository.DeviceEnvironmentRepo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class DeviceEnvironmentServiceImp1 implements DeviceEnvironmentService1{
    @Autowired
    private DeviceEnvironmentRepo1 deviceEnvironmentRepo1;

    @Value("${upload.image.path}")
    private String uploadImagePath;

    @Override
    public String saveDeviceEnvironment1(
            String pDeviceID,
            String pDeviceType,
//            LocalDateTime pUploadDateTime,
            MultipartFile file
    ) throws Exception {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (fileName.contains("..")) {
                throw new Exception("Filename contains invalid path sequence "
                        + fileName);
            }

            LocalDateTime currentDateTime = LocalDateTime.now();

            DeviceEnvironmentEntity1 newObjectDeviceEnvironmentEntity1 = new DeviceEnvironmentEntity1(pDeviceID,
                    pDeviceType
//                    currentDateTime
//                    (currentDateTime.toString() + "_" + fileName)
            );

            try {
                deviceEnvironmentRepo1.save(newObjectDeviceEnvironmentEntity1);
            } catch (Exception e) {
                e.printStackTrace();
            }

            File newFile = new File(uploadImagePath
                    + "\\" + (new Date()).getTime() + "_" + fileName);

            // Transfer the content of MultipartFile to the file
            file.transferTo(newFile);

            return "Successfully Inserted!";
        } catch (Exception e) {
            throw new Exception("Could not save File: " + fileName);
        }
    }


}
