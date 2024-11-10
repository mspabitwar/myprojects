package com.algoprep.topic01.problem.solving;

import java.util.Scanner;

public class P2_PrimeNumber {

	public static void main(String[] args) {

		// Test for different input like 13, 15

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number to check if it is prime or not");
			int number = scanner.nextInt();
			int count = 0;

			for (int factor = 1; factor * factor <= number; factor++) {
				if (number % factor == 0) {
					if (factor == number / factor)
						count = count + 1;
					else
						count = count + 2;
				}
			}

			System.out.println(number + " is " + (count == 2 ? "prime" : "not a prime") + " number");

		}
	}
}