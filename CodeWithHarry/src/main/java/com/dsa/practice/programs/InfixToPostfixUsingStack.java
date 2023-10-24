package com.dsa.practice.programs;

import java.util.Arrays;
import java.util.List;

import com.dsa.practice.model.CharStack;

public class InfixToPostfixUsingStack {

	private static CharStack stack = new CharStack();
	private static List<Character> operators = Arrays.asList('+', '-', '*', '/');

	public static void main(String[] args) {

		String infixExp = "x-y/z-k*d";

		stack.setSize(infixExp.length());
		stack.setTop(-1);
		stack.setArray(new char[stack.getSize()]);

		System.out.println("Infix expression : " + infixExp);
		System.out.println("Postfix expression : " + getPostfixExpression(infixExp));
	}

	public static String getPostfixExpression(String infixExp) {
		int j = 0;
		char[] postfixExp = new char[infixExp.length()];
		for (int i = 0; i < infixExp.length(); i++) {
			char currentCharacter = infixExp.charAt(i);
			if (!isOperator(currentCharacter)) {
				postfixExp[j++] = currentCharacter;
			} else {
				while(!isEmpty(stack) && precedence(currentCharacter) <= precedence(stackTop(stack))) {
					postfixExp[j++] = pop(stack);
				}
				push(stack, currentCharacter);
			}
		}
		while(!isEmpty(stack)) {
			postfixExp[j++] = pop(stack);
		}
		return new String(postfixExp);
	}

	public static boolean isEmpty(CharStack stack) {
		return stack.getTop() == -1;
	}

	public static boolean isFull(CharStack stack) {
		return stack.getTop() == stack.getSize() - 1;
	}

	public static void push(CharStack stack, char element) {
		if (isFull(stack)) {
			System.out.println("Stack is full at the moment. Can't insert element " + element + " into stack");
		} else {
			int currentTop = stack.getTop();
			stack.getArray()[++currentTop] = element;
			stack.setTop(currentTop);
			System.out.println("Element " + element + " inserted into stack");
		}
	}

	public static char pop(CharStack stack) {
		int currentTop = stack.getTop();
		char element = stack.getArray()[currentTop--];
		stack.setTop(currentTop);
		System.out.println("Element " + element + " poped from stack");
		return element;
	}

	public static char stackTop(CharStack stack) {
		return stack.getArray()[stack.getTop()];
	}

	public static boolean isOperator(char character) {
		return operators.contains(character);
	}

	public static int precedence(char operator) {
		int precedence = 0;
		if (operator == '*' || operator == '/') {
			precedence = 2;
		} else if (operator == '*' || operator == '/') {
			precedence = 1;
		}
		return precedence;
	}
}