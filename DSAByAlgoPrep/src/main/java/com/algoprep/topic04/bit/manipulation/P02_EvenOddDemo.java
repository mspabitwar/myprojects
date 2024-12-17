package com.algoprep.topic04.bit.manipulation;

import java.util.Scanner;

public class P02_EvenOddDemo {

	public static void main(String[] args) {

		// Given a positive number, identify weather it is even or odd number
		// use of any mathematical operator is not allowed +,-,*,/,%

		// Solution: Rightmost bit will be 0 for even and 1 for odd

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number to check if it is even or odd");
			int number = scanner.nextInt();
			System.out.println(number + " is " + ((number & 1) == 0 ? "even" : "odd") + " number");
		}
	}
}