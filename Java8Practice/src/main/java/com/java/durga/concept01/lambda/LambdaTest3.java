package com.java.durga.concept01.lambda;

public class LambdaTest3 {

	public static void main(String[] args) {

		// Without lambda
		Interface3 I1 = new Demo3();
		System.out.println("Length = " + I1.length("Hello"));

		// With lambda
		Interface3 I2 = (String s) -> {
			return s.length();
		};
		System.out.println("Length from lambda = " + I2.length("Hello"));
	}
}