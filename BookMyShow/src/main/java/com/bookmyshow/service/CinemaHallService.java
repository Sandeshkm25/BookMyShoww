package com.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.dao.CinemaHallDao;

import com.bookmyshow.model.CinemaHall;

@Service
public class CinemaHallService {

	@Autowired
	CinemaHallDao dao;
	public CinemaHall save(CinemaHall hall)
	{
		return dao.save(hall);
	}
	public CinemaHall get(Integer id)
	{
		return dao.get(id);
	}
	public CinemaHall update(CinemaHall hall)
	{
		
		return dao.update(hall);
	}
	public String delete(Integer id)
	{
		return dao.delete(id);
	}
	
	public CinemaHall getSeat(String name,int id)
	{
		return dao.getSeats(name,id);
	}
}
