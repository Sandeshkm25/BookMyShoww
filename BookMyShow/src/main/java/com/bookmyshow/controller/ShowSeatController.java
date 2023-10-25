package com.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyshow.model.Message;
import com.bookmyshow.model.ShowSeat;
import com.bookmyshow.service.ShowSeatService;


@RestController
@RequestMapping("/ShowSeat")
public class ShowSeatController {

	public  String msg;
	@Autowired
	ShowSeatService seatService;
	
	@GetMapping("/reserved")
	public ShowSeat reserved(int seatNo)
	{
		return seatService.reserved(seatNo);
		
	}

}
