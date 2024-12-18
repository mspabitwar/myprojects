package com.algoprep.topic05.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_FindFrequency {

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

			System.out.println("Enter size of queries");
			int queriesSize = scanner.nextInt();
			int[] queries = new int[queriesSize];
			System.out.println("Enter elements of queries");
			for (int index = 0; index < queriesSize; index++) {
				queries[index] = scanner.nextInt();
			}

			int totalIterations = 0;
			System.out.println("Using nested loops");
			for (int query : queries) {
				int count = 0;
				for (int number : numbers) {
					totalIterations++;
					if (number == query) {
						count++;
					}
				}
				System.out.println("Frequency of " + query + " = " + count);
			}
			System.out.println("Total Iterations = " + totalIterations);
			System.out.println("-----------------------");

			totalIterations = 0;
			System.out.println("Using hashmap");
			Map<Integer, Integer> countMap = new HashMap<>();

			for (int number : numbers) {
				totalIterations++;
				if (countMap.containsKey(number)) {
					countMap.put(number, countMap.get(number) + 1);
				} else {
					countMap.put(number, 1);
				}
			}
			for (int query : queries) {
				totalIterations++;
				int count = countMap.get(query) != null ? countMap.get(query) : 0;
				System.out.println("Frequency of " + query + " = " + count);
			}
			System.out.println("Total Iterations = " + totalIterations);
		}
	}
}