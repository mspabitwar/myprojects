package com.java.durga.concept13.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 10, 20, 5, 15, 25);
		System.out.println(numbers);

		List<Integer> doubleNumbers1 = new ArrayList<>();
		for (Integer number : numbers) {
			doubleNumbers1.add(number * 2);
		}
		System.out.println("Double numbers without stream : " + doubleNumbers1);

		List<Integer> evenNumbers2 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println("Double numbers with stream : " + evenNumbers2);

	}
}