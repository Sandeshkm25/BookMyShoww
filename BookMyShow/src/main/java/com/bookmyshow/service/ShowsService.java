package com.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookmyshow.dao.ShowsDao;
import com.bookmyshow.model.Shows;


@Service
public class ShowsService {

	@Autowired
	ShowsDao dao;
	public Shows save(Shows show)
	{
		return dao.save(show);
	}
	public Shows get(Integer id)
	{
		return dao.get(id);
	}
	public Shows update(Shows show)
	{	
		return dao.update(show);
	}
	public String delete(Integer id)
	{
		return dao.delete(id);
	} 
}
