package com.Flightbooking.FlightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Flightbooking.FlightReservation.entities.Bookings;
import com.Flightbooking.FlightReservation.service.Booking.BookingService;

@RestController
public class BookingsController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("booking/user/{id}")
    public Bookings getBookingsOfAnId(@PathVariable("id") String userId){
        return bookingService.getUserBookingDetails(userId);
    }

    @PostMapping("bookings")
    public void addBooking(@RequestBody Bookings bookingdetails){
        bookingService.addBooking(bookingdetails);
    }

    @PutMapping("bookings/user")
    public int updateBookingDetails(@RequestBody Bookings updatedDetails){
        return bookingService.updateBookingDetails(updatedDetails);
    }

}
