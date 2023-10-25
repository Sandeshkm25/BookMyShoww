package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookmyshow.model.CinemaHall;
import com.bookmyshow.model.ShowSeat;

public interface ShowSeatRepo extends JpaRepository<ShowSeat, Integer>{

	@Query(value = "select * from SHOW_SEAT where seat_No=?1",nativeQuery = true)
	ShowSeat findBySeatNo(int seatNo);

}

