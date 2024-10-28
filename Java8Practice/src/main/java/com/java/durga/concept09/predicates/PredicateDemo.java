package com.java.durga.concept09.predicates;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> predicate = number -> number > 10;
		System.out.println(predicate.test(20));
		System.out.println(predicate.test(8));
	}
}