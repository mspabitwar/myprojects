package com.java.durga.concept14.BiFunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> sumEvenCheck = (n1, n2) -> (n1 + n2) % 2 == 0;
		System.out.println("Sum of 5 and 11 is " + (sumEvenCheck.test(5, 11) ? "Even" : "Odd"));
		System.out.println("Sum of 5 and 10 is " + (sumEvenCheck.test(5, 10) ? "Even" : "Odd"));
	}
}