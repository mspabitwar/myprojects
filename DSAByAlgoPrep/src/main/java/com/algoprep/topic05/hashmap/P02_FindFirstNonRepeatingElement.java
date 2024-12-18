package com.algoprep.topic05.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_FindFirstNonRepeatingElement {

	public static void main(String[] args) {

		// Given array[n] and queries[m], for every query, find the frequency of
		// elements in array

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int arraySize = scanner.nextInt();
			int[] numbers = new int[arraySize];
			System.out.println("Enter elements of array");
			for (int index = 0; index < arraySize; index++) {
				numbers[index] = scanner.nextInt();
			}

			Map<Integer, Integer> countMap = new HashMap<>();

			for (int number : numbers) {
				if (countMap.containsKey(number)) {
					countMap.put(number, countMap.get(number) + 1);
				} else {
					countMap.put(number, 1);
				}
			}

			for (int number : numbers) {
				if (countMap.get(number) == 1) {
					System.out.println("First Non Repeating Element = " + number);
					return;
				}
			}

			System.out.println("There are no non repeating elements");
		}
	}
}