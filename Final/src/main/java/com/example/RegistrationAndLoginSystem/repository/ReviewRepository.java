package com.example.RegistrationAndLoginSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RegistrationAndLoginSystem.entity.Food;
import com.example.RegistrationAndLoginSystem.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findByFood(Food food);
}