package com.java.durga.concept12.supplier;

import java.util.function.Supplier;

public class RandomNameSupplierDemo {

	public static void main(String[] args) {

		Supplier<String> randomNameSupplier = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			int x = (int) (Math.random() * 4);
			return s1[x];
		};

		System.out.println(randomNameSupplier.get());
		System.out.println(randomNameSupplier.get());
		System.out.println(randomNameSupplier.get());

	}
}