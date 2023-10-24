package com.dsa.practice.impl;

import com.dsa.practice.model.Stack;

public class StackUsingArray {

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.setSize(10);
		stack.setTop(-1);
		stack.setArray(new int[stack.getSize()]);
		System.out.println("Stack is created successfully");

		System.out.println("is Stack Empty? " + isEmpty(stack));
		System.out.println("is Stack Full? " + isFull(stack));

		push(stack, 1);
		push(stack, 2);
		push(stack, 3);
		push(stack, 4);
		push(stack, 5);
		push(stack, 6);
		push(stack, 7);
		push(stack, 8);
		push(stack, 9);
		push(stack, 10);
		push(stack, 11);

		System.out.println("is Stack Empty? " + isEmpty(stack));
		System.out.println("is Stack Full? " + isFull(stack));

		System.out.println("Topmost element of stack is " + stackTop(stack));
		System.out.println("Bottommost element of stack is " + stackBottom(stack));

		System.out.println("Printing stack using peek()");
		for (int position = 1; position <= (stack.getTop() + 1); position++) {
			System.out.println("Element of stack at position " + position + " is " + peek(stack, position));
		}

		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);

		System.out.println("Printing stack using peek() after pop");
		for (int position = 1; position <= (stack.getTop() + 1); position++) {
			System.out.println("Element of stack at position " + position + " is " + peek(stack, position));
		}
	}

	public static boolean isEmpty(Stack stack) {
		return stack.getTop() == -1;
	}

	public static boolean isFull(Stack stack) {
		return stack.getTop() == stack.getSize() - 1;
	}

	public static void push(Stack stack, int element) {
		if (isFull(stack)) {
			System.out.println("Stack is full at the moment. Can't insert element " + element + " into stack");
		} else {
			int currentTop = stack.getTop();
			stack.getArray()[++currentTop] = element;
			stack.setTop(currentTop);
			System.out.println("Element " + element + " inserted into stack");
		}
	}

	public static int pop(Stack stack) {
		if (isEmpty(stack)) {
			System.out.println("Stack is empty at the moment. Can't pop from stack");
			return -1;
		} else {
			int currentTop = stack.getTop();
			int element = stack.getArray()[currentTop--];
			stack.setTop(currentTop);
			System.out.println("Element " + element + " poped from stack");
			return element;
		}
	}

	public static int stackTop(Stack stack) {
		return stack.getArray()[stack.getTop()];
	}

	public static int stackBottom(Stack stack) {
		return stack.getArray()[0];
	}

	public static int peek(Stack stack, int position) {
		int index = stack.getTop() + 1 - position;
		return stack.getArray()[index];
	}
}