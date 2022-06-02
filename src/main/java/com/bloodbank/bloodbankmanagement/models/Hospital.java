package com.bloodbank.bloodbankmanagement.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

}