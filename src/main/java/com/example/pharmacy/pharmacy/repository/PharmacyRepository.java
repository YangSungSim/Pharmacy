package com.example.pharmacy.pharmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pharmacy.pharmacy.entity.Pharmacy;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
