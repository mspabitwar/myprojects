package com.java.durga.concept01.lambda;

public class LambdaTest2 {

	public static void main(String[] args) {

		// Without lambda
		Interface2 I1 = new Demo2();
		I1.add(10, 20);

		// With lambda
		Interface2 I2 = (int a, int b) -> {
			System.out.println("Sum from lambda = " + (a + b));
		};
		I2.add(10, 20);
	}
}