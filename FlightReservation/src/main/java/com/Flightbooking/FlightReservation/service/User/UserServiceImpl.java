package com.Flightbooking.FlightReservation.service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Flightbooking.FlightReservation.entities.User;
import com.Flightbooking.FlightReservation.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserDetails(String userid) {
        return userRepository.findById(userid).get();
    }

    @Override
    public User addUser(User user) {
      return userRepository.save(user);
    }

    @Override
    @Transactional
    public int updateUserDetails(String userId,String username) {
        return userRepository.updateUserDetailsInfo(userId, username);
    }

    @Override
    @Transactional
    public int deleteUserDetails(String userId) {
        return userRepository.deleteUserDetailsInfo(userId);
    }



}
