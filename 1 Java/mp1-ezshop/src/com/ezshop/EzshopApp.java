package com.ezshop;

import java.util.ArrayList;
import java.util.Scanner;

import com.ezshop.model.Product;

public class EzshopApp {
	public static void main(String[] args) {
		System.err.println("Welcome to Ezshop");
//	addProduct();
//	addProductsToArray();
//		addProductsToArrayList();
		addProductsToArrayListFromUser();
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
		if (availableString.equals("yes")) {
			available = true;
		} else {
			available = false;
		}

		// create new product
		Product product = new Product(iSBN, title, author);
		product.getDetails();

		Product product1 = new Product(iSBN, title, author, noOfPages, available);
		product1.getDetails();
	}

	private static void addProductsToArray() {
// IP : store ISBN, author and title in separate arrays (3 products)
// accept 1,2,3 & print the product details.

		// create new product
		Product product1 = new Product("ISBN1", "SWY", "SIMON");

		Product product2 = new Product("ISBN1", "SWY", "SIMON", (short) 50, true);

		Product products[] = new Product[2];
		products[0] = product1;
		products[1] = product2;

		products[0].getDetails();
		products[1].getDetails();

	}

	private static void addProductsToArrayList() {
		ArrayList<Product> productsList = new ArrayList<Product>();
		Product product1 = new Product("ISBN1", "SWY", "SIMON");
		Product product2 = new Product("ISBN1", "SWY", "SIMON", (short) 50, true);
		productsList.add(product1);
		productsList.add(product2);

		for (Product product : productsList) {
			product.getDetails();
		}

		for (int i = 1; i < 10000; i++) {
			productsList.add(new Product("ISBN" + i, "BOOK" + i, "Autor" + i));
		}

		for (Product product : productsList) {
			product.getDetails();
		}
	}

	private static void addProductsToArrayListFromUser() {
		ArrayList<Product> productsList = new ArrayList<Product>();
		Scanner scanner = new Scanner(System.in);
		Product product1 = new Product(scanner.nextLine(),scanner.nextLine(), scanner.nextLine());
		Product product2 = new Product(scanner.nextLine(),scanner.nextLine(), scanner.nextLine());
		productsList.add(product1);
		productsList.add(product2);
		for (Product product : productsList) {
			product.getDetails();
		}
	}
}
