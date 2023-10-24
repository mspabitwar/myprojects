package com.blind75.problem13.countingBits;

public class CountingBits {

	public static void main(String[] args) {

		/*Example 1:
			Input: n = 2
			Output: [0,1,1]
			Explanation:
			0 --> 0
			1 --> 1
			2 --> 10
		Example 2:
			Input: n = 5
			Output: [0,1,1,2,1,2]
			Explanation:
			0 --> 0
			1 --> 1
			2 --> 10
			3 --> 11
			4 --> 100
			5 --> 101*/
		
		int number = 2;
		int[] answer = countBits(number);
		System.out.print("The output of countBits for number " + number + " : ");
		display(answer);
		
		number = 5;
		answer = countBits(number);
		System.out.print("The output of countBits for number " + number + " : ");
		display(answer);
		
	}
	
	public static int[] countBits(int n) {
		int[] answer = new int[n + 1];
		int offset = 1;
		for (int index = 1; index <= n; index++) {
			if (2 * offset == index) {
				offset = index;
			}
			answer[index] = 1 + answer[index - offset];
		}
		return answer;
	}
	
	public static void display(int[] nums) {
		System.out.print("[ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}