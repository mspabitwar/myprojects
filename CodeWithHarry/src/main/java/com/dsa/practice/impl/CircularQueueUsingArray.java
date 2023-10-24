package com.dsa.practice.impl;

import com.dsa.practice.model.Queue;

public class CircularQueueUsingArray {

	public static void main(String[] args) {

		Queue circularQueue = new Queue();
		
		circularQueue.setSize(10);
		circularQueue.setFront(0);
		circularQueue.setRear(0);
		circularQueue.setArray(new int[circularQueue.getSize()+1]);
		
		System.out.println("Queue is created successfully");

		System.out.println("is Queue Empty? " + isEmpty(circularQueue));
		System.out.println("is Queue Full? " + isFull(circularQueue));

		enqueue(circularQueue, 1);
		enqueue(circularQueue, 2);
		enqueue(circularQueue, 3);
		enqueue(circularQueue, 4);
		enqueue(circularQueue, 5);
		enqueue(circularQueue, 6);
		enqueue(circularQueue, 7);
		enqueue(circularQueue, 8);
		enqueue(circularQueue, 9);
		enqueue(circularQueue, 10);
		enqueue(circularQueue, 11);

		System.out.println("is Stack Empty? " + isEmpty(circularQueue));
		System.out.println("is Stack Full? " + isFull(circularQueue));

		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		
		System.out.println("is Stack Empty? " + isEmpty(circularQueue));
		System.out.println("is Stack Full? " + isFull(circularQueue));
		
		enqueue(circularQueue, 11);
		enqueue(circularQueue, 12);
		enqueue(circularQueue, 13);
		enqueue(circularQueue, 14);
		enqueue(circularQueue, 15);
		enqueue(circularQueue, 16);
		enqueue(circularQueue, 17);
		enqueue(circularQueue, 18);
		enqueue(circularQueue, 19);
		enqueue(circularQueue, 20);
		
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		dequeue(circularQueue);
		
		enqueue(circularQueue, 21);
		enqueue(circularQueue, 22);
		enqueue(circularQueue, 23);
		enqueue(circularQueue, 24);
		enqueue(circularQueue, 25);
		enqueue(circularQueue, 26);
		
		
		

	}

	public static boolean isEmpty(Queue circularQueue) {
		return circularQueue.getFront() == circularQueue.getRear();
	}

	public static boolean isFull(Queue circularQueue) {
		return (circularQueue.getRear() + 1) % (circularQueue.getSize() + 1) == circularQueue.getFront();
	}

	public static void enqueue(Queue circularQueue, int element) {
		if (isFull(circularQueue)) {
			System.out.println("Queue is full at the moment. Can't enqueue element " + element + " into it.");
		} else {
			int nextRear = (circularQueue.getRear() + 1) % (circularQueue.getSize() + 1);
			circularQueue.getArray()[nextRear] = element;
			circularQueue.setRear(nextRear);
			System.out.println("Element " + element + " enqueued into queue");
		}
	}

	public static int dequeue(Queue circularQueue) {
		if (isEmpty(circularQueue)) {
			System.out.println("Queue is empty at the moment. Can't dequeue from it.");
			return -1;
		} else {
			int nextFront = (circularQueue.getFront() + 1) % (circularQueue.getSize() + 1);
			int element = circularQueue.getArray()[nextFront];
			circularQueue.setFront(nextFront);
			System.out.println("Element " + element + " dequeued from queue");
			return element;
		}
	}
}