package com.bookmyshow.dao;



import com.bookmyshow.model.Cinema;


public interface CinemaDao {

	Cinema save(Cinema cinema);

	Cinema get(Integer id);

	Cinema update(Cinema cinema);

	String delete(Integer id);

}
