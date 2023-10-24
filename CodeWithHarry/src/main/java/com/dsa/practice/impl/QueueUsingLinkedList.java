package com.dsa.practice.impl;

import com.dsa.practice.model.Node;
import com.dsa.practice.model.QueueLL;

public class QueueUsingLinkedList {

	public static void main(String[] args) {

		QueueLL queue = new QueueLL();
		
		System.out.println("Queue is created successfully");

		enqueue(queue, 1);
		enqueue(queue, 2);
		enqueue(queue, 3);
		enqueue(queue, 4);
		enqueue(queue, 5);

		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);
		dequeue(queue);		
	}

	public static boolean isEmpty(QueueLL queue) {
		return queue.getFront() == null;
	}

	@SuppressWarnings("unused")
	public static void enqueue(QueueLL queue, int element) {
		Node node = new Node();
		if (node == null) {
			System.out.println("Queue is full at the moment. Can't enqueue element " + element + " into it.");
		} else {
			node.setData(element);
			node.setNext(null);
			
			if(queue.getFront() == null) {
				queue.setFront(node);
				queue.setRear(node);
			} else {
				queue.getRear().setNext(node);
				queue.setRear(node);
			}
			
			System.out.println("Element " + element + " enqueued into queue");
		}
	}

	public static int dequeue(QueueLL queue) {
		if (isEmpty(queue)) {
			System.out.println("Queue is empty at the moment. Can't dequeue from it.");
			return -1;
		} else {
			int element = queue.getFront().getData();
			queue.setFront(queue.getFront().getNext());
			System.out.println("Element " + element + " dequeued from queue");
			return element;
		}
	}
}