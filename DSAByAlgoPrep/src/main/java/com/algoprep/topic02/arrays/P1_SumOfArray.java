package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P1_SumOfArray {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			int sum = 0;

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
				sum += numbers[index];
			}

			System.out.println("Sum = " + sum);

		}
	}
}