package com.Flightbooking.FlightReservation.service.User;


import com.Flightbooking.FlightReservation.entities.User;

public interface UserService {

    User getUserDetails(String userid);

    User addUser(User user);

    public int  updateUserDetails(String userId,String username);

    int deleteUserDetails(String userId);


}
