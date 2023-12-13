package com.example.deviceEnvironment.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "DeviceEnvironmentTable1")
public class DeviceEnvironmentEntity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String deviceID;
    private String deviceType;

    public DeviceEnvironmentEntity1(
            String pDeviceID,
            String pDeviceType){
        this.deviceID=pDeviceID;
        this.deviceType=pDeviceType;
    }


}
