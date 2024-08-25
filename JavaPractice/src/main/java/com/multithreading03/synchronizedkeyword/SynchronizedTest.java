package com.multithreading03.synchronizedkeyword;

public class SynchronizedTest {

	private int count = 0;

	public static void main(String[] args) throws InterruptedException {
		SynchronizedTest object = new SynchronizedTest();
		object.doWork();
	}
	
	/**
     * Run code again by removing the synchronized and join keywords By removing
     * synchronized keyword count variable will vary that is it is not atomic in
     * this case due to the reason that count is shared between the threads or
     * without join keyword count will output wrong.
     */
	private synchronized void increment(String threadName) {
		count++;
		//Thread.sleep(1000);
        System.out.println("Thread in Progress: " + threadName + " and count is: " + count);
	}

	private void doWork() throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				increment(Thread.currentThread().getName());
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				increment(Thread.currentThread().getName());
			}
		});

		t1.start();
		t2.start();
		
		/**
         * Join Threads: Finish until thread finishes execution, then progress
         * the code Reminder: your method is also a thread so without joining
         * threads System.out.println("Count is: " + count); will work
         * immediately. Join does not terminate Thread 2, just progress of the
         * code stops until Threads terminate.
         */
		t1.join();
		t2.join();

		System.out.println("Count is " + count);
	}
}