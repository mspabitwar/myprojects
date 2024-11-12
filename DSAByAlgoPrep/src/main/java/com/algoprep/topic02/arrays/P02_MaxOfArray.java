package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P02_MaxOfArray {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
			}

			int max = numbers[0];
			// int max = Integer.MIN_VALUE; in this case, index should start from 0

			for (int index = 1; index < size; index++) {
				max = numbers[index] > max ? numbers[index] : max;
			}

			System.out.println("Max = " + max);
		}
	}
}