package com.blind75.problem16.climbingStairs;

public class ClimbingStairs {

	public static void main(String[] args) {

		/*Example 1:
			Input: n = 2
			Output: 2
			Explanation: There are two ways to climb to the top.
			1. 1 step + 1 step
			2. 2 steps
		Example 2:
			Input: n = 3
			Output: 3
			Explanation: There are three ways to climb to the top.
			1. 1 step + 1 step + 1 step
			2. 1 step + 2 steps
			3. 2 steps + 1 step*/
		
		int top = 2;
		System.out.println("There are " + climbStairs(top)  + " ways to climb to the top " + top);
		
		top = 3;
		System.out.println("There are " + climbStairs(top)  + " ways to climb to the top " + top);
		
		top = 5;
		System.out.println("There are " + climbStairs(top)  + " ways to climb to the top " + top);
	}
	
	public static int climbStairs(int n) {
		int first = 1, second = 1;
		for (int count = 1; count < n; count++) {
			int temp = first;
			first = first + second;
			second = temp;
		}
		return first;
	}
}