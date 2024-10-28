package com.java.durga.concept05.lambda.examples;

public class LambdaMultithreadingDemo {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread childThread = new Thread(runnable);
		childThread.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}
	}
}