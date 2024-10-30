package com.java.durga.concept13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 10, 20, 5, 15, 25);
		System.out.println("Numbers before sorting" + numbers);

		List<Integer> numbersSortedInAscOrder = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Numbers with default sorting" + numbersSortedInAscOrder);

		List<Integer> numbersSortedInDescOrder = numbers.stream().sorted((n1, n2) -> n2 - n1)
				.collect(Collectors.toList());
		System.out.println("Numbers with default sorting" + numbersSortedInDescOrder);
		
		System.out.println("Min Value: " + numbers.stream().min((n1, n2) -> n1 - n2));
		System.out.println("Max Value: " + numbers.stream().max((n1, n2) -> n1 - n2));
	}
}