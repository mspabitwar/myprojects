package com.learnJava.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	private static Predicate<Integer> isDivisableBy2 = (i) -> {
		return i % 2 == 0;
	};
	private static Predicate<Integer> isDivisableBy2_1 = (i) -> i % 2 == 0;
	private static Predicate<Integer> isDivisableBy5 = (i) -> i % 5 == 0;

	public static void predicateAnd() {

		System.out.println("Result in predicateAnd : " + isDivisableBy2_1.and(isDivisableBy5).test(10));
	}

	public static void predicateOr() {

		System.out.println("Result in predicateOr : " + isDivisableBy2_1.or(isDivisableBy5).test(4));
	}

	public static void predicateNegate() {

		System.out.println("Result in predicateNegate : " + isDivisableBy2_1.or(isDivisableBy5).negate().test(4));
	}

	public static void main(String[] args) {

		System.out.println("Result is p : " + isDivisableBy2.test(2));
		System.out.println("Result is p1 : " + isDivisableBy2_1.test(2));

		predicateAnd();
		predicateOr();
		predicateNegate();
	}
}