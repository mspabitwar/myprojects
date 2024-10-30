package com.java.durga.concept13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Pavan", "Raviteja", "Chiranjivi", "Venkatesh", "nagarjuna");
		System.out.println("Input Names : " + names);

		List<String> namesHavingLengthGreaterThanOrEqualsTo9 = names.stream().filter(s -> s.length() >= 9)
				.collect(Collectors.toList());

		System.out.println(
				"Names having length greater than or equals to 9 : " + namesHavingLengthGreaterThanOrEqualsTo9);

		List<String> namesWithUpperCase = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println("Names converted to uppercase : " + namesWithUpperCase);
	}
}