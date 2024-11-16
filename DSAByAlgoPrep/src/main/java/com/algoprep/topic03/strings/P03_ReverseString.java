package com.algoprep.topic03.strings;

public class P03_ReverseString {

	public static void main(String[] args) {

		String algoprep = "algoprep";
		System.out.println("Input: " + algoprep);

		char[] ch = algoprep.toCharArray();
		reverse(ch);

		System.out.println("Output: " + String.valueOf(ch));

	}

	private static void reverse(char[] ch) {
		int left = 0;
		int right = ch.length - 1;

		while (left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
	}
}