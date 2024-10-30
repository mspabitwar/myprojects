package com.java.durga.concept13.stream;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Pavan", "Raviteja", "Chiranjivi", "Venkatesh", "nagarjuna");

		System.out.println("Printing using for each");
		names.stream().forEach(s -> System.out.println(s));

		System.out.println("Printing using for each: method reference");
		names.stream().forEach(System.out::println);

	}
}