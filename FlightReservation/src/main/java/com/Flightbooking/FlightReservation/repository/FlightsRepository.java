package com.Flightbooking.FlightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Flightbooking.FlightReservation.entities.Flights;

@Repository
public interface FlightsRepository extends JpaRepository<Flights,Integer> {

}
