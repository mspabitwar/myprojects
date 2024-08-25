package com.multithreading04.multiple.locks;

public class MultipleLockTest {

	public static void main(String[] args) {
		
		System.out.println("Synchronized Objects: ");
		WorkerSynchronizedBlocks worker = new WorkerSynchronizedBlocks();
		worker.work();
		
		System.out.println("Synchronized Methods: ");
		WorkerSynchronizedMethods worker2 = new WorkerSynchronizedMethods();
		worker2.work();
	}
}