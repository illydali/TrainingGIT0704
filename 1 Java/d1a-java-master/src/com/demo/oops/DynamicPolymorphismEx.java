package com.demo.oops;

public class DynamicPolymorphismEx {
	public static void main(String[] args) {
		useInterfaceReference();
//	useClassReference();
	}

	private static void useInterfaceReference() {
//	Dynamic polymorphism
//		Book philosophersStone = null;
		Book philosophersStone;
//	philosophersStone.viewDetails();
		if (Math.random() > 0.7)
			philosophersStone = new AudioBook();
		else if (Math.random() > 0.3)
			philosophersStone = new HardCopy();
		else
			philosophersStone = new KindleEdition();
		philosophersStone.setTitle("Developer's stone by Gazali & Ili");
		philosophersStone.viewDetails();
		philosophersStone.getTitle();
	}

	
	private static void useClassReference() {
		AudioBook philosophersStone = null;
//	philosophersStone.viewDetails();
		philosophersStone = new AudioBook();
		philosophersStone.setTitle("Developer's stone by Gazali");
		philosophersStone.viewDetails();
		philosophersStone.listen();

		HardCopy philosophersStone1 = new HardCopy();
		philosophersStone1.viewDetails();
		philosophersStone1.read();
	}
}

abstract class Book {
	private String title;
	public String get() {
		return title;
	}
	public void setTitle(String titleString) {
		this.title = titleString;
	}
	public void getTitle() {
//		System.err.println("Philosopher's stone");
		System.err.println(title);
	}
	public abstract void viewDetails();
}

class AudioBook extends Book {

	@Override
	public void viewDetails() {
		System.err.println("Voice by Sam and Duration : 2.5 hours");

	}

	public void listen() {
		System.err.println("Listen with head phones");
	}

}

class HardCopy extends Book {

	@Override
	public void viewDetails() {
		System.err.println("Written by Peter and No Of Pages : 250");
	}

	public void read() {
		System.err.println("Read silently");
	}

}

class KindleEdition extends Book {

	@Override
	public void viewDetails() {
		System.err.println("Written by Peter, Color Copy");
	}

	public void flip() {
		System.err.println("Flip pages by touch screen");
	}

}