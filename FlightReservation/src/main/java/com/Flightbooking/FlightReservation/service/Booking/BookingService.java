package com.Flightbooking.FlightReservation.service.Booking;

import com.Flightbooking.FlightReservation.entities.Bookings;

public interface BookingService {

    Bookings getUserBookingDetails(String userId);

    void addBooking(Bookings bookingdetails);

    int updateBookingDetails(Bookings updatedDetails);

}
