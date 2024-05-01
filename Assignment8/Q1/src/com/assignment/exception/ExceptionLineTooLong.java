package com.assignment.exception;

public class ExceptionLineTooLong extends Exception{

	private String message;

	public ExceptionLineTooLong(String message) {
		super(message);
		this.message = message;
	}
	
	public ExceptionLineTooLong() {
		
	}
}
