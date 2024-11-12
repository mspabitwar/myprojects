package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P05_ReversePartOfArray {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
			}

			System.out.println("Enter indices for partical reverse");
			int startIndex = scanner.nextInt();
			int endIndex = scanner.nextInt();

			System.out.print("Array Before Part Reverse : ");
			for (int index = 0; index < size; index++) {
				System.out.print(numbers[index] + " ");
			}
			System.out.println();
			reverse(numbers, startIndex, endIndex);

			System.out.print("Array After Part Reverse : ");
			for (int index = 0; index < size; index++) {
				System.out.print(numbers[index] + " ");
			}
		}
	}

	private static void reverse(int[] numbers, int startIndex, int endIndex) {

		int left = startIndex;
		int right = endIndex;
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