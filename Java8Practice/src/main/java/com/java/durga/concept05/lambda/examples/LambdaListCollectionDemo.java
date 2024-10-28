package com.java.durga.concept05.lambda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaListCollectionDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
		System.out.println("Before Sorting : " + list);

		Collections.sort(list);
		System.out.println("After Natural Sorting : " + list);

		Comparator<Integer> comparator = (n1, n2) -> n2 - n1;
		Collections.sort(list, comparator);
		System.out.println("After Custom Sorting : " + list);
	}
}