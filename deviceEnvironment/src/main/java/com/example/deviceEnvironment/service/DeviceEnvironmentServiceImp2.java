package com.example.deviceEnvironment.service;

import com.example.deviceEnvironment.entity.DeviceEnvironmentEntity1;
import com.example.deviceEnvironment.entity.DeviceEnvironmentEntity2;
import com.example.deviceEnvironment.repository.DeviceEnvironmentRepo1;
import com.example.deviceEnvironment.repository.DeviceEnvironmentRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;


@Service
public class DeviceEnvironmentServiceImp2 implements DeviceEnvironmentService2{

    @Autowired
    private DeviceEnvironmentRepo2 deviceEnvironmentRepo2;

//    @Value("${upload.image.path}")
//    private String uploadImagePath;

    @Override
    public String saveDeviceEnvironment2(
            String pDeviceID,
            double pCurrentValue/*,
            LocalDateTime pUploadDateTime,
            MultipartFile file*/) throws Exception {
//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//        try {
//            if (fileName.contains("..")) {
//                throw new Exception("Filename contains invalid path sequence "
//                        + fileName);
//            }
        LocalDateTime currentDateTime = LocalDateTime.now();

        DeviceEnvironmentEntity2 newObjectDeviceEnvironmentEntity2 = new DeviceEnvironmentEntity2(pDeviceID,
                pCurrentValue,
                currentDateTime
//                    (currentDateTime.toString() + "_" + fileName)
        );

        try {
            deviceEnvironmentRepo2.save(newObjectDeviceEnvironmentEntity2);
        } catch (Exception e) {
            e.printStackTrace();
        }

//            File newFile = new File(uploadImagePath
//                    + "\\" + (new Date()).getTime() + "_" + fileName);
//
//            // Transfer the content of MultipartFile to the file
//            file.transferTo(newFile);

//            return "Successfully Inserted!";
//        } catch (Exception e) {
//            throw new Exception("Could not save File: " + fileName);
//
//        }
        return "Successfully Inserted!";
    }
}



