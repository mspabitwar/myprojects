package com.multithreading14.thread.interrupt;

import java.util.Random;

/**
 * <b>How to interrupt running threads in Java using the built-in thread
 * interruption mechanism.</b>
 * <br><br>
 * Source:
 * <a href="http://www.javamex.com/tutorials/threads/thread_interruption.shtml">
 * http://www.javamex.com/tutorials/threads/thread_interruption.shtml</a>
 * <p>
 * Incidentally, it is important NOT to confuse thread interruption with either
 * software interrupts (where the CPU automatically interrupts the current
 * instruction flow in order to call a registered piece of code periodically— as
 * in fact happens to drive the thread scheduler) and hardware interrupts (where
 * the CPU automatically performs a similar task in response to some hardware
 * signal).
 */
public class InterruptTest {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Starting.");
		
		Thread t1 = new Thread(() -> {
			Random random = new Random();
			for (int i = 0; i < 1E8; i++) {
				/*if (Thread.currentThread().isInterrupted()) {
					System.out.printf("Interrupted at %d !!!", i);
					break;
				}*/
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					System.out.printf("Interrupted at %d !!!", i);
					break;
				}
				
				Math.sin(random.nextDouble());
			}
		});

		t1.start();
		Thread.sleep(500);		
		t1.interrupt();
        System.out.println("Finished.");
    }
}