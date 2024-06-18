package com.Flightbooking.FlightReservation.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Flightbooking.FlightReservation.entities.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings,Integer> {

    @Query(
        value = "SELECT * FROM Bookings WHERE user_id = :userId ",
        nativeQuery = true
    )
    public Bookings getBookings(@Param("userId") String userId);
        
    @Modifying
    @Query(
        value =  "UPDATE Bookings SET flight_id = :flightId, booking_date = :bookingDate, seat_number = :seatNumber, status = :status WHERE user_id = :userId",
        nativeQuery = true
    )
    public int updateBookingDetails(@Param("userId") String userId, @Param("flightId") Integer flightId, @Param("bookingDate") Date bookingDate, @Param("seatNumber") String seatNumber, @Param("status") String status);    

}
