package com.bloodbank.bloodbankmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "BloodBag")
public class BloodBag {
    @Id
    @Column(name = "barCode")
    private int barCode;
    @Column(name = "type")
    private String type;
    @Column(name = "durability")
    private LocalDateTime Durability;
    @ManyToOne
    @JoinColumn(name = "idHospital")
    private Hospital hospital;
}

