package com.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.dao.MovieDao;
import com.bookmyshow.model.Movie;

@Service
public class MovieService {
	
	@Autowired
	MovieDao dao;
	
	public Movie save(Movie movie)
	{
		
		return dao.save(movie);
	}
	
	public Movie update(Movie movie)
	{
		return dao.update(movie);
	}
	public Movie get(Integer id)
	{
		return dao.get(id);
	}
	public String delete(Integer id)
	{
		return dao.delete(id);
	}
}
