package com.dsa.practice.programs;

public class CountSort {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 3, 5, 2, 0, 13, 12, 3, 0, 2, 13, 45 };
		System.out.print("Array Before count sort : ");
		display(inputArray);
		countSort(inputArray);
		System.out.print("Array After count sort : ");
		display(inputArray);
	}

	private static void display(int[] inputArray) {
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.print("\n");
	}

	private static void countSort(int[] inputArray) {

		int arrayIndex = 0;
		int countIndex = 0;
		
		int max = finaMax(inputArray);
		int[] countArray = new int[max + 1];
		
		for(arrayIndex = 0; arrayIndex < inputArray.length; arrayIndex++) {
			countArray[inputArray[arrayIndex]] = countArray[inputArray[arrayIndex]] + 1; 
		}
		
		arrayIndex = 0;
		
		while(countIndex < countArray.length) {
			if(countArray[countIndex] == 0) {
				countIndex++;
			} else {
				inputArray[arrayIndex++] = countIndex;
				countArray[countIndex]--;
			}
		}
	}

	private static int finaMax(int[] inputArray) {
		int max = inputArray[0];
		for (int index = 1; index < inputArray.length; index++) {
			if (inputArray[index] > max) {
				max = inputArray[index];
			}
		}
		return max;
	}
}