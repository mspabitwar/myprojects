package com.java.durga.concept09.predicates;

import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		
		int[] numbers = { 0, 5, 10, 15, 20, 25, 30 };
		
		Predicate<Integer> p1 = n -> n > 10;
		Predicate<Integer> p2 = n -> n % 2 == 0;
		
		System.out.print("The numbers greater than 10 are [ ");
		check(p1, numbers);
		
		System.out.print("The numbers not greater than 10 are [ ");
		check(p1.negate(), numbers);
		
		System.out.print("The even numbers are [ ");
		check(p2, numbers);
		
		System.out.print("The numbers greater than 10 and even are [ ");
		check(p1.and(p2), numbers);
		
		System.out.print("The numbers greater than 10 or even are [ ");
		check(p1.or(p2), numbers);
	}
	
	public static void check(Predicate<Integer> p, int[] numbers) {
		for(int number: numbers) {
			if(p.test(number)) {
				System.out.print(number + " ");
			}
		}
		System.out.println("]");
	}
}