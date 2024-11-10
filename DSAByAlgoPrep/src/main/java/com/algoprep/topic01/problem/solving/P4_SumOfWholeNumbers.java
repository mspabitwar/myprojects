package com.algoprep.topic01.problem.solving;

import java.util.Scanner;

public class P4_SumOfWholeNumbers {

	public static void main(String[] args) {

		// Whole numbers starts from 0 so sum of first n whole number is equal to sum of first (n-1) whole numbers 

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number for calculating sum of whole numbers");
			int number = scanner.nextInt();
			int sum = 0;

			sum = (number - 1) * number / 2;

			System.out.println("Sum of first " + number + " whole numbers is " + sum);

		}
	}
}