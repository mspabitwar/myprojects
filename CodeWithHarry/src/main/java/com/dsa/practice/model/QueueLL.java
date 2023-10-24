package com.dsa.practice.model;

public class QueueLL {

	Node front = null;
	Node rear = null;

	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}
}