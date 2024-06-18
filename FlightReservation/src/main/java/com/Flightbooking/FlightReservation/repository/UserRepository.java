package com.Flightbooking.FlightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Flightbooking.FlightReservation.entities.User;



@Repository
public interface UserRepository extends JpaRepository<User,String> {

    @Modifying
    @Query(
        value =  "UPDATE Users  SET username = :username WHERE user_id = :userId",
        nativeQuery = true
    )
    int updateUserDetailsInfo(@Param("userId") String userId, @Param("username") String username);


    @Modifying
    @Query(
        value =  "DELETE FROM Users WHERE user_id = :userId",
        nativeQuery = true
    )
    int deleteUserDetailsInfo(@Param("userId") String userId);


}
