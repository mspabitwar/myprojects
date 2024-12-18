package com.algoprep.topic05.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_TwoSum {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
			}

			System.out.println("Enter target sum");
			int targetSum = scanner.nextInt();

			System.out.println("Exist any pair in array where arr[i] + arr[j] = sum where i != j ? "
					+ existSum(numbers, targetSum));
		}
	}

	private static boolean existSum(int[] numbers, int targetSum) {
		boolean exist = false;

		Map<Integer, Integer> countMap = new HashMap<>();

		for (int number : numbers) {
			if (countMap.containsKey(number)) {
				countMap.put(number, countMap.get(number) + 1);
			} else {
				countMap.put(number, 1);
			}
		}

		for (int number : numbers) {
			int requiredDifference = targetSum - number;
			if (countMap.containsKey(requiredDifference)) {
				if (number != requiredDifference) {
					exist = true;
				} else if (number != requiredDifference) {
					exist = countMap.get(requiredDifference) > 1;
				}
			}
			if (exist)
				break;
		}

		return exist;
	}
}