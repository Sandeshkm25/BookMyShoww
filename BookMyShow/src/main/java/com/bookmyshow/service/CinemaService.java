package com.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyshow.dao.CinemaDao;
import com.bookmyshow.model.Cinema;

@Service
public class CinemaService {

	@Autowired
	CinemaDao dao;
	public Cinema save(Cinema cinema)
	{
		return dao.save(cinema);
	}
	public Cinema get(Integer id)
	{
		return dao.get(id);
	}
	public Cinema update(Cinema cinema)
	{
		
		return dao.update(cinema);
	}
	public String delete(Integer id)
	{
		return dao.delete(id);
	}
}
