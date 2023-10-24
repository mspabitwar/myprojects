package com.blind75.problem11.sumOfTwoIntegers;

public class SumOfTwoIntegers {

	public static void main(String[] args) {

		// Given two integers a and b, return the sum of the two integers without using the operators + and -.
		Integer number1 = 10;
		Integer number2 = 15;		
		System.out.println(number1 + " + " + number2 + " = " + getSum(number1, number2));
		
		number1 = 10;
		number2 = 0;		
		System.out.println(number1 + " + " + number2 + " = " + getSum(number1, number2));
		
		number1 = 10;
		number2 = -5;		
		System.out.println(number1 + " + " + number2 + " = " + getSum(number1, number2));
		
		number1 = -5;
		number2 = 10;		
		System.out.println(number1 + " + " + number2 + " = " + getSum(number1, number2));
		
		number1 = -10;
		number2 = -5;		
		System.out.println(number1 + " + " + number2 + " = " + getSum(number1, number2));

	}
	
	public static int getSum(int a, int b) {
		while(b != 0) {
			int temp = (a & b) << 1;
			a = a ^ b;
			b = temp;
		}
		return a;
	}
}