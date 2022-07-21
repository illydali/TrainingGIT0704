package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		// check for null key and values
		Map<String, Integer> countryCodesMap = new HashMap<String, Integer>();
		System.err.println(countryCodesMap.isEmpty());
		countryCodesMap.put("Singapore", 65);
		countryCodesMap.put("India", 91);
		countryCodesMap.put("Japan".toUpperCase(),81);
		countryCodesMap.put("japan".toUpperCase(),81);
		countryCodesMap.put("jaPAN",81);
		System.err.println(countryCodesMap);
		System.err.println(countryCodesMap.size());
		// search
		boolean keyFound = countryCodesMap.containsKey("Singapore");
		if(keyFound) {
			System.err.println("Singapore in the map");
		}
		else {
			System.err.println("Singapore not in the map");
		}
//		short hand ternary operation ?:
//		String valueFoundString = countryCodesMap.containsValue(65)? "65 found for Singapore" : "65 not found for Singapore";
//		System.err.println(valueFoundString);
		
//		shorter
		System.err.println(countryCodesMap.containsValue(65)? "65 found for Singapore" : "65 not found for Singapore");
		countryCodesMap.remove("Japan");
		System.err.println(countryCodesMap);
		countryCodesMap.clear();
		System.err.println(countryCodesMap);

	}
}
