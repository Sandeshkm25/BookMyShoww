package com.bookmyshow.exception;

public class BookingCloseException extends RuntimeException{

	private String msg;

	public BookingCloseException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
}
