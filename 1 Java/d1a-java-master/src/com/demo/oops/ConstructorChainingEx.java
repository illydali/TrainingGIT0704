package com.demo.oops;


public class ConstructorChainingEx {
	public static void main(String[] args) {
		Derived1 derived1 = new Derived1();
//	new Derived1();
	}
}

class Base extends Object{

	public Base() {
		super();
		System.err.println("B");
	}

}
class Base1 extends Base{

	public Base1() {
		
		System.err.println("B1");
//		Constructor call must be the first statement in a constructor
//		super();
	}

}

class Derived1 extends Base1 {
	public Derived1() {
		// super() / Base1()
		super();
		System.err.println("D1");
	}
}