package com.demo.oops;

public class ConstructorChainingEx2 {
	public static void main(String[] args) {
		Son sunny = new Son();
		sunny.getNetWorth();
		sunny.land();
	}
}

class GrandFather extends Object {
	public float moneyFromGrandpa;

	public GrandFather() {
//		super();
		moneyFromGrandpa = 1f;
		System.err.println("B");
	}

	public void land() {
		System.out.println("A floor in Marina Bay sands");
	}
}

class Father extends GrandFather {
	public float moneyFromFather;

	public Father() {
//		super();
		moneyFromFather = 2f;
	}

	public void land() {
	
		System.out.println("A floor Hilton Garden");
		super.land();
	}
}

class Son extends Father {
	public float money;

	public Son() {
//		super();
		money = 3f;
	}

	public void getNetWorth() {
		System.err.println(moneyFromGrandpa + moneyFromFather + money);
	}

	public void land() {
		System.out.println("Sheraton Towers");
		super.land();
	}
}