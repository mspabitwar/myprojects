package com.algoprep.topic06.recursion;

import java.util.Scanner;

public class P02_FactorialOfNumber {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number for factorial calculation");
			int number = scanner.nextInt();
			int factorial = factorial(number);

			System.out.println("Factorial of " + number + " = " + factorial);
		}
	}

	private static int factorial(int number) {

		if (number == 0)
			return 1;

		int temp = factorial(number - 1);
		return temp * number;
	}
}