package com.example.RegistrationAndLoginSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RegistrationAndLoginSystem.entity.Booking;
import com.example.RegistrationAndLoginSystem.entity.User;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {

    List<Booking> findByUser(User user);
}