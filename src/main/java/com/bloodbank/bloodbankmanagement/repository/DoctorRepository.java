package com.bloodbank.bloodbankmanagement.repository;

import com.bloodbank.bloodbankmanagement.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
