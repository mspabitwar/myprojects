package com.algoprep.topic06.recursion;

import java.util.Scanner;

public class P04_PowerCalculation {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter two numbers a and n to calculate a^n");
			int a = scanner.nextInt();
			int n = scanner.nextInt();
			int power = power1(a, n);
			System.out.println(a + " to the power " + n + " using approach 1 = " + power);

			power = power2(a, n);
			System.out.println(a + " to the power " + n + " using approach 2 = " + power);
		}
	}

	private static int power1(int a, int n) {

		if (n == 0)
			return 1;

		int temp = power1(a, n - 1);
		return temp * a;
	}

	private static int power2(int a, int n) {

		if (n == 0)
			return 1;

		int temp = power2(a, n / 2);

		if (n % 2 == 0) {
			// even power
			return temp * temp;
		} else {
			// odd power
			return temp * temp * a;
		}
	}
}