package com.gqt.Collections;

import java.util.LinkedHashMap;

public class Linkeedhashmap {
	public static void main(String[] args) {
		LinkedHashMap<String,String>capitalCities=new LinkedHashMap<String, String>();
		//adding elements 
		capitalCities.put("England","London");
		capitalCities.put("India","New Delhi");
		capitalCities.put("Austria","Wein");
		capitalCities.put("Norway","Oslo");
		capitalCities.put("Norway","Oslo");
		
		System.out.println(capitalCities);
		System.out.println(".....................");
		System.out.println(capitalCities.get("England"));//gives London
		System.out.println(capitalCities.get("London"));//gives null value 
		System.out.println("......................");
		//remove item
		capitalCities.remove("Norway");
		System.out.println(capitalCities);
		System.out.println("...............");
		//size
		System.out.println(capitalCities.size());
		System.out.println(".............");
		for (String i : capitalCities.keySet()) {
			  System.out.println(i);
			}
		System.out.println("...........................");
		// Print values
		for (String i : capitalCities.values()) {
		  System.out.println(i);
		}
		System.out.println("...........................");
		// Print keys and values
		for (String i : capitalCities.keySet()) {
		  System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
	}

}
