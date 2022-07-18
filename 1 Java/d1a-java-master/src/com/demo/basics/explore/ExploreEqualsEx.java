package com.demo.basics.explore;

public class ExploreEqualsEx {
	public static void main(String[] args) {
		twoDifferentMemoryLocations();
//		sameMemoryLocations();
	}

	private static void twoDifferentMemoryLocations() {
		
		System.err.println("*************");
		System.err.println("equals and not identical");
//		Integer integer = new Integer(10);
		Integer integer = Integer.valueOf(10);
		Integer integer2 = new Integer(10);
	
//		integer = 100;
		// are equal
		System.err.println(integer);
		System.err.println(integer2);
		System.err.println(integer.equals(integer2));
		System.err.println(integer == integer2);
		
		integer = integer2;
		integer = 500;
		System.err.println(integer);
		System.err.println(integer2);
		
//		Integer integer3 = new Integer(10);
//		Integer integer4 = new Integer(10);
//		System.err.println(integer3.equals(integer4));
//		System.err.println(integer3 == integer4);
//		Money money = new Money(5);
//		Money money2 = new Money(5);
		
//		Money money2 = money;
//		System.out.println(money);
//		System.err.println(money2);
//		money.amount = 200;
//		System.out.println(money);
//		System.err.println(money2);	
//	
////		Identical and equal
//		System.err.println(money.equals(money2));
//		System.err.println(money== money2);
	}
	
	private static void sameMemoryLocations() {
		System.err.println("*************");
		Integer integer3 = 10;
		Integer integer4 = 10;
	
		System.err.println("equals and identical");
//		integer = 100;
		// are equal
		System.err.println(integer3);
		System.err.println(integer4);
		System.err.println(integer3.equals(integer4));
		// compares int value
		System.err.println(integer3 == integer4);
		
		integer3 = 500;
		System.err.println(integer3);
		System.err.println(integer4);
	}
}

class Money {
	int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}

}