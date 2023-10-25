package com.bookmyshow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookmyshow.dao.ShowSeatDao;
import com.bookmyshow.model.ShowSeat;
import com.bookmyshow.repository.ShowSeatRepo;

@Repository
public class ShowSeatDaoImpl implements ShowSeatDao{

	@Autowired
	ShowSeatRepo repo;
	@Override
	public ShowSeat getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}
	@Override
	public ShowSeat getByseatNo(int seatNo) {
		// TODO Auto-generated method stub
		return repo.findBySeatNo(seatNo);
	}
	@Override
	public ShowSeat save(ShowSeat seat2) {
		
		return repo.save(seat2);
		
	}
}
