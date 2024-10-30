package com.java.durga.concept12.supplier;

import java.util.function.Supplier;

public class RandomPasswordSupplierDemo {

	public static void main(String[] args) {

		Supplier<String> randomPassSupplier = () -> {

			String password = "";
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

			Supplier<Integer> digitSupplier = () -> (int) (Math.random() * 10);
			Supplier<Character> characterSupplier = () -> characters.charAt((int) (Math.random() * 29));

			for (int count = 1; count <= 8; count++) {
				if (count % 2 == 0) {
					password += digitSupplier.get();
				} else {
					password += characterSupplier.get();
				}
			}
			return password;
		};

		System.out.println("Randonmly Generated Password: " + randomPassSupplier.get());
		System.out.println("Randonmly Generated Password: " + randomPassSupplier.get());

	}
}