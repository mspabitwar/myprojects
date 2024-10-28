package com.java.durga.concept09.predicates;

import java.util.function.Predicate;

public class PredicateIsEqualDemo {

	public static void main(String[] args) {

		Predicate<String> predicate = Predicate.isEqual("Durgasoft");// same as below lambda
		//Predicate<String> predicate = s -> s.equals("Durgasoft");

		System.out.println(predicate.test("Durgasoft"));
		System.out.println(predicate.test("Durga"));
	}
}