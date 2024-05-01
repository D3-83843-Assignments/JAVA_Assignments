package com.assignment.user;

import com.assignment.exception.ExceptionLineTooLong;

public class UserInput {

	String str;
	
	public UserInput(String str)
	{
		this.str = str;
	}
	
	public UserInput()
	{	
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) throws ExceptionLineTooLong {
		
		if(str.length()>8)
			throw new ExceptionLineTooLong("The string is too long.");
		this.str = str;
	}
}
