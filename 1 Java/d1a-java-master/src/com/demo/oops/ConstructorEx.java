package com.demo.oops;

public class ConstructorEx {
public static void main(String[] args) {
//	reference
	Product1 product1 = null;
//	instantiation
	// constructor called automatically with new keyword
	product1 = new Product1();
	System.err.println(product1);
	
	Product1 product2 = null;
	product2 = new Product1("P02", "Mobile");
	System.err.println(product2);
}
}

class Product1 {
	private String productId = null;
	private String productName = null;

	// constructor
//	same as class name
	// zero params / default constructor
//	no return type
// called automatically when you create an instance
	public Product1() {
		System.err.println("default cons()");
		productId = "P01";
		productName = "Laptop";
	}

	// overloading
	// happens with methods in same class
	// multiple functions with same name / different parameters
	// constructor overloading
	
	public Product1(String pProductId, String pProductName ) {
		System.err.println("default cons()");
		productId = pProductId;
		productName = pProductName;
	}
	
	@Override
	public String toString() {
		return "Product1 [productId=" + productId + ", productName=" + productName + "]";
	}
	
}