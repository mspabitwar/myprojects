package com.algoprep.topic06.recursion;

import java.util.Scanner;

public class P01_SumOfNumbers {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number upto which sum need to be calculated");
			int number = scanner.nextInt();
			int totalSum = sum(number);

			System.out.println("Sum of numbers from 1 to " + number + " = " + totalSum);
		}
	}

	private static int sum(int number) {

		if (number == 1)
			return 1;

		int temp = sum(number - 1);
		return temp + number;
	}
}