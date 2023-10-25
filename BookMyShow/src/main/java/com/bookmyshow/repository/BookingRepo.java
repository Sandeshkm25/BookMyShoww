package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
