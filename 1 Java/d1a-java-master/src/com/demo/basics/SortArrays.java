package com.demo.basics;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int ageArray[] = { 23, 45, 54, 65, 77, 38 };
//		traditional for loop
		for (int ctr = 0; ctr < ageArray.length; ctr++) {
			System.out.println(ageArray[ctr]);
		}
		
		Arrays.sort(ageArray);
		
//		enhanced for loop
		for(int age : ageArray ) {
			System.err.println(age);
		}
	}
}
