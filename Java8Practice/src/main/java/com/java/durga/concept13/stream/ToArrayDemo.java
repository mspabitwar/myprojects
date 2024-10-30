package com.java.durga.concept13.stream;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(0, 10, 20, 5, 15, 25);
		System.out.println(numbers);

		Integer[] numArr = numbers.stream().toArray(Integer[]::new);

		for (Integer num : numArr) {
			System.out.println(num);
		}
	}
}