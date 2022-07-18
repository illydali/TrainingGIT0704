package com.demo.basics;

import java.util.Objects;

public class StackAndHeapWithObjectEx {
	public static void main(String[] args) {
//		equalsAndIdentical();
//		notEqualNotIdentical();
		equalsNotIdentical();
	}

	private static void equalsAndIdentical() {
		Person shavin = new Person();
		shavin.location = "Changi";
		System.err.println(shavin);

		Person shivas = shavin;
		System.err.println(shivas);
		shivas.location = "Bishan";
		System.err.println(shivas);
		System.err.println(shavin);

		System.err.println(shivas);
		System.err.println(shavin);
		System.err.println(shivas.equals(shavin));
		System.err.println(shivas == shavin);
	}

//	private static void notEqualNotIdentical() {
//		Person shavin = new Person();
//		shavin.location = "Changi";
//		System.err.println(shavin);
//
//		Person shivas = new Person() ;
//		shivas.location = "Changi";
//		System.err.println(shivas);
//
////		false because internally the equals method is using == 
//// override the equals method to custom compare and return true / false
//		System.err.println(shivas.equals(shavin));
//		System.err.println(shivas == shavin);
//	}

	private static void equalsNotIdentical() {
		Person shavin = new Person();
		shavin.location = "Changi";
		System.err.println(shavin);

		Person shivas = new Person();
		shivas.location = "Changi";
		System.err.println(shivas);

//	false because internally the equals method is using == 
//override the equals method to custom compare and return true / false
		System.err.println("Equals : " + shivas.equals(shavin));
		System.err.println("Identical : " + (shivas == shavin));
	}
}

class Person {
	public String location;

//	@Override
//	public String toString() {
//		return "Person [location=" + location + "]";
//	}

	@Override
	public boolean equals(Object upCastedPerson) {
		Person person = (Person) upCastedPerson;
		return this.location.equals(person.location);
	}

}