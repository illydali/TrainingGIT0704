package demo.collections;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx {
	public static void main(String[] args) {
		// IP : Create Integer ArraysList of ages.
		Vector<String> colors = new Vector<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Yellow");
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

//		for (String colorString : colors) {
//			System.out.println(colorString);
//		}
//
//		String second = colors.get(1);
//		System.out.println(second);
//
//		colors.remove(1);
//		colors.remove("Green");
		
		
//		ArrayList<String> colorsToBeRemovedList = new ArrayList<String>();
//		colorsToBeRemovedList.add("Red");
//		colorsToBeRemovedList.add("Green");
//		colors.removeAll(colorsToBeRemovedList);
//		System.out.println(colors);
	}
}
