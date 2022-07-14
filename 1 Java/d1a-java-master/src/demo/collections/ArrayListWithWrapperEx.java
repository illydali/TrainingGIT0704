package demo.collections;

import java.util.ArrayList;

public class ArrayListWithWrapperEx {
public static void main(String[] args) {
	ArrayList arrayList = new ArrayList();
	Integer integer = 10;
	Float float1 = 100.10f;
	Boolean boolean1 = true;
	Double double1 = 4.4d;
	
	arrayList.add(integer);
	arrayList.add(float1);
	arrayList.add(boolean1);
	arrayList.add(double1);
	arrayList.add("This is a string, and Gazali is a KING");
	
	System.out.println(arrayList);
}
}
