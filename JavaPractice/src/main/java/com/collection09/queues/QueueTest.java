package com.collection09.queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {

	public static void main(String[] args) {
		
		// (head) <- 123456789 -> (tail) FIFO first in first out

		Queue<Integer> queue1 = new ArrayBlockingQueue<>(3);
		
		//throws NoSuchElementException when queue is empty
		//System.out.println("head of queue 1 is " + queue1.element());
		
		queue1.add(10);
		queue1.add(20);
		queue1.add(30);
		
		try {
			queue1.add(40);
		} catch(IllegalStateException exception) {
			System.out.println("Tried to add too many items to the queue");
		}
		
		System.out.println("head of queue 1 is " + queue1.element());
		
		for(Integer value : queue1) {
			System.out.println("Queue1 value " + value);
		}
		
		System.out.println("Removed from queue 1 : " + queue1.remove());
		System.out.println("Removed from queue 1 : " + queue1.remove());
		System.out.println("Removed from queue 1 : " + queue1.remove());
		
		try {
			System.out.println("Removed from queue : " + queue1.remove());
		} catch(NoSuchElementException exception) {
			System.out.println("Tried to remove too many items from the queue");
		}
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		Queue<Integer> queue2 = new ArrayBlockingQueue<>(3);
		
		System.out.println("head of queue 2 is " + queue2.peek());
		
		queue2.offer(10);
		queue2.offer(20);
		queue2.offer(30);
		
		System.out.println("head of queue 2 is " + queue2.peek());
		
		if(queue2.offer(40) == false) {
			System.out.println("Offer failed to add 40");
		}
		
		for(Integer value : queue2) {
			System.out.println("Queue2 value " + value);
		}
		
		System.out.println("Removed from queue 2 : " + queue2.poll());
		System.out.println("Removed from queue 2 : " + queue2.poll());
		System.out.println("Removed from queue 2 : " + queue2.poll());
		System.out.println("Removed from queue 2 : " + queue2.poll());

	}
}