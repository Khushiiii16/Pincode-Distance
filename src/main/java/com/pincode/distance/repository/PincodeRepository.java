package com.pincode.distance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pincode.distance.entity.Pincode;

@Repository
public interface PincodeRepository extends JpaRepository<Pincode, String> {
}