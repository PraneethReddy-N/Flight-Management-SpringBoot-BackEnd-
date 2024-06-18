package com.Flightbooking.FlightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Flightbooking.FlightReservation.entities.AirportDetails;

@Repository
public interface AirportDetailsRepository extends JpaRepository<AirportDetails,Integer> {

}
