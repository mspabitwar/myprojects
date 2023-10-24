package com.blind75.problem12.numberOfOneBits;

public class NumberOfOneBits {

	public static void main(String[] args) {

		int number = Integer.parseUnsignedInt("00000000000000000000000000001011", 2);
		System.out.println("The number of 1's in " + number + " = " + hammingWeight(number));
		
		number = Integer.parseUnsignedInt("00000000000000000000000010000000", 2);
		System.out.println("The number of 1's in " + number + " = " + hammingWeight(number));
		
		number = Integer.parseUnsignedInt("11111111111111111111111111111101", 2);
		System.out.println("The number of 1's in " + number + " = " + hammingWeight(number));
		
	}
	
	public static int hammingWeight(int n) {
		int count = 0;
        while (n != 0) {
            count = count + (n & 1);
            n = n >>> 1;
        }
        return count;
	}
}