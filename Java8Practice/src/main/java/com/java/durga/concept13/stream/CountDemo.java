package com.java.durga.concept13.stream;

import java.util.Arrays;
import java.util.List;

public class CountDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Pavan", "Raviteja", "Chiranjivi", "Venkatesh", "nagarjuna");
		System.out.println("Input Names : " + names);

		long count = names.stream().filter(s -> s.length() >= 9).count();
		System.out.println("Count of names having length greater than or equals to 9 : " + count);

	}
}