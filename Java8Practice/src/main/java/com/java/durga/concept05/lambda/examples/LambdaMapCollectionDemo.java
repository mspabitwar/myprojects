package com.java.durga.concept05.lambda.examples;

import java.util.Map;
import java.util.TreeMap;

public class LambdaMapCollectionDemo {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new TreeMap<>();
		map1.put(200, "Sunny");
		map1.put(400, "Bunny");
		map1.put(100, "Munny");
		map1.put(500, "Chinny");
		map1.put(300, "Shiny");
		System.out.println("With Natural Sorting : " + map1);

		Map<Integer, String> map2 = new TreeMap<>((n1, n2) -> n2 - n1);
		map2.put(200, "Sunny");
		map2.put(400, "Bunny");
		map2.put(100, "Munny");
		map2.put(500, "Chinny");
		map2.put(300, "Shiny");
		System.out.println("With Natural Sorting : " + map2);
	}
}