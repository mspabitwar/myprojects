package com.collection01.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(40);
		numbers.add(60);
		numbers.add(80);

		// Retrieving
		System.out.println(numbers.get(0));

		System.out.println("Iteration using index");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// This is fast as it does not need to move any element after deleting from last
		numbers.remove(numbers.size() - 1);

		// This is slow as it need to move elements after deleting from first
		numbers.remove(0);

		System.out.println("Iteration using advanced for loop");
		for (int number : numbers) {
			System.out.println(number);
		}

	}
}
