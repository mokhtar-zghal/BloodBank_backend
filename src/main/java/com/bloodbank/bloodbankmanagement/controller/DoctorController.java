package com.bloodbank.bloodbankmanagement.controller;

import com.bloodbank.bloodbankmanagement.dto.DoctorDto;
import com.bloodbank.bloodbankmanagement.models.Doctor;
import com.bloodbank.bloodbankmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
    public class DoctorController {
        private final DoctorService doctorService;

        @Autowired
        public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
        }


        @PostMapping("/doctor/save")
        public void save(@RequestBody DoctorDto dto){
            doctorService.save(dto);

        }
        @GetMapping("/doctor/find")
        public Optional<DoctorDto> findById(@RequestParam(required=true,defaultValue="8") Integer number){
            return doctorService.findById(number);
        }
        @GetMapping("/doctor/all")
        public List<DoctorDto> findAll(){
            return doctorService.findAll();
        }
        @RequestMapping("/delete")
        public void delete(){
            doctorService.delete();
        }

   //     @RequestMapping("/")
     //   public Doctor doctorTest(@RequestParam(value = "name", defaultValue = "Mohamed") String name){
       //     return new Doctor(11,111,"amir","zghal","hedi chaker","az@gmail.com","11234","sfax");
    /*    return new Doctor("sfax",15,1113,name,"zghal","hedi chaker","zm@gmail.com","mokhtarz2000");}*/
    //}

}