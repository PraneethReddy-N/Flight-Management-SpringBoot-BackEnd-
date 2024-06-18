package com.Flightbooking.FlightReservation.entities;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Flights")
public class Flights {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    private Integer airlineId;
    private Integer departureAirportId;
    private Integer arrivalAirportId;
    private Time departureTime;
    private Time arrivalTime;
    private Double price;
    private Integer seatsAvailable;

}
