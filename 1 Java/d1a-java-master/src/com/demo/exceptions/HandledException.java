package com.demo.exceptions;
// IP : divide by a string accepted from user.
// Exception : abnormal situations that occur during the execution of a program
// java.lang.ArithmeticException
public class HandledException {
	public static void main(String[] args) {
		System.err.println("The calculator app");
//		local variable
		int num1 = 0, num2 = 200;
		int result = 0;
		try {
		// exception occurs at thes line
		result = num2 / num1;
		}
		catch(ArithmeticException arithmeticException )
		{
			System.err.println("Cannot divide by zero");
		}
		// program shuts down improperly
		// code below does not get executed
		System.err.println(result);
		System.err.println("Shutting down calculator...");
	}
}
