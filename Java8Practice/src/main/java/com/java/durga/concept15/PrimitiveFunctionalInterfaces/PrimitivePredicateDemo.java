package com.java.durga.concept15.PrimitiveFunctionalInterfaces;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicateDemo {

	public static void main(String[] args) {

		// IntPredicate
		int[] numbers = { 0, 5, 10, 15, 20, 25, 30 };
		IntPredicate evenCheck = n -> n % 2 == 0;

		System.out.println("Printing Even Number");
		for (int number : numbers) {
			if (evenCheck.test(number)) {
				System.out.println(number);
			}
		}

		// LongPredicate
		long[] longNumbers = { 0l, 5l, 10l, 15l, 20l, 25l, 30l };
		LongPredicate longEvenCheck = n -> n % 2 == 0;

		System.out.println("Printing Even Number");
		for (long number : longNumbers) {
			if (longEvenCheck.test(number)) {
				System.out.println(number);
			}
		}

		// DoublePredicate
		double[] doubleNumbers = { 0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0 };
		DoublePredicate doubleEvenCheck = n -> n % 2 == 0;

		System.out.println("Printing Even Number");
		for (double number : doubleNumbers) {
			if (doubleEvenCheck.test(number)) {
				System.out.println(number);
			}
		}
	}
}