package com.dsa.practice.programs;

public class SelectionSort {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 1, 2, 10, 8, 7, 3, 5 };
		System.out.print("Array Before selection sort : ");
		display(inputArray);
		selectionSort(inputArray);
		System.out.print("Array After selection sort : ");
		display(inputArray);
	}

	private static void display(int[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.print("\n");
	}

	private static void selectionSort(int[] inputArray) {
		for (int passIndex = 0; passIndex < inputArray.length - 1; passIndex++) {
			System.out.println("Working on pass " + (passIndex + 1));

			int indexOfMinElement = passIndex;
			
			for (int comparisonIndex = (passIndex + 1); comparisonIndex < inputArray.length; comparisonIndex++) {
				if(inputArray[comparisonIndex] < inputArray[indexOfMinElement]) {
					indexOfMinElement = comparisonIndex;
				}
			}
			
			int temp = inputArray[passIndex];
			inputArray[passIndex] = inputArray[indexOfMinElement];
			inputArray[indexOfMinElement] = temp;
		}
	}
}