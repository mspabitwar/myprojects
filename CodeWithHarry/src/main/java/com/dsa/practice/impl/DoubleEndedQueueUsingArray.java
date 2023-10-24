package com.dsa.practice.impl;

import com.dsa.practice.model.Queue;

public class DoubleEndedQueueUsingArray {

	public static void main(String[] args) {

		Queue queue = new Queue();
		
		queue.setSize(10);
		queue.setFront(-1);
		queue.setRear(-1);
		queue.setArray(new int[queue.getSize()]);
		
		System.out.println("Queue is created successfully");

		displayQueue(queue);
		
		enqueueR(queue, 1);
		enqueueR(queue, 2);
		enqueueR(queue, 3);
		enqueueR(queue, 4);
		enqueueR(queue, 5);
		enqueueR(queue, 6);

		displayQueue(queue);

		dequeueF(queue);
		dequeueF(queue);
		dequeueF(queue);
		
		displayQueue(queue);
		
		dequeueR(queue);
		enqueueF(queue, 7);
		enqueueF(queue, 8);
		enqueueF(queue, 9);
		enqueueF(queue, 10);
		
		displayQueue(queue);

	}
	
	public static void displayQueue(Queue queue) {
		int startIndex = queue.getFront() + 1;
		int endIndex = queue.getRear();
		System.out.println("Displaying Queue :");
		for(int index = startIndex; index <= endIndex; index++) {
			System.out.println("Element : " + queue.getArray()[index]);
		}
	}

	/*public static boolean isEmpty(Queue queue) {
		return queue.getFront() == queue.getRear();
	}

	public static boolean isFull(Queue queue) {
		return queue.getRear() == (queue.getSize() - 1);
	}*/

	public static void enqueueR(Queue queue, int element) {
		if (queue.getRear() == (queue.getSize() - 1)) {
			System.out.println("Queue is full at the moment from Rear End. Can't enqueue element " + element + " into it.");
		} else {
			int currentRear = queue.getRear();
			queue.getArray()[++currentRear] = element;
			queue.setRear(currentRear);
			System.out.println("Element " + element + " enqueued into queue at Rear");
		}
	}

	public static int dequeueF(Queue queue) {
		if (queue.getRear() == -1) {
			System.out.println("Queue is empty at the moment. Can't dequeue from it.");
			return -1;
		} else {
			int currentFront = queue.getFront();
			int element = queue.getArray()[++currentFront];
			queue.setFront(currentFront);
			System.out.println("Element " + element + " dequeued from queue from Front");
			return element;
		}
	}
	
	public static void enqueueF(Queue queue, int element) {
		if (queue.getFront() == -1) {
			System.out.println("Queue is full at the moment from Front End. Can't enqueue element " + element + " into it.");
		} else {
			int currentFront = queue.getFront();
			queue.getArray()[currentFront--] = element;
			queue.setFront(currentFront);
			System.out.println("Element " + element + " enqueued into queue at Front");
		}
	}
	
	public static int dequeueR(Queue queue) {
		if (queue.getRear() == -1) {
			System.out.println("Queue is empty at the moment. Can't dequeue from it.");
			return -1;
		} else {
			int currentRear = queue.getRear();
			int element = queue.getArray()[currentRear--];
			queue.setRear(currentRear);
			System.out.println("Element " + element + " dequeued from queue from Rear");
			return element;
		}
	}
}