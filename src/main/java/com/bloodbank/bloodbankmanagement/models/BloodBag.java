package com.bloodbank.bloodbankmanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "BloodBag")
public class BloodBag {
    @Id
    @Column(name = "barCode")
    private int barCode;
    @Column(name = "type")
    private String type;
    @Column(name = "durability")
    private LocalDateTime Durability;
}

