package com.bloodbank.bloodbankmanagement.service;

import com.bloodbank.bloodbankmanagement.dto.BloodBagDto;
import com.bloodbank.bloodbankmanagement.models.BloodBag;
import com.bloodbank.bloodbankmanagement.repository.BloodBagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BloodBagService {
    @Autowired
    private BloodBagRepository bloodBagRepository;








    public List<BloodBagDto> findAll(){
        return bloodBagRepository.findAll()
                .stream()
                .map(BloodBagDto::fromEntity)
                .collect(Collectors.toList());
    }
    public void delete(){
        bloodBagRepository.deleteAll();
        return ;
    }
    public Optional<BloodBagDto> findById(Integer id){
        return bloodBagRepository.findById(id).map(BloodBagDto::fromEntity);
    }
    public void save(BloodBagDto dto){
        BloodBag bloodBag=BloodBagDto.fromDto(dto);
        bloodBagRepository.save(bloodBag);
    }
}
