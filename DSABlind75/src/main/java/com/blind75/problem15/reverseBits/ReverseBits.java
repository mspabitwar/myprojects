package com.blind75.problem15.reverseBits;

public class ReverseBits {

	public static void main(String[] args) {

		int number = Integer.parseUnsignedInt("00000010100101000001111010011100", 2);
		System.out.println("Reverse of " + number + " = " + reverseBits(number));
		
		number = Integer.parseUnsignedInt("11111111111111111111111111111101", 2);
		System.out.println("Reverse of  " + number + " = " + reverseBits(number));
		
	}
	
	public static int reverseBits(int n) {
		int reverse = 0;
		for (int index = 0; index < 32; index++) {
			int bit = (n >> index) & 1;
			reverse = reverse | (bit << (31 - index));
		}
		return reverse;
	}
}