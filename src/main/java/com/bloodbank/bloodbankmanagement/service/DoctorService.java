package com.bloodbank.bloodbankmanagement.service;


import com.bloodbank.bloodbankmanagement.dto.DoctorDto;
import com.bloodbank.bloodbankmanagement.models.Doctor;
import com.bloodbank.bloodbankmanagement.repository.DoctorRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    
    @Autowired
    private ModelMapper modelMapper;






    public List<DoctorDto> findAll(){
        return doctorRepository.findAll()
                .stream()
                .map(DoctorDto::fromEntity)
                .collect(Collectors.toList());
    }
    public void delete(){
        doctorRepository.deleteAll();
        return ;
    }
    public Optional<Doctor> findById(Integer id){
        return doctorRepository.findById(id);
    }
    public void save(DoctorDto dto){
        Doctor docteur=DoctorDto.fromDto(dto);
        doctorRepository.save(docteur);
    }
}

