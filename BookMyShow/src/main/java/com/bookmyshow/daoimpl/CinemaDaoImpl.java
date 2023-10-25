package com.bookmyshow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookmyshow.dao.CinemaDao;
import com.bookmyshow.model.Cinema;
import com.bookmyshow.repository.CinemaRepo;

@Repository
public class CinemaDaoImpl implements CinemaDao{

	@Autowired
	CinemaRepo cinemaRepo;
	
	@Override
	public Cinema save(Cinema cinema) {
		// TODO Auto-generated method stub
		return cinemaRepo.save(cinema);
	}

	@Override
	public Cinema get(Integer id) {
		// TODO Auto-generated method stub
		return cinemaRepo.findById(id).orElse(null);
	}

	@Override
	public Cinema update(Cinema cinema) {
		Cinema cinema1=cinemaRepo.findById(cinema.getId()).orElse(null);
		cinema1.setLocation(cinema.getLocation());
		cinema1.setName(cinema.getName());
		cinema1.setTotalCinemaHall(cinema.getTotalCinemaHall());
		return cinema1;
	}

	@Override
	public String delete(Integer id) {
		cinemaRepo.deleteById(id);
		return "yes";
	}

}
