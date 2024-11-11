package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P4_ReverseArray {

	public static void main(String[] args) {

		// Test for odd length array [10, 20, 30, 40, 50]
		// Test for even length array [10, 20, 30, 40, 50, 60]

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
			}

			System.out.print("Array Before Reverse : ");
			for (int index = 0; index < size; index++) {
				System.out.print(numbers[index] + " ");
			}
			System.out.println();
			reverse(numbers);

			System.out.print("Array After Reverse : ");
			for (int index = 0; index < size; index++) {
				System.out.print(numbers[index] + " ");
			}
		}
	}

	private static void reverse(int[] numbers) {

		int left = 0;
		int right = numbers.length - 1;
		int temp;

		while (left < right) {
			temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			left++;
			right--;
		}
	}
}