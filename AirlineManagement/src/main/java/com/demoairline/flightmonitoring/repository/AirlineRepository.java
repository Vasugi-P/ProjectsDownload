package com.demoairline.flightmonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoairline.flightmonitoring.entity.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
