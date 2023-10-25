package com.bookmyshow.dao;


import com.bookmyshow.model.CinemaHall;

public interface CinemaHallDao {

	CinemaHall save(CinemaHall hall);

	CinemaHall get(Integer id);

	CinemaHall update(CinemaHall cinema);

	String delete(Integer id);

	CinemaHall getSeats(String name, int id);


}
