package com.java.durga.concept13.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 10, 20, 5, 15, 25);
		System.out.println(numbers);

		List<Integer> evenNumbers1 = new ArrayList<>();
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				evenNumbers1.add(number);
			}
		}
		System.out.println("Even numbers without stream : " + evenNumbers1);

		List<Integer> evenNumbers2 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers with stream : " + evenNumbers2);

	}
}