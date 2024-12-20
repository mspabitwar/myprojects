package com.algoprep.topic06.recursion;

import java.util.Scanner;

public class P03_FibonacciSequence {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter which term in fibonacci series need to be calculated");
			int term = scanner.nextInt();
			int fib = fibonacci(term);

			System.out.println(term + " term in fibonacci series = " + fib);
		}
	}

	private static int fibonacci(int term) {

		if (term == 0)
			return 0;

		if (term == 1)
			return 1;

		int temp1 = fibonacci(term - 1);
		int temp2 = fibonacci(term - 2);

		return temp1 + temp2;
	}
}