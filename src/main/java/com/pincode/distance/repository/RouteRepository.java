package com.pincode.distance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pincode.distance.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

}
