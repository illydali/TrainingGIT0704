package com.demo.basics;

public class VariableScopeEx {
//	member variable scope
//	String testString = null;
	String testString;
	UserDefinedClass userDefinedClass = null;

	public static void main(String[] args) {
		VariableScopeEx variableScopeEx = new VariableScopeEx();
		System.err.println(variableScopeEx.testString);
	}

	public VariableScopeEx() {
		testString = null;
	}
	
	
}

class UserDefinedClass {
//	method parameter scope
	public void test(String testString1) {
//		local variable scope
//		String testString2 = null;
		String testString2 = null;
//		The local variable testString2 may not have been initialized
		System.err.println(testString2);
		UserDefinedClass userDefinedClass2;
		try {
			System.out.println("exception handling");
//			exception handler parameter scope
		} catch (Exception exception) {

		}
	}
}