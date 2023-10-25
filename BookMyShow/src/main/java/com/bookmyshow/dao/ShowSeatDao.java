package com.bookmyshow.dao;

import com.bookmyshow.model.ShowSeat;

public interface ShowSeatDao {

	ShowSeat getById(int id);

	ShowSeat getByseatNo(int seatNo);

	ShowSeat save(ShowSeat seat2);


}
