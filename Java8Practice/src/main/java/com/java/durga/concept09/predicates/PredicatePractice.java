package com.java.durga.concept09.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

	public static void main(String[] args) {
		// display names which start with letter K
		String[] names = {"Sunny", "Kajal", "Mallika", "Katrina", "Kareena"};
		Predicate<String> startsWithK = s -> s.startsWith("K");
		System.out.println("The names starts with K are:");
		for(String name: names) {
			if(startsWithK.test(name)) {
				System.out.println(name);
			}
		}
		
		// remove null or empty string from array
		String[] names2 = { "Durga", "", null, "Ravi", "", null, "Siva" };
		Predicate<String> validString = s -> s != null && s.length() != 0;
		List<String> validNamesList = new ArrayList<>();
		for (String name : names2) {
			if (validString.test(name)) {
				validNamesList.add(name);
			}
		}
		System.out.println("The list of valid string: " + validNamesList);
		
		// program for user authentication
	}
}