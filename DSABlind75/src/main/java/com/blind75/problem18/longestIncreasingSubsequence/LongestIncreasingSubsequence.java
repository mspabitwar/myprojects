package com.blind75.problem18.longestIncreasingSubsequence;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [10,9,2,5,3,7,101,18]
			Output: 4
			Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
		Example 2:
			Input: nums = [0,1,0,3,2,3]
			Output: 4
		Example 3:
			Input: nums = [7,7,7,7,7,7,7]
			Output: 1*/
		
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		display(nums);
		System.out.println("Longest Increasing Subsequence = " + lengthOfLIS(nums));
		
		int[] nums2 = { 0, 1, 0, 3, 2, 3 };
		display(nums2);
		System.out.println("Longest Increasing Subsequence = " + lengthOfLIS(nums2));
		
		int[] nums3 = { 7, 7, 7, 7, 7, 7, 7 };
		display(nums3);
		System.out.println("Longest Increasing Subsequence = " + lengthOfLIS(nums3));
		
		int[] nums4 = { 1, 2, 4, 3 };
		display(nums4);
		System.out.println("Longest Increasing Subsequence = " + lengthOfLIS(nums4));
	}
	
	public static int lengthOfLIS(int[] nums) {
		int length = nums.length;
		int[] LIS = new int[length];
		int maxLength = 1;

		for (int index1 = (length - 1); index1 >= 0; index1--) {
			LIS[index1] = 1;
			for (int index2 = (index1 + 1); index2 < length; index2++) {
				if (nums[index1] < nums[index2]) {
					LIS[index1] = Math.max(LIS[index1], 1 + LIS[index2]);
				}
			}
			if (LIS[index1] > maxLength) {
				maxLength = LIS[index1];
			}
		}
		return maxLength;
	}
	
	public static void display(int[] nums) {
		System.out.print("input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}