package com.bloodbank.bloodbankmanagement.models;


import lombok.*;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Doctor")
public class Doctor extends User {
    @Column(name = "sector")
    private String Sector;


    @Builder
    public Doctor(int id, int cin, String firstName, String lastName, String hospitalName, String email, String password, String sector) {
        super(id, cin, firstName, lastName, hospitalName, email, password);
        Sector = sector;
    }
}



