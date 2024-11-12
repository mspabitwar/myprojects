package com.algoprep.topic02.arrays;

import java.util.Scanner;

public class P03_SwapTwoVariables {

	public static void main(String[] args) {

		// 1. variables are disconnected across function calls
		// 2. arrays are connected across function calls

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number 1");
			int number1 = scanner.nextInt();

			System.out.println("Enter number 2");
			int number2 = scanner.nextInt();

			System.out.println("Method1: Swapping using varibales");
			System.out.println("Before Swapping: number1 = " + number1 + " and number2 = " + number2);
			swapUsingVariables(number1, number2);
			System.out.println("After Swapping: number1 = " + number1 + " and number2 = " + number2);

			System.out.println("Method2: Swapping using arrays");
			int[] numArr = { number1, number2 };
			System.out.println("Before Swapping: number1 = " + numArr[0] + " and number2 = " + numArr[1]);
			swapUsingArrays(numArr);
			System.out.println("After Swapping: number1 = " + numArr[0] + " and number2 = " + numArr[1]);

		}
	}

	private static void swapUsingVariables(int number1, int number2) {
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}

	private static void swapUsingArrays(int[] numArr) {
		int temp = numArr[0];
		numArr[0] = numArr[1];
		numArr[1] = temp;
	}
}