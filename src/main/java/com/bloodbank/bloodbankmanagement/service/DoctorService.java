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

    /*@Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }*/
    @Autowired
    private ModelMapper modelMapper;




/*   private DoctorDto fromEntity(Doctor doctor){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        DoctorDto  doctorDto = new DoctorDto();
        doctorDto = modelMapper.map(doctor, DoctorDto.class);
        return doctorDto;
    }*/


/*    private Doctor fromDto(DoctorDto doctorDto){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        Doctor  doctor = new Doctor();
        doctor = modelMapper.map(doctorDto, Doctor.class);
        return doctor;
    }*/
   /* ModelMapper used instead of Builder to map Entity to Dto and vice versa */

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

