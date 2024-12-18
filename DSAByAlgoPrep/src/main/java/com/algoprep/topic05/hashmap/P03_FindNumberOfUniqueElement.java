package com.algoprep.topic05.hashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P03_FindNumberOfUniqueElement {

	public static void main(String[] args) {

		// Given array[n], find number of unique elements in array

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int arraySize = scanner.nextInt();
			int[] numbers = new int[arraySize];
			System.out.println("Enter elements of array");
			for (int index = 0; index < arraySize; index++) {
				numbers[index] = scanner.nextInt();
			}

			Set<Integer> set = new HashSet<>();

			for (int number : numbers) {
				set.add(number);
			}

			System.out.println("Number of unique elements = " + set.size());
		}
	}
}