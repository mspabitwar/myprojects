package com.java.durga.concept05.lambda.examples;

import java.util.Set;
import java.util.TreeSet;

public class LambdaSetCollectionDemo {

	public static void main(String[] args) {

		Set<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(0);
		set1.add(15);
		set1.add(5);
		set1.add(20);
		System.out.println("With Natural Sorting : " + set1);

		Set<Integer> set2 = new TreeSet<>((n1, n2) -> n2 - n1);
		set2.add(10);
		set2.add(0);
		set2.add(15);
		set2.add(5);
		set2.add(20);
		System.out.println("With Custom Sorting : " + set2);
	}
}