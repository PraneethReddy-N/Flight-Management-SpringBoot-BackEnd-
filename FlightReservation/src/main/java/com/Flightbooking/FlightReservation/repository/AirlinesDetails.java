package com.Flightbooking.FlightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Flightbooking.FlightReservation.entities.Airlines;

@Repository
public interface AirlinesDetails extends JpaRepository<Airlines,Integer> {

}
