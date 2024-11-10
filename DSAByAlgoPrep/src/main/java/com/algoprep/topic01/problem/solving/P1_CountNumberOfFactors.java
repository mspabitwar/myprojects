package com.algoprep.topic01.problem.solving;

import java.util.Scanner;

public class P1_CountNumberOfFactors {

	public static void main(String[] args) {

		// Test for different input like 24, 36, 10e9 (1000000000)

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter any number for which number of factors to be counted");
			int number = scanner.nextInt();
			int count = 0;

			long startTime = System.currentTimeMillis();
			System.out.println("Calculating number of factors using brute force approach");
			for (int factor = 1; factor <= number; factor++) {
				if (number % factor == 0) {
					count++;
				}
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Number of factors for " + number + " = " + count);
			System.out.println("Time Taken = " + (endTime - startTime) + " milliseconds");

			count = 0;

			startTime = System.currentTimeMillis();
			System.out.println("Calculating number of factors using optiomized approach");

			for (int factor = 1; factor * factor <= number; factor++) {
				if (number % factor == 0) {
					if (factor == number / factor)
						count = count + 1;
					else
						count = count + 2;
				}
			}

			endTime = System.currentTimeMillis();
			System.out.println("Number of factors for " + number + " = " + count);
			System.out.println("Time Taken = " + (endTime - startTime) + " milliseconds");
		}
	}
}