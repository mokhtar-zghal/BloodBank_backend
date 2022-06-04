package com.bloodbank.bloodbankmanagement.dto;

import com.bloodbank.bloodbankmanagement.models.BloodBag;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Builder
@Data
public class BloodBagDto {
    private int barCode;
    private String type;
    private LocalDateTime Durability;

    public static BloodBagDto fromEntity(BloodBag bloodBag){
        return BloodBagDto.builder()
                .barCode(bloodBag.getBarCode())
                .Durability(bloodBag.getDurability())
                .type(bloodBag.getType())
                .build();
    }
    public static BloodBag fromDto(BloodBagDto bloodBagDto){
        return BloodBag.builder()
                .barCode(bloodBagDto.getBarCode())
                .Durability(bloodBagDto.getDurability())
                .type(bloodBagDto.getType())
                .build();
    }
}
