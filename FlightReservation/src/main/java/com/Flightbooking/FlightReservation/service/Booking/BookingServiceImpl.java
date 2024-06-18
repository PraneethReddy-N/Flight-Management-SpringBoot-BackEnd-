package com.Flightbooking.FlightReservation.service.Booking;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flightbooking.FlightReservation.entities.Bookings;
import com.Flightbooking.FlightReservation.entities.User;
import com.Flightbooking.FlightReservation.repository.BookingsRepository;
import com.Flightbooking.FlightReservation.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingsRepository bookingsRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Bookings getUserBookingDetails(String userId) {
        return bookingsRepository.getBookings(userId);
    }

    @Override
    public void addBooking(Bookings bookingdetails) {
        String userid = bookingdetails.getUserId() ;
        Optional<User> useridserach = userRepository.findById(userid);
        if(useridserach.isPresent()){
            bookingsRepository.save(bookingdetails);
        }else{
            System.out.println("Ledu bhaiya user");
        }
    }

    @Override
    @Transactional
    public int updateBookingDetails(Bookings updatedDetails) {
        String userId = updatedDetails.getUserId();
        Integer flightId = updatedDetails.getFlightId();
        Date bookingDate = updatedDetails.getBookingDate();
        String seatNumber = updatedDetails.getSeatNumber();
        String status = updatedDetails.getStatus();
        return bookingsRepository.updateBookingDetails(userId,flightId,bookingDate,seatNumber,status);
    }

}
