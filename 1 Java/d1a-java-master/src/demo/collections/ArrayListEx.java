package demo.collections;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		// IP : Create Integer ArraysList of ages.
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Yellow");
		System.out.println(colors);

//		for (String colorString : colors) {
//			System.out.println(colorString);
//		}
//
//		String second = colors.get(1);
//		System.out.println(second);
//
//		colors.remove(1);
//		colors.remove("Green");
		
		
		ArrayList<String> colorsToBeRemovedList = new ArrayList<String>();
		colorsToBeRemovedList.add("Red");
		colorsToBeRemovedList.add("Green");
		colors.removeAll(colorsToBeRemovedList);
		System.out.println(colors);
	}
}
