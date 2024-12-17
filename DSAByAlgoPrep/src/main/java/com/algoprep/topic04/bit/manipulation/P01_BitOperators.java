package com.algoprep.topic04.bit.manipulation;

public class P01_BitOperators {

	public static void main(String[] args) {
		
		/* a  b | (a & b) | (a | b) | ( a ^ b)
		   0  0 |    0    |    0    |     0  
		   0  1 |    0    |    1    |     1  
		   1  0 |    0    |    1    |     1  
		   1  1 |    1    |    1    |     0   */
		
		System.out.println("AND(&) Operation");
		System.out.println("23 & 10 = " + (23 & 10));
		System.out.println("20 & 10 = " + (20 & 10));
		System.out.println("---------------");
		
		System.out.println("OR(|) Operation");
		System.out.println("23 | 10 = " + (23 | 10));
		System.out.println("20 | 10 = " + (20 | 10));
		System.out.println("---------------");
		
		System.out.println("XOR(^) Operation");
		System.out.println("23 ^ 10 = " + (23 ^ 10));
		System.out.println("20 ^ 15 = " + (20 ^ 15));
		System.out.println("---------------");
	}
}