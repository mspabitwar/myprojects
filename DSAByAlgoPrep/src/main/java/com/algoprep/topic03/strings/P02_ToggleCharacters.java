package com.algoprep.topic03.strings;

public class P02_ToggleCharacters {

	public static void main(String[] args) {

		// Given an char[] which contains only small and capital letters, toggle them
		// toggle them if it is a small then convert it to capital and vice verca

		char[] algoprep = { 'A', 'l', 'g', 'o', 'P', 'r', 'e', 'p' };
		System.out.println("Input: " + String.valueOf(algoprep));

		toggle(algoprep);

		System.out.println("Output: " + String.valueOf(algoprep));

	}

	private static void toggle(char[] algoprep) {
		for (int index = 0; index < algoprep.length; index++) {
			char ch = algoprep[index];
			if (ch >= 65 && ch <= 90) {
				algoprep[index] = (char) (ch + 32);
			} else {
				algoprep[index] = (char) (ch - 32);
			}
		}
	}
}