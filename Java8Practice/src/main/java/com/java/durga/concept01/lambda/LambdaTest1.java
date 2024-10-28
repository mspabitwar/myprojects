package com.java.durga.concept01.lambda;

public class LambdaTest1 {

	public static void main(String[] args) {

		// Without lambda
		Interface1 I1 = new Demo1();
		I1.m1();

		// With lambda
		Interface1 I2 = () -> {
			System.out.println("Hello from lambda");
		};
		I2.m1();
	}
}