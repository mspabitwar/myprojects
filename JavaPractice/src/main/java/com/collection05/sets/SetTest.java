package com.collection05.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

		// hashset does not retain any order
		Set<String> set1 = new HashSet<>();

		// linkedhashset remembers the order you added items in
		//set1 = new LinkedHashSet<>();

		// treeset sorts in natural order
		//set1 = new TreeSet<>();

		if (set1.isEmpty()) {
			System.out.println("set1 is empty at the start");
		}
		set1.add("cat");
		set1.add("dog");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		// Adding duplicate item does nothing
		set1.add("cat");
		if (set1.isEmpty()) {
			System.out.println("set1 is empty after adding");
		}
		System.out.print(set1.getClass().getSimpleName() + " : ");
		System.out.println(set1);

		// Iteration
		for (String element : set1) {
			System.out.println(element);
		}

		// Does set contain a given item?
		if (set1.contains("mahesh")) {
			System.out.println("contains mahesh");
		}

		if (set1.contains("cat")) {
			System.out.println("contains cat");
		}
		
		//set2 contains some common elements with set1 and some new
		Set<String> set2 = new HashSet<>();
		set2.add("tiger");
		set2.add("lion");
		set2.add("cat");
		set2.add("dog");
		
		//Intersection
		Set<String> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		//Difference
		Set<String> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}
}