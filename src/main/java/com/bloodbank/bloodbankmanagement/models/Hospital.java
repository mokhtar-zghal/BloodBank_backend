package com.bloodbank.bloodbankmanagement.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hospital")
public class Hospital {
    @Id
    @Column(name = "id")
    private int Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "location")
    private String Location;
    @Column(name = "phoneNumber")
    private int phoneNumber;
    @OneToMany(mappedBy = "hospital")
    private List<BloodBag> bloodBag;
}