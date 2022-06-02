package com.bloodbank.bloodbankmanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HospitalLaboratoryManager")
public class HospitalLaboratoryManager extends User{
    @Column(name = "phoneNumber")
    int phoneNumber;
}
