package com.bloodbank.bloodbankmanagement.dto;

import com.bloodbank.bloodbankmanagement.models.Doctor;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class DoctorDto {

    private int id;
    private String firstName;
    private String lastName;
    private String hospitalName;
    private String email;
    private String Sector;


    public static DoctorDto fromEntity(Doctor doctor) {
        return DoctorDto.builder()
                .id(doctor.getId())
                .firstName(doctor.getFirstName())
                .lastName(doctor.getLastName())
                .email(doctor.getEmail())
                .hospitalName(doctor.getHospitalName())
                .Sector(doctor.getSector())
                .build();
    }

    public static Doctor fromDto(DoctorDto doctorDto) {
        return Doctor.builder()
                .id(doctorDto.getId())
                .firstName(doctorDto.getFirstName())
                .lastName(doctorDto.getLastName())
                .email(doctorDto.getEmail())
                .hospitalName(doctorDto.getHospitalName())
                .sector(doctorDto.getSector())
                .build();
    }
}