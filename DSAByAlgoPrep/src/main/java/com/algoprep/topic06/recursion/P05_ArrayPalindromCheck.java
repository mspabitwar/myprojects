package com.algoprep.topic06.recursion;

import java.util.Scanner;

public class P05_ArrayPalindromCheck {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array");
			int size = scanner.nextInt();
			char[] characters = new char[size];

			System.out.println("Enter elements of array");
			characters = scanner.next().toCharArray();

			boolean isPalindrom = palindrom(characters, 0, size - 1);

			String result = isPalindrom ? "palindrom" : "not palindrom";
			System.out.println("Given String is " + result);
		}
	}

	private static boolean palindrom(char[] characters, int startIndex, int endIndex) {

		if (startIndex >= endIndex)
			return true;
		if (characters[startIndex] == characters[endIndex]) {
			boolean temp = palindrom(characters, startIndex + 1, endIndex - 1);
			return temp;
		} else {
			return false;
		}
	}
}