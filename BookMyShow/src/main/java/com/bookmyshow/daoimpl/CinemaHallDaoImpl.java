package com.bookmyshow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookmyshow.dao.CinemaHallDao;
import com.bookmyshow.model.Cinema;
import com.bookmyshow.model.CinemaHall;
import com.bookmyshow.repository.CinemaHallRepo;

@Repository
public class CinemaHallDaoImpl implements CinemaHallDao{

	@Autowired
	CinemaHallRepo repo;
	@Override
	public CinemaHall save(CinemaHall hall) {
		// TODO Auto-generated method stub
		return repo.save(hall);
	}

	@Override
	public CinemaHall get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public CinemaHall update(CinemaHall hall) {
		CinemaHall cinema1=repo.findById(hall.getId()).orElse(null);
		cinema1.setCinema(hall.getCinema());
		cinema1.setName(hall.getName());
		cinema1.setTotalSeats(hall.getTotalSeats());
		cinema1.setMovie(hall.getMovie());
		cinema1.setShows(hall.getShows());
		return cinema1;	
	}

	@Override
	public String delete(Integer id) {
		repo.deleteById(id);
		return "Yes";
	}

	@Override
	public CinemaHall getSeats(String name, int id) {
		// TODO Auto-generated method stub
		return repo.getSeat(name,id);
	}

	

}
