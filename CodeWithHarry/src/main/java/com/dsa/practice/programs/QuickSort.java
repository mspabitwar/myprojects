package com.dsa.practice.programs;

public class QuickSort {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
		System.out.print("Array Before quick sort : ");
		display(inputArray);
		quickSort(inputArray, 0, inputArray.length - 1);
		System.out.print("Array After quick sort : ");
		display(inputArray);
	}

	private static void display(int[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.print("\n");
	}

	private static void quickSort(int[] inputArray, int low, int high) {

		if (low < high) {
			int partitionIndex = partition(inputArray, low, high);
			quickSort(inputArray, low, partitionIndex - 1);
			quickSort(inputArray, partitionIndex + 1, high);
		}
	}

	private static int partition(int[] inputArray, int low, int high) {
		int pivotElement = inputArray[low];
		int leftIndex = low + 1;
		int rightIndex = high;

		do {
			while (leftIndex<= high && inputArray[leftIndex] <= pivotElement) {
				leftIndex++;
			}

			while (inputArray[rightIndex] > pivotElement) {
				rightIndex--;
			}

			if (leftIndex <= rightIndex) {
				int temp = inputArray[leftIndex];
				inputArray[leftIndex] = inputArray[rightIndex];
				inputArray[rightIndex] = temp;
			}
		} while (leftIndex < rightIndex);

		inputArray[low] = inputArray[rightIndex];
		inputArray[rightIndex] = pivotElement;

		return rightIndex;
	}
}