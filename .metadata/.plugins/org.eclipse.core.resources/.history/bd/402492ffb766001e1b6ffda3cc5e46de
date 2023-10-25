package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmyshow.model.CinemaHall;

public interface CinemaHallRepo extends JpaRepository<CinemaHall, Integer>{

	@Query(value =" SELECT name AS cinema_hall_name, id AS show_show_no, ss.seat_no AS reserved_seat_no FROM cinema_hall INNER JOIN shows s ON ch.id = s.cinema_hall_id		INNER JOIN show_seat ss ON s.id = ss.shows_id	WHERE ss.is_reserved = true;"
,nativeQuery = true)
	CinemaHall getSeat(String name,Integer id);

}
