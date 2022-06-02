package com.bloodbank.bloodbankmanagement.repository;

import com.bloodbank.bloodbankmanagement.models.BloodBag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodBagRepository extends JpaRepository<BloodBag, Integer> {
}
