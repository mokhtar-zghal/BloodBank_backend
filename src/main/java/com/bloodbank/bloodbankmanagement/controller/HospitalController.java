package com.bloodbank.bloodbankmanagement.controller;

import com.bloodbank.bloodbankmanagement.dto.HospitalDto;
import com.bloodbank.bloodbankmanagement.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalController {
    private final HospitalService hospitalService;

    @Autowired
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }
    @PostMapping("/hospital")
    public void save(@RequestBody HospitalDto dto){
        hospitalService.save(dto);

    }
/*    @GetMapping("/hospital-list")
    public List<HospitalService> findAll(){
        return
    }*/
}
