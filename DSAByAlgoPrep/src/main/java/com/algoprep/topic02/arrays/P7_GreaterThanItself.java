package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P7_GreaterThanItself {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
			}

			int count = getTotalCountGreaterThanItself(numbers);
			System.out.println("Total number of elements having at least one element greater than element = " + count);
		}
	}

	private static int getTotalCountGreaterThanItself(int[] numbers) {
		int max = numbers[0];
		int maxCount = 0;

		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > max) {
				max = numbers[index];
				maxCount = 1;
			} else if (numbers[index] == max) {
				maxCount++;
			}
		}

		return numbers.length - maxCount;
	}
}