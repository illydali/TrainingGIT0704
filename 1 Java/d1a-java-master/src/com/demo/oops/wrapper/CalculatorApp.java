package com.demo.oops.wrapper;

public class CalculatorApp {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		Integer num1Integer = 1;
		int toInt = num1Integer;
		Integer num2Integer = 2;
//		auto-boxing : conversion of primitive to wrapper
add(num1Integer, num2Integer);
//		add((Integer)1, (Integer) 3);
add(1, 1.1f);
add(1.1f, 2);
add(1.1f, 2.1f);
	}
	static void add(Number num1, Number num2) {
//		System.out.println(num1 instanceof Integer);
//		System.out.println(num2 instanceof Float);
//		System.out.println(num1.intValue() + num2.floatValue());

		if(num1 instanceof Integer && num2 instanceof Integer) {
			System.out.println(num1.intValue() + num2. intValue());
		}
		if(num1 instanceof Integer && num2 instanceof Float) {
			System.out.println(num1.intValue() + num2. floatValue());
		}
		if(num1 instanceof Float && num2 instanceof Integer) {
			System.out.println(num1.floatValue() + num2. intValue());
		}
		if(num1 instanceof Float && num2 instanceof Float) {
			System.out.println(num1.floatValue() + num2. floatValue());
		}
	}
	
}
