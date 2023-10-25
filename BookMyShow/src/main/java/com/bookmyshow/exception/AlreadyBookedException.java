package com.bookmyshow.exception;

public class AlreadyBookedException extends RuntimeException{

	private String msg;
	
	public AlreadyBookedException(String msg)
	{
		this.msg=msg;
	}

	@Override
	public String getMessage()
	{
		return msg;
	}
	
}
