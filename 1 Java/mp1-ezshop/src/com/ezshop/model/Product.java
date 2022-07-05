package com.ezshop.model;
//create class
public class Product extends Object{
//	The default visibility is known as “package-private” 
//	(though you can't use this explicitly), 
//	which means the field will be accessible from inside 
//	the same package to which the class belongs.
//	fields
//	static String site = "Amazon"; //null
	String iSBN; // null
	String title; // null
	String author; // null
	short noOfPages; // 0
	boolean available; // false
	
	//constructor
	public Product(String piSBN, String ptitle, String pauthor) {
		iSBN = piSBN;
		title = ptitle;
		author = pauthor;
	}
	// overloaded constructor
	public Product(String piSBN, String ptitle, String pauthor,short pnoOfPages,boolean pavailable ) {
		iSBN = piSBN;
		title = ptitle;
		author = pauthor;
		noOfPages = pnoOfPages;
		available = pavailable;
	}
	public void getDetails() {
		System.err.print(iSBN + "\t");
		System.err.print(title+ "\t");
		System.err.print(author+ "\t");
		System.err.print(noOfPages+ "\t");
		System.err.println(available);
	}
}
