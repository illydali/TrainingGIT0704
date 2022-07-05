package com.demo.basics;

// IP try out different primitive datatypes
public class CalculatorApp {
	// overloaded method
	static void add(int num1, float num2) {
		System.out.println("Add int, float " + (num1 + num2));
	}

	// same signature
//	static void add(int num3, float num4) {
//		System.out.println("Add int, float " + (num1 + num2));
//	}
	public static void main(String[] args) {
		System.out.println("Standard Output");
		System.err.println("Standard Error");
		// calling / invoking the function
		// caller -10 (int) 20 (int)
		// add(int, int)
		add(-10, 20);
		add(10, 20);
		add(10, 20.30f);

		// fetching the return value
		int result = mul(10, 10);
		System.out.println("Mul " + result);

		int num[] = { 10, 5 };
		subtract(num);

//		instance created
		CalculatorApp calculatorAppObject = new CalculatorApp();
		calculatorAppObject.divide(10, 5);
	}

//	declaring static method
// return type / method name / ( parameters)
	// called
	// overloaded method
	static void add(int num1, int num2) {
		if (num1 < 0) {
			System.err.println("Number  cannot be negative");
			return;
		}
		System.out.println("Add int, int " + (num1 + num2));
	}

	static int mul(int num1, int num2) {
		return num1 * num2;
	}

	// array as parameter
	static void subtract(int[] numbers) {
		System.out.println("Subtract " + (numbers[0] - numbers[1]));
	}

	// instance method
	void divide(int num1, int num2) {
		System.out.println("Divide " + (num1 / num2));
	}
}
