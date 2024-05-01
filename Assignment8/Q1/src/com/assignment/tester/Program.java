package com.assignment.tester;

import java.util.Scanner;

import com.assignment.exception.ExceptionLineTooLong;
import com.assignment.user.UserInput;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserInput ui = new UserInput();
		
		try {
			System.out.println("Enter string: ");
			String str = sc.next();
			ui.setStr(str);
		}
		catch(ExceptionLineTooLong e)
		{
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(ui.getStr());
		
	}

}
