package com.java.durga.concept13.stream;

import java.util.Arrays;
import java.util.List;

public class MinMaxDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 10, 20, 5, 15, 25);

		System.out.println("Min Value: " + numbers.stream().min((n1, n2) -> n1 - n2).get());
		System.out.println("Max Value: " + numbers.stream().max((n1, n2) -> n1 - n2).get());
	}
}