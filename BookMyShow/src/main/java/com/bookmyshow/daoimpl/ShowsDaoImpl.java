package com.bookmyshow.daoimpl;

import org.springframework.stereotype.Repository;

import com.bookmyshow.dao.ShowsDao;
import com.bookmyshow.model.Shows;
import com.bookmyshow.repository.ShowsRepo;

@Repository
public class ShowsDaoImpl implements ShowsDao{

	ShowsRepo repo;
	@Override
	public Shows save(Shows show) {
		// TODO Auto-generated method stub
		return repo.save(show);
	}

	@Override
	public Shows get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Shows update(Shows show) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer id) {
		repo.deleteById(id);
		return "yes";
	}

	
}
