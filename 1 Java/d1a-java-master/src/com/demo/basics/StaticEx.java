package com.demo.basics;

public class StaticEx {
public static void main(String[] args) {
//	Test test = new Test();
//	test.instanceMethod();
	Test.staticMethod();
}
}

class Test {
	public void instanceMethod() {
		System.err.println("Welcome");
	}
	public static void staticMethod() {
		System.err.println("Welcome");
	}
}