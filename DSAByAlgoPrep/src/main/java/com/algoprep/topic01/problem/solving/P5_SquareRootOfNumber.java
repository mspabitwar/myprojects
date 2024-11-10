package com.algoprep.topic01.problem.solving;

import java.util.Scanner;

public class P5_SquareRootOfNumber {

	public static void main(String[] args) {

		// Given n, return floor(sqrt(n))

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number for calculating square root of it");
			int number = scanner.nextInt();
			int sqrt = 1;
			int factor = 1;

			while (factor * factor <= number) {
				sqrt = factor++;
			}

			System.out.println("square root of " + number + " is " + sqrt);

		}
	}
}