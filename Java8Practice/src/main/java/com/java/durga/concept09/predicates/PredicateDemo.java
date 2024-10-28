package com.java.durga.concept09.predicates;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> numberChecker = number -> number > 10;
		System.out.println(numberChecker.test(20));
		System.out.println(numberChecker.test(8));
		
		Predicate<String> stringLengthChecker = s -> s.length() > 5;
		System.out.println(stringLengthChecker.test("Hello World"));
		System.out.println(stringLengthChecker.test("Hello"));
		
		Predicate<Collection<String>> collectionEmptinessChecker = c -> c.isEmpty();
		System.out.println(collectionEmptinessChecker.test(Arrays.asList()));
		System.out.println(collectionEmptinessChecker.test(Arrays.asList("test")));
	}
}