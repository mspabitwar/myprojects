package com.blind75.problem14.missingNumber;

public class MissingNumber {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [3,0,1]
			Output: 2
			Explanation: n = 3 since there are 3 numbers,
			so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
		Example 2:
			Input: nums = [0,1]
			Output: 2
			Explanation: n = 2 since there are 2 numbers,
			so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
		Example 3:
			Input: nums = [9,6,4,2,3,5,7,0,1]
			Output: 8
			Explanation: n = 9 since there are 9 numbers,
			so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 3, 0, 1 };
		display(nums);
		System.out.println("Missing Number : " + missingNumber(nums));
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 0, 1 };
		display(nums2);
		System.out.println("Missing Number : " + missingNumber(nums2));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums3[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		display(nums3);
		System.out.println("Missing Number : " + missingNumber(nums3));
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}

	public static int missingNumber(int[] nums) {
		int missingNumber = nums.length;
		for (int index = 0; index < nums.length; index++) {
			missingNumber = missingNumber + index - nums[index];
		}
		return missingNumber;
	}
}
