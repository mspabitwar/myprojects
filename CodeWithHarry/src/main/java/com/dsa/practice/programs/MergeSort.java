package com.dsa.practice.programs;

public class MergeSort {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
		System.out.print("Array Before merge sort : ");
		display(inputArray);
		mergeSort(inputArray, 0, inputArray.length - 1);
		System.out.print("Array After merge sort : ");
		display(inputArray);
	}

	private static void display(int[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.print("\n");
	}

	private static void mergeSort(int[] inputArray, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(inputArray, low, mid);
			mergeSort(inputArray, mid + 1, high);
			merge(inputArray, low, mid, high);
		}
	}

	private static void merge(int[] inputArray, int low, int mid, int high) {
		int leftIndex = low;
		int rightIndex = mid + 1;
		int temp[] = new int[high - low + 1];
		int tempIndex = 0;

		while (leftIndex <= mid && rightIndex <= high) {
			if (inputArray[leftIndex] < inputArray[rightIndex]) {
				temp[tempIndex++] = inputArray[leftIndex++];
			} else {
				temp[tempIndex++] = inputArray[rightIndex++];
			}
		}

		while (leftIndex <= mid) {
			temp[tempIndex++] = inputArray[leftIndex++];
		}

		while (rightIndex <= high) {
			temp[tempIndex++] = inputArray[rightIndex++];
		}

		leftIndex = low;
		for (tempIndex = 0; tempIndex < temp.length; tempIndex++) {
			inputArray[low++] = temp[tempIndex];
		}
	}
}