package com.dsa.practice.programs;

import java.util.HashMap;
import java.util.Map;

import com.dsa.practice.model.CharStack;

public class MultiParanthesisMatchingUsingStack {

	private static CharStack stack = new CharStack();
	private static Map<Character, Character> paranthesisMap = new HashMap<>();
	
	static {
		paranthesisMap.put('(',')');
		paranthesisMap.put('{','}');
		paranthesisMap.put('[',']');
	}
	
	public static void main(String[] args) {

		String expression = "[{(8+9)*(9+7)}]";
		
		stack.setSize(expression.length());
		stack.setTop(-1);
		stack.setArray(new char[stack.getSize()]);
		
		if(validateForParenthesisMatch(expression)) {
			System.out.println("Expression have parenthesis matched");
		} else {
			System.out.println("Expression didnot have parenthesis matched");
		}
	}
	
	public static boolean validateForParenthesisMatch(String expression) {
		
		for(int i=0; i< expression.length(); i++) {
			char ch = expression.charAt(i);
			for(Map.Entry<Character, Character> entry: paranthesisMap.entrySet()) {
				Character openingBracket = entry.getKey();
				Character closingBracket = entry.getValue();
				if(openingBracket.equals(ch)) {
					push(stack, openingBracket);
				} else if(closingBracket.equals(ch)) {
					if(isEmpty(stack)) {
						System.out.println("Stack is empty at the moment. Can't pop from stack");
						return false;
					} else if(!openingBracket.equals(pop(stack))) {
						System.out.println("Poped character from stack does not match with curresponding closing bracket " + closingBracket);
						return false;
					}
				}
			}
		}
		if(isEmpty(stack)) {
			return true;
		} else {
			return false;
		}
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
}