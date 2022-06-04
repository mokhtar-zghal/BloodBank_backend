package com.bloodbank.bloodbankmanagement.service;

import com.bloodbank.bloodbankmanagement.dto.HospitalDto;
import com.bloodbank.bloodbankmanagement.models.Hospital;
import com.bloodbank.bloodbankmanagement.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HospitalService {


        @Autowired
        private HospitalRepository hospitalRepository;








        public List<HospitalDto> findAll(){
            return hospitalRepository.findAll()
                    .stream()
                    .map(HospitalDto::fromEntity)
                    .collect(Collectors.toList());
        }
        public void delete(){
            hospitalRepository.deleteAll();
            return ;
        }
        public Optional<Hospital> findById(Integer id){
            return hospitalRepository.findById(id);
        }
        public void save(HospitalDto dto){
            Hospital hospital=HospitalDto.fromDto(dto);
            hospitalRepository.save(hospital);
        }

    }
