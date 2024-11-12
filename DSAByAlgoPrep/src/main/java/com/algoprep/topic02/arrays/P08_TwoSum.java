package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P08_TwoSum {

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
		int size = numbers.length;

		for (int index1 = 0; index1 <= (size - 2); index1++) {
			for (int index2 = index1 + 1; index2 <= (size - 1); index2++) {
				if (numbers[index1] + numbers[index2] == targetSum) {
					exist = true;
					break;
				}
			}
		}

		return exist;
	}
}