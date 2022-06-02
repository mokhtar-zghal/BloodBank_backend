package com.bloodbank.bloodbankmanagement.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "Doctor")
public class User {
        @Id
        @Column(name = "id")
        protected int id;
        @Column(name = "cin")
        protected int cin;
        @Column(name = "firstName")
        protected String firstName;
        @Column(name = "lastName")
        protected String lastName;
        @Column(name = "hospitalName")
        protected String hospitalName;
        @Column(name = "email")
        protected String email;
        @Column(name = "password")
        protected String password;

    }





