package com.demo.basics;
public class StringConstantPool {
	public static void main(String[] args) {
		// STRING CONSTANT POOL
//		stringConstantPool();
//		heapMemory();
		testEquals();
	}

	public static void stringConstantPool() {
		Integer integer = 127;
		Integer integer2 = 127;
		System.out.println(integer == integer2);
		// Program 1: Comparing two references to objects
		// created using literals.
        // String are immutable
		// stored in string constant pool
		String companyString = "FictitiousCompany";
		String companyNameString = "FictitiousCompany";
		// Note that this == compares whether
		// companyString and companyNameString refer to same object or not

		if (companyString == companyNameString) {
			System.out.println("Objects are identical");
		} else
			System.out.println("Objects are non identical");
		
	}

	public static void heapMemory() {
		// Program 2: Comparing two references to objects
		// created using new operator.
		String companyString = new String("FictitiousCompany");
		String companyNameString = new String("FictitiousCompany");

		// Note that this == compares whether
		// s1 and s2 refer to same object or not

		if (companyString == companyNameString) {
			System.out.println("Objects are identical");
		} else
			System.out.println("Objects are non identical");
	}

	public static void testEquals() {
		String companyString = "FictitiousCompany";
		String companyNameString = "FictitiousCompany";

		if (companyString == companyNameString) {
			System.out.println("Objects are same / identical");
		}
		if (companyString.equals(companyNameString)) {
			System.out.println("Objects are equal");
		}
//		     reference = instance
//			 variable = object
		String companyString1 = new String("FictitiousCompanyChennai");
		String companyNameString1 = new String("FictitiousCompanyChennai");

		if (companyString1 == companyNameString1)
			System.out.println("Objects are same");
		else
			System.out.println("Objects are not same / not identical");
		if (companyString1.equals(companyNameString1)) {
			System.out.println("Objects are equal");
		}
	}
}
