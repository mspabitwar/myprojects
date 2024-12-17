package com.algoprep.topic04.bit.manipulation;

import java.util.Scanner;

public class P04_FindUniqueElement {

	public static void main(String[] args) {

		// Given array[n], every element appears twice except for one element which
		// appears once. Find that unique element

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			int[] numbers = new int[size];

			int uniqueElement = 0;

			System.out.println("Enter elements of array");
			for (int index = 0; index < size; index++) {
				numbers[index] = scanner.nextInt();
				uniqueElement ^= numbers[index];
			}

			System.out.println("Unique Element = " + uniqueElement);

		}
	}
}