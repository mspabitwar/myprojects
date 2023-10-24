package com.dsa.practice.impl;

import com.dsa.practice.model.Node;

public class SinglyLinkedList {

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
		node4.setNext(null);

		Node head = node1;

		System.out.println("Singly Linked List Before Insertion");
		displayList(head);

		int elementToBeInsertedAtStart = 2;
		System.out.println("Inserting Element " + elementToBeInsertedAtStart + " at the start");
		head = insertAtStart(head, elementToBeInsertedAtStart);
		displayList(head);

		int elementToBeInsertedAt = 6;
		int index = 2;
		System.out.println("Inserting Element " + elementToBeInsertedAt + " at index " + index);
		insertAtIndex(head, elementToBeInsertedAt, index);
		displayList(head);

		int elementToBeInsertedAfter = 6;
		Node node = node3;
		System.out.println("Inserting Element " + elementToBeInsertedAfter + " after element " + node.getData());
		insertAfterNode(node, elementToBeInsertedAfter);
		displayList(head);

		int elementToBeInsertedAtEnd = 20;
		System.out.println("Inserting Element " + elementToBeInsertedAtEnd + " at the end");
		insertAtEnd(head, elementToBeInsertedAtEnd);
		displayList(head);
	}

	private static void displayList(Node head) {
		while (head != null) {
			System.out.println("Element : " + head.getData());
			head = head.getNext();
		}
	}

	private static Node insertAtStart(Node head, int data) {
		Node insertNode = new Node();
		insertNode.setData(data);

		insertNode.setNext(head);
		head = insertNode;
		return head;
	}

	private static void insertAtIndex(Node head, int data, int index) {
		Node insertNode = new Node();
		insertNode.setData(data);

		int startIndex = 0;
		while (startIndex < index - 1) {
			head = head.getNext();
			startIndex++;
		}
		insertNode.setNext(head.getNext());
		head.setNext(insertNode);
	}

	private static void insertAfterNode(Node node, int elementToBeInsertedAfter) {
		Node insertNode = new Node();
		insertNode.setData(elementToBeInsertedAfter);

		insertNode.setNext(node.getNext());
		node.setNext(insertNode);
	}

	private static void insertAtEnd(Node head, int data) {
		Node insertNode = new Node();
		insertNode.setData(data);;
		insertNode.setNext(null);
		
		while(head.getNext() != null) {
			head = head.getNext();
		}
		head.setNext(insertNode);
	}
}