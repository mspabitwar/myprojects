package com.algoprep.topic01.problem.solving;

import java.util.Scanner;

public class P6_DifferenceBetweenProductAndSumOfDigits {

	public static void main(String[] args) {

		// Given n, return the difference between product of all digits and sum of all digits

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number");
			int number = scanner.nextInt();
			int difference = 0;

			int sum = 0;
			int product = 1;

			while (number > 0) {
				int lastDigit = number % 10;
				number = number / 10;

				sum += lastDigit;
				product *= lastDigit;
			}

			difference = product - sum;

			System.out.println("Difference between product and sum of all digits is " + difference);

		}
	}
}