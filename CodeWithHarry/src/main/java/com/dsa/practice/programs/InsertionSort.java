package com.dsa.practice.programs;

public class InsertionSort {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 1, 2, 10, 8, 7, 3, 5 };
		System.out.print("Array Before insertion sort : ");
		display(inputArray);
		insertionSort(inputArray);
		System.out.print("Array After insertion sort : ");
		display(inputArray);
	}

	private static void display(int[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.print("\n");
	}

	private static void insertionSort(int[] inputArray) {
		for (int passIndex = 1; passIndex <= inputArray.length - 1; passIndex++) {
			System.out.println("Working on pass " + passIndex);

			int elementToCompare = inputArray[passIndex];
			int comparisonIndex;
			
			for (comparisonIndex = (passIndex - 1); comparisonIndex >= 0; comparisonIndex--) {
				if (inputArray[comparisonIndex] > elementToCompare) {
					inputArray[comparisonIndex + 1] = inputArray[comparisonIndex];
				} else {
					break;
				}
			}
			
			inputArray[comparisonIndex + 1] = elementToCompare;
		}
	}
}