package com.dsa.practice.impl;

import com.dsa.practice.model.Node;

public class CircularSinglyLinkedList {

	public static void main(String[] args) {

		Node node1 = new Node();
		node1.setData(3);

		Node node2 = new Node();
		node2.setData(4);

		Node node3 = new Node();
		node3.setData(8);

		Node node4 = new Node();
		node4.setData(11);

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node1);

		Node head = node1;

		System.out.println("Circular Singly Linked List Before Insertion");
		displayList(head);
	}

	private static void displayList(Node head) {
		Node ptr = head;
		do {
			System.out.println("Element : " + ptr.getData());
			ptr = ptr.getNext();
		} while(ptr != head);
	}
}