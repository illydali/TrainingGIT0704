package com.demo.exceptions;

import java.util.Scanner;

public class TryWithResourcesEx {
	public static void main(String[] args) {
//closeScannner();
//		scannerWithExceptionHandling();
		tryWithResources();
	}

	private static void tryWithResources() {
				int num1 = 0;
		// java7 onwards
		try(Scanner scanner = new Scanner(System.in)) {

			String num1String = scanner.nextLine();
			num1 = Integer.parseInt(num1String);
		} catch (NumberFormatException numberFormatException) {
			System.err.println("Plese enter valid number 1");
//			num1 = Integer.parseInt(scanner.nextLine());
		}
		System.err.println(num1);
	}
	private static void scannerWithExceptionHandling() {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		// pre - java7
		try {

			String num1String = scanner.nextLine();
			num1 = Integer.parseInt(num1String);
		} catch (NumberFormatException numberFormatException) {
			System.err.println("Plese enter valid number 1");
//			num1 = Integer.parseInt(scanner.nextLine());
		}
		System.err.println(num1);
		scanner.close();
	}

	private static void closeScannner() {
		// scanner created
		Scanner scanner = new Scanner(System.in);
		// working with scanner
		System.err.println(scanner.nextLine());
		// close / good practice
		scanner.close();
	}
}
