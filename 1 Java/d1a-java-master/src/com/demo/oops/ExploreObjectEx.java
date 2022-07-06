package com.demo.oops;
// everything is an object in java
public class ExploreObjectEx {
	public static void main(String[] args) {
		Product bookProduct = new Product();
//		String productString = bookProduct.toString();
//		System.out.println(productString);
		bookProduct.iSBN = "I1";
		bookProduct.title = "SWY";
		bookProduct.author = "SS";
//		bookProduct.getDetails();
//		String productToString = bookProduct.toString();
//		System.err.println(productToString);
//		System.err.println(bookProduct.toString());
		System.out.println(bookProduct);
		// OPEN SOURCE
	}
}

//class Product extends Object{
//	
//}
// extends Object
class Product {
	// variables in classes are automatically assigned default values
	String iSBN; // null
	String title; // null
	String author; // null
	short noOfPages; // 0
	boolean available; // false
	@Override
	public String toString() {
		String objectToString =  iSBN + "\t" + title+ "\t" + author+ "\t" + noOfPages+ "\t" + available;
		return objectToString;
	}
//	public void getDetails() {
//		System.err.print(iSBN + "\t");
//		System.err.print(title+ "\t");
//		System.err.print(author+ "\t");
//		System.err.print(noOfPages+ "\t");
//		System.err.println(available);
//	}
	
	
}