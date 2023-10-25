package com.bookmyshow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookmyshow.dao.MovieDao;
import com.bookmyshow.model.Movie;
import com.bookmyshow.repository.MovieRepo;

@Repository
public class MovieDaoImpl implements MovieDao{

	@Autowired
	MovieRepo movieRepo;
	public Movie save(Movie movie) {
		
		return movieRepo.save(movie);
	}
	@Override
	public Movie get(Integer id) {
		
		return movieRepo.findById(id).orElse(null);
	}
	@Override
	public String delete(Integer id) {
		
		movieRepo.deleteById(id);
		return "yes";
	}
	@Override
	public Movie update(Movie movie) {
		Movie movie1=movieRepo.findById(movie.getId()).orElse(null);
		movie1.setName(movie.getName());
		movie1.setCountry(movie.getCountry());
		movie1.setDescription(movie.getDescription());
		movie1.setDurationMins(movie.getDurationMins());
		movie1.setGenre(movie.getGenre());
		movie1.setLanguage(movie.getLanguage());
		movie1.setReleaseDate(movie.getReleaseDate());				
		return movie1;
	}
}
