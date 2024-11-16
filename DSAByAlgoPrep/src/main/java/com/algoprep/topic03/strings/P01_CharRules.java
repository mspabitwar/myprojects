package com.algoprep.topic03.strings;

public class P01_CharRules {

	public static void main(String[] args) {

		// 1. You can do any mathematical operation on character and answer will be int
		// using ASCII
		System.out.println('A' + 3); // 68
		System.out.println('A' >= 65); // true

		// 2. char to int conversion is always implicit
		int a = 'A';
		System.out.println(a); // 65

		// 3. int to char conversion is complicated. Means sometimes it will work and
		// sometimes may not work
		// 3.1 It will work in below scenario
		char f = 70;
		System.out.println(f); // F

		// 3.2 It will not work in below scenario
		// char d = a + 3; // Type mismatch: cannot convert from int to char
		char d = (char) (a + 3); // you need to do explicit conversion
		System.out.println(d);
		// Since int to char conversion is complicated it is safer to do explicitly
		// always

	}
}