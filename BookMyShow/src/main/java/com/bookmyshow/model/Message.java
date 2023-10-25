package com.bookmyshow.model;

import org.springframework.stereotype.Component;

@Component
public class Message extends ShowSeat {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
