package com.demo.exceptions;
// IP : divide by a string accepted from user.
// Exception : abnormal situations that occur during the execution of a program
// java.lang.ArithmeticException
public class UnhandledException {
	public static void main(String[] args) {
		System.err.println("The calculator app");
		int num1 = 0, num2 = 200;
		// exception occurs at thes line
		int result = num2 / num1;
		// program shuts down improperly
		// code below does not get executed
		System.err.println(result);
		System.err.println("Shutting down calculator...");
	}
}
