package com.dsa.practice.programs;

public class BubbleSort {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 1, 2, 10, 8, 7, 3, 5 };
		System.out.print("Array Before bubble sort : ");
		display(inputArray);
		bubbleSort(inputArray);
		System.out.print("Array After bubble sort : ");
		display(inputArray);

		inputArray = new int[] { 1, 2, 10, 8, 7, 3, 5 };
		System.out.print("Array Before bubble sort adaptive : ");
		display(inputArray);
		bubbleSortAdaptive(inputArray);
		System.out.print("Array After bubble sort adaptive : ");
		display(inputArray);

		inputArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Array Before bubble sort adaptive : ");
		display(inputArray);
		bubbleSortAdaptive(inputArray);
		System.out.print("Array After bubble sort adaptive : ");
		display(inputArray);
	}

	private static void display(int[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.print("\n");
	}

	private static void bubbleSort(int[] inputArray) {
		for (int passIndex = 0; passIndex < inputArray.length - 1; passIndex++) {
			System.out.println("Working on pass " + (passIndex + 1));

			for (int comparisonIndex = 0; comparisonIndex < (inputArray.length - 1 - passIndex); comparisonIndex++) {
				if (inputArray[comparisonIndex] > inputArray[comparisonIndex + 1]) {
					int temp = inputArray[comparisonIndex + 1];
					inputArray[comparisonIndex + 1] = inputArray[comparisonIndex];
					inputArray[comparisonIndex] = temp;
				}
			}
		}
	}

	private static void bubbleSortAdaptive(int[] inputArray) {
		for (int passIndex = 0; passIndex < inputArray.length - 1; passIndex++) {
			System.out.println("Working on pass " + (passIndex + 1));
			boolean isSorted = true;
			for (int comparisonIndex = 0; comparisonIndex < (inputArray.length - 1 - passIndex); comparisonIndex++) {
				if (inputArray[comparisonIndex] > inputArray[comparisonIndex + 1]) {
					int temp = inputArray[comparisonIndex + 1];
					inputArray[comparisonIndex + 1] = inputArray[comparisonIndex];
					inputArray[comparisonIndex] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				return;
			}
		}
	}
}