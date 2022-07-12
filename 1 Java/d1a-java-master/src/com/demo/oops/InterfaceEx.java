package com.demo.oops;

public class InterfaceEx {
public static void main(String[] args) {
	TestInterface object = null;
//	Cannot instantiate the type TestInterface
//	object = new TestInterface();
}
}


interface TestInterface {
	// by default public and abstract
//	void testMethod();
// public void testMethod();
	// method without a body is abstract
	public abstract void testMethod();
//	no static
//	public static void testMethod1();
}