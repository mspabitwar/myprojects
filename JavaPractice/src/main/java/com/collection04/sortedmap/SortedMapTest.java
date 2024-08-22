package com.collection04.sortedmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<>();
		Map<Integer, String> treemap = new TreeMap<>();

		testMap(hashmap);
		testMap(linkedhashmap);
		testMap(treemap);

	}

	private static void testMap(Map<Integer, String> map) {

		map.put(8, "Eight");
		map.put(2, "Two");
		map.put(4, "Four");
		map.put(6, "Six");

		System.out.println(map.getClass().getSimpleName());

		for (Integer key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

	}
}