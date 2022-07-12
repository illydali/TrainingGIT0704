package com.demo.basics;

public class CompilationErrorEx {
//	instance variable
	String nameString = "Sam";

	public static void main(String[] args) {
//	Cannot make a static reference to the non-static field nameString
//	System.out.println(nameString);
		CompilationErrorEx object = new CompilationErrorEx();
		System.out.println(object.nameString);
		
		// [] after var name
		// [] after data type
		int array[];
		int [] array1;
		// [] after data type
		int [] array2 [];
//		int [3] array3 [];
//		int [] array3 [3];
//		size to the right during inititialization
		int array5[] = new int [3];
		int marks[] = {20,30,50};
		
		
// what error?
		int n1 = 10;
		int  n2 = 10;
		int n3 = 10;
		System.out.println(n1+(n2*n3));
	}
}

