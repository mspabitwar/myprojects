package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P6_RotateArray {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
			}

			System.out.println("Enter number of rotations");
			int numberOfRotations = scanner.nextInt();

			System.out.print("Array Before Rotation : ");
			for (int index = 0; index < size; index++) {
				System.out.print(numbers[index] + " ");
			}
			System.out.println();

			numberOfRotations = numberOfRotations % size;

			reverse(numbers, 0, size - 1);
			reverse(numbers, 0, numberOfRotations - 1);
			reverse(numbers, numberOfRotations, size - 1);

			System.out.print("Array After " + numberOfRotations + " Rotation : ");
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