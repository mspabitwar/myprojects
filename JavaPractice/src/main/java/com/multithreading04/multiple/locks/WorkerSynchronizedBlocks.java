package com.multithreading04.multiple.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Multiple locks to speed up complex multi-threaded code. Define shared
 * objects: list1 and list2 then synchronize these objects. Mainly discussing
 * making the method synchronized or making an object inside the method
 * synchronized, By defining two different locks we say that one thread may
 * execute the stageOne while other executes stageTwo.
 */
public class WorkerSynchronizedBlocks {

	private Random random = new Random();

	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public void stageOne() {

		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}

	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void work() {
		System.out.println("Starting ...");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				process();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				process();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start));
		System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
	}
}