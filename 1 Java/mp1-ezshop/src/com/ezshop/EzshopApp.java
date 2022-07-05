package com.ezshop;

import java.util.Scanner;

import com.ezshop.model.Product;

public class EzshopApp {
public static void main(String[] args) {
	System.err.println("Welcome to Ezshop");
//	addProduct();
	addProductsToArray();
}

private static void addProduct() {
	System.out.println("Add Product");
	Scanner scanner = new Scanner(System.in);
	System.out.println("ISBN : ");
	String iSBN = scanner.nextLine();
	System.out.println("Title : ");
	String title = scanner.nextLine();
	System.out.println("Author : ");
	String author = scanner.nextLine();
//	System.out.println(iSBN);
//	System.out.println(title);
//	System.out.println(author);
	System.out.println("No Of Pages : ");
	String noOfPagesString = scanner.nextLine();
	short noOfPages = Short.parseShort(noOfPagesString); // 0
	System.out.println("Available : ");
	String availableString = scanner.nextLine();
	boolean available; // false
	if(availableString.equals("yes")) {
		available = true;
	}
	else {
		available = false;
	}
	
	//create new product
	Product product = new Product(iSBN,title,author);
	product.getDetails();
	
	Product product1 = new Product(iSBN,title,author,noOfPages,available);
	product1.getDetails();
}
private static void addProductsToArray() {

	
	//create new product
	Product product1 = new Product("ISBN1", "SWY", "SIMON");
	
	Product product2 =  new Product("ISBN1", "SWY", "SIMON",(short)50,true);
	
	Product products[] = new Product[2];
	products[0] = product1;
	products[1] = product2;
	
	products[0].getDetails();
	products[1].getDetails();
	
}
}
