package com.demo.basics;

public class MainDrama {
//	JVM calls this method.
	static public   void main (String [] singaporeStrings){
	System.err.println("main");
	int numbers[] = {5,6,7};
	main(numbers);
}
	static public   void main (int [] numbers){
	System.err.println("main Integer");
}
}
