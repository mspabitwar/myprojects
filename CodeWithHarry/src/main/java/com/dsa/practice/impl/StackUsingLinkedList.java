package com.dsa.practice.impl;

import com.dsa.practice.model.Node;

public class StackUsingLinkedList {

	private static Node top = null;
	
	public static void main(String[] args) {
		
		//Node top = null;
		
		System.out.println("Stack is created successfully");

		System.out.println("is Stack Empty? " + isEmpty(top));
		System.out.println("is Stack Full? " + isFull(top));
		
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		push(7);
		push(8);
		push(9);
		push(10);
		
		System.out.println("is Stack Empty? " + isEmpty(top));
		System.out.println("is Stack Full? " + isFull(top));
		
		System.out.println("Topmost element of stack is " + stackTop());
		System.out.println("Bottommost element of stack is " + stackBottom());
		
		System.out.println("Printing stack using peek()");
		displayStackUsingPeek();
		
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		
		System.out.println("Printing stack using peek() after pop");
		displayStackUsingPeek();
	}

	public static boolean isEmpty(Node top2) {
		return top == null;
	}

	public static boolean isFull(Node top2) {
		return new Node() == null;
	}

	public static void push(int element) {
		if (isFull(top)) {
			System.out.println("Stack is full at the moment. Can't insert element " + element + " into stack");
		} else {
			Node insertNode = new Node();
			insertNode.setData(element);
			if(isEmpty(top)) {
				insertNode.setNext(null);
				top = insertNode;
			} else {
				insertNode.setNext(top);
				top = insertNode;
			}
			System.out.println("Element " + element + " inserted into stack");
		}
	}

	public static int pop() {
		if (isEmpty(top)) {
			System.out.println("Stack is empty at the moment. Can't pop from stack");
			return -1;
		} else {
			int element = top.getData();
			top = top.getNext();
			System.out.println("Element " + element + " poped from stack");
			return element;
		}
	}

	public static int stackTop() {
		return top.getData();
	}

	public static int stackBottom() {
		Node traversalNode = top;
		while(traversalNode.getNext() != null) {
			traversalNode = traversalNode.getNext();
		}
		return traversalNode.getData();
	}

	private static void displayStackUsingPeek() {
		if(!isEmpty(top)) {
			Node traversalNode = top;
			int position = 1;
			while(traversalNode != null) {
				System.out.println("Element of stack at position " + position + " is " + peek(position));
				traversalNode = traversalNode.getNext();
				position++;
			}
		}
	}
	
	public static int peek(int position) {
		Node traversalNode = top;
		for(int startPosition = 1; startPosition <= position - 1; startPosition++) {
			traversalNode = traversalNode.getNext();
		}
		return traversalNode.getData();
	}
}