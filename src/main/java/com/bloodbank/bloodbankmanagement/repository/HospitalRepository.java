package com.bloodbank.bloodbankmanagement.repository;

import com.bloodbank.bloodbankmanagement.models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
