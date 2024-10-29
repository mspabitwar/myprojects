package com.java.durga.concept12.supplier;

import java.util.function.Supplier;

public class RandomOTPSupplierDemo {

	public static void main(String[] args) {

		Supplier<String> randomOTPSupplier = () -> {
			String otp = "";
			for (int count = 1; count <= 6; count++) {
				otp += (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println(randomOTPSupplier.get());
		System.out.println(randomOTPSupplier.get());
		System.out.println(randomOTPSupplier.get());

	}
}