package com.Flightbooking.FlightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Flightbooking.FlightReservation.entities.User;
import com.Flightbooking.FlightReservation.service.User.UserService;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUserDetails(@PathVariable("id") String userid){
        return userService.getUserDetails(userid);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/user/{id}/{username}")
    public int updateUserDetails(@RequestBody @PathVariable("id") String userId, @PathVariable("username") String username){
         return userService.updateUserDetails(userId,username);
    }

    @DeleteMapping("user/{id}")
    public int deleteUserDetails(@RequestBody @PathVariable("id") String userId){
        return userService.deleteUserDetails(userId);
    }
    

    


}
