package com.dsa.practice.impl;

import com.dsa.practice.model.Queue;

public class QueueUsingArray {

	public static void main(String[] args) {

		Queue queue = new Queue();
		
		queue.setSize(10);
		queue.setFront(-1);
		queue.setRear(-1);
		queue.setArray(new int[queue.getSize()]);
		
		System.out.println("Queue is created successfully");

		System.out.println("is Queue Empty? " + isEmpty(queue));
		System.out.println("is Queue Full? " + isFull(queue));

		enqueue(queue, 1);
		enqueue(queue, 2);
		enqueue(queue, 3);
		enqueue(queue, 4);
		enqueue(queue, 5);
		enqueue(queue, 6);
		enqueue(queue, 7);
		enqueue(queue, 8);
		enqueue(queue, 9);
		enqueue(queue, 10);
		enqueue(queue, 11);

		System.out.println("is Stack Empty? " + isEmpty(queue));
		System.out.println("is Stack Full? " + isFull(queue));

		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		
		System.out.println("is Stack Empty? " + isEmpty(queue));
		System.out.println("is Stack Full? " + isFull(queue));
		
		enqueue(queue, 1);

	}

	public static boolean isEmpty(Queue queue) {
		return queue.getFront() == queue.getRear();
	}

	public static boolean isFull(Queue queue) {
		return queue.getRear() == (queue.getSize() - 1);
	}

	public static void enqueue(Queue queue, int element) {
		if (isFull(queue)) {
			System.out.println("Queue is full at the moment. Can't enqueue element " + element + " into it.");
		} else {
			int currentRear = queue.getRear();
			queue.getArray()[++currentRear] = element;
			queue.setRear(currentRear);
			System.out.println("Element " + element + " enqueued into queue");
		}
	}

	public static int dequeue(Queue queue) {
		if (isEmpty(queue)) {
			System.out.println("Queue is empty at the moment. Can't dequeue from it.");
			return -1;
		} else {
			int currentFront = queue.getFront();
			int element = queue.getArray()[++currentFront];
			queue.setFront(currentFront);
			System.out.println("Element " + element + " dequeued from queue");
			return element;
		}
	}
}