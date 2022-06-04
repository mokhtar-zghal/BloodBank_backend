package com.bloodbank.bloodbankmanagement.controller;

import com.bloodbank.bloodbankmanagement.dto.BloodBagDto;
import com.bloodbank.bloodbankmanagement.service.BloodBagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BloodBagController {
    private final BloodBagService bloodBagService;


    public BloodBagController(BloodBagService bloodBagService) {
        this.bloodBagService = bloodBagService;
    }
    @GetMapping("/bloodBag/all")
    public List<BloodBagDto> findAll(){
        return bloodBagService.findAll();
    }
}
