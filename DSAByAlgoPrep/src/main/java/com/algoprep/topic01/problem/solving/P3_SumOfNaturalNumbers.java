package com.algoprep.topic01.problem.solving;

import java.util.Scanner;

public class P3_SumOfNaturalNumbers {

	public static void main(String[] args) {

		// Natural numbers starts from 1

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number for calculating sum of natural numbers");
			int number = scanner.nextInt();
			int sum = 0;

			sum = number * (number + 1) / 2;

			System.out.println("Sum of first " + number + " natural numbers is " + sum);

		}
	}
}