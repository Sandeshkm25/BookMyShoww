package com.bookmyshow.dao;

import com.bookmyshow.model.Shows;

public interface ShowsDao {

	Shows save(Shows show);

	Shows get(Integer id);

	Shows update(Shows show);

	String delete(Integer id);

}
