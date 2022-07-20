package com.demo.exceptions;

import java.util.ArrayList;

public class UserDefinedExceptionCartEmptyEx {
	public static void main(String[] args) {
		System.err.println("UI");
		try {
			displayCart();
		} catch (CartEmptyException cartEmptyException) {
			System.err.println(cartEmptyException.getClass());
			System.err.println("Oh noooo......  " + cartEmptyException.getMessage());
		}

	}

	private static void displayCart() throws CartEmptyException {
		ArrayList<String> cartArrayList = new ArrayList<>();
//		cartArrayList.add("Pen");
		if (cartArrayList.isEmpty()) {
			CartEmptyException cartEmptyException = new CartEmptyException("Cart is Empty");
			throw cartEmptyException;
		} else {
			System.err.println("Cart items diplayed");
		}
	}
}

// User Defined / Custom Exception
class CartEmptyException extends RuntimeException {
	public CartEmptyException(String message) {
		super(message);
	}
}