package com.bookmyshow.dao;



import com.bookmyshow.model.Movie;

public interface MovieDao {

	public Movie save(Movie movie);
	Movie get(Integer id);
	String delete(Integer id);
	Movie update(Movie movie);

}
