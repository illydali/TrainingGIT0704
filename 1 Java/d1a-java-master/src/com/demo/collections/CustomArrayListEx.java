package com.demo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomArrayListEx {
public static void main(String[] args) {
	begin();
}

private static void begin() {
	// IP : Create Integer ArraysList of ages.
	List<String> colors = new UniqueArrayList();
	colors.add("Red");
	colors.add("Blue");
	colors.add("Green");
	colors.add("Orange");
	colors.add("Yellow");
	colors.add(3, "Violet");
	colors.add("Orange");
//	colors.add(null);
	colors.add("Apple");
//	colors.add(null);
	System.out.println(colors);
	String color1 = colors.get(4);
	String color2 = colors.get(6);
	if(color1.equals(color2))
		{
		System.out.println("Colors are same");
		}
	else {
		 System.err.println ("Colors are not same");
	}
	System.out.println(colors.get(4));
	System.out.println(colors);
	System.err.println(colors.size());
	System.err.println(colors.isEmpty());
	colors.remove("Blue");
	System.err.println(colors.size());
	System.out.println(colors);
	colors.clear();
	System.err.println(colors.isEmpty());
	System.out.println(colors);

//	for (String colorString : colors) {
//		System.out.println(colorString);
//	}
//
//	String second = colors.get(1);
//	System.out.println(second);
//
//	colors.remove(1);
//	colors.remove("Green");
	
	
//	ArrayList<String> colorsToBeRemovedList = new ArrayList<String>();
//	colorsToBeRemovedList.add("Red");
//	colorsToBeRemovedList.add("Green");
//	colors.removeAll(colorsToBeRemovedList);
//	System.out.println(colors);
}
}

class UniqueArrayList extends ArrayList<String> {
	@Override
	public boolean add(String elementToAdd) {
//	traditional way of iterate
//		boolean duplicate = false;
		boolean addSuccess  = false;
		for(int elementIndex = 0; elementIndex<this.size(); elementIndex++) {
			String elementInList = this.get(elementIndex);
			if(elementToAdd.equals(elementInList)) {
				try {
//					duplicate = true;
					Exception duplicateElementException = new Exception("Duplicate not allowed !");
					throw duplicateElementException;		
				}
				catch (Exception duplicateElementException) {
//					System.err.println(duplicateElementException);
					System.err.println(duplicateElementException.getMessage());
					return false;
				}
			}
		}
//		if(!duplicate) {
//			 addSuccess =  super.add(elementToAdd);
//		}
		return super.add(elementToAdd);
	}
	
}
