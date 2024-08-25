package com.multithreading03.synchronizedkeyword;

public class SynchronizedTest {

	private int count = 0;

	public static void main(String[] args) throws InterruptedException {
		SynchronizedTest object = new SynchronizedTest();
		object.doWork();
	}
	
	private synchronized void increment() {
		count++;
	}

	private void doWork() throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Count = " + count);

	}
}