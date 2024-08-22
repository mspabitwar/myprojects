package com.collection03.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(8, "Eight");
		hashmap.put(2, "Two");
		hashmap.put(4, "Four");
		hashmap.put(6, "Six");

		System.out.println(hashmap.get(8));

		for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}