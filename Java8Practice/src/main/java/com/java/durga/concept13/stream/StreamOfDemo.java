package com.java.durga.concept13.stream;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {

		Stream<Integer> numbers = Stream.of(9, 99, 999, 9999, 99999);
		numbers.forEach(System.out::println);

		Double[] doubleNums = { 10.1, 10.2, 10.3, 10.4, 10.5 };
		Stream.of(doubleNums).forEach(System.out::println);
	}
}