package com.algoprep.topic04.bit.manipulation;

import java.util.Scanner;

public class P03_BitOperatorPropertiesDemo {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter any number");
			int number = scanner.nextInt();
			
			System.out.println(number + " & " + number + " = " + (number & number));
			System.out.println(number + " & 0 = " + (number & 0));
			
			System.out.println(number + " | " + number + " = " + (number | number));
			System.out.println(number + " | 0 = " + (number | 0));
			
			System.out.println(number + " ^ " + number + " = " + (number ^ number));
			System.out.println(number + " ^ 0 = " + (number ^ 0));
		}
	}
}