package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.model.Cinema;

public interface CinemaRepo extends JpaRepository<Cinema, Integer> {

}
