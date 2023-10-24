package com.dsa.practice.impl;

import com.dsa.practice.model.Queue;

public class GraphTraversal_BFS {

	public static void main(String[] args) {

		// Queue Initialization
		Queue explorationQueue = new Queue();
		explorationQueue.setSize(7);
		explorationQueue.setFront(-1);
		explorationQueue.setRear(-1);
		explorationQueue.setArray(new int[explorationQueue.getSize()]);

		// BFS Implementation
		int[] visited = { 0, 0, 0, 0, 0, 0, 0 };
		int[][] graph = { 
				{ 0, 1, 1, 1, 0, 0, 0 }, 
				{ 1, 0, 1, 0, 0, 0, 0 }, 
				{ 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 0, 1, 0, 1, 0, 0 }, 
				{ 0, 0, 1, 1, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0, 1, 0, 0 } 
			};

		int startingNode = 5;
		System.out.print(startingNode + " ");
		visited[startingNode] = 1;
		enqueue(explorationQueue, startingNode);

		while (!isEmpty(explorationQueue)) {

			int node1 = dequeue(explorationQueue);

			for (int node2 = 0; node2 < 7; node2++) {
				if (graph[node1][node2] == 1 && visited[node2] == 0) {
					System.out.print(node2 + " ");
					visited[node2] = 1;
					enqueue(explorationQueue, node2);
				}
			}
		}
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
			// System.out.println("Element " + element + " enqueued into queue");
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
			// System.out.println("Element " + element + " dequeued from queue");
			return element;
		}
	}
}