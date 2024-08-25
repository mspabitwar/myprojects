package com.multithreading02.volatilekeyword;

import java.util.Scanner;

class Processor extends Thread {

	// volatile modifier guarantees that any thread that reads a field will see the
	// most recently written value (changed from other threads)
	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
	}
}

public class VolatileTest {

	public static void main(String[] args) {
		Processor processor = new Processor();
		processor.start();

		// Wait for the enter key
		System.out.println("Enter something to stop the thread,\nVolatile variable running will be forced to false :");

		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine();
		}
		processor.shutdown();
	}
}