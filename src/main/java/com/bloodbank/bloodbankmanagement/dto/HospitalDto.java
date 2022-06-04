package com.bloodbank.bloodbankmanagement.dto;

import com.bloodbank.bloodbankmanagement.models.Hospital;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HospitalDto {
    private int Id;
    private String Name;
    private String Location;
    private int phoneNumber;
    public static Hospital fromDto(HospitalDto hospitalDto){
        return Hospital.builder()
                .Id(hospitalDto.getId())
                .Name(hospitalDto.getName())
                .Location(hospitalDto.getLocation())
                .phoneNumber(hospitalDto.getPhoneNumber())
                .build();
    }
    public static HospitalDto fromEntity(Hospital hospital){
        return HospitalDto.builder()
                .Id(hospital.getId())
                .Location(hospital.getLocation())
                .Name(hospital.getName())
                .phoneNumber(hospital.getPhoneNumber())
                .build();
    }
}
