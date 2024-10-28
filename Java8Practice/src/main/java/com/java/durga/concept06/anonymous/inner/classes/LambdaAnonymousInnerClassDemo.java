package com.java.durga.concept06.anonymous.inner.classes;

public class LambdaAnonymousInnerClassDemo {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Child thread - anonymous inner class");
				}
			}
		};
		Thread childThread = new Thread(runnable);
		childThread.start();
		
		Runnable runnable2 = () -> {
			
				for (int i = 1; i <= 10; i++) {
					System.out.println("Child thread - labmda");
				}
		};
		Thread childThread2 = new Thread(runnable2);
		childThread2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}
	}
}