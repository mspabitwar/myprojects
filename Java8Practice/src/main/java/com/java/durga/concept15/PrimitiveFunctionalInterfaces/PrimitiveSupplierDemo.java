package com.java.durga.concept15.PrimitiveFunctionalInterfaces;

import java.util.function.IntSupplier;

public class PrimitiveSupplierDemo {

	public static void main(String[] args) {

		IntSupplier digitSupplier = () -> (int) (Math.random() * 10);
		String otp = "";
		for (int count = 1; count <= 6; count++) {
			otp += digitSupplier.getAsInt();
		}
		System.out.println("The 6 digit OTP is " + otp);
		
		// Similarly there are LongSupplier, DoubleSupplier & BooleanSupplier
	}
}