package com.collection02.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		doTimings(arrayList);
		doTimings(linkedList);

	}

	private static void doTimings(List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		// Adding at end
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		// Adding at start
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken : " + (end - start) + " ms for " + list.getClass().getSimpleName());
	}
}