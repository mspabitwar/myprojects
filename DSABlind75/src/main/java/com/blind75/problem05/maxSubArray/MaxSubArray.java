package com.blind75.problem05.maxSubArray;

public class MaxSubArray {

	public static void main(String[] args) {
		/*Example 1:
			Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
			Output: 6
			Explanation: The subarray [4,-1,2,1] has the largest sum 6.
		Example 2:
			Input: nums = [1]
			Output: 1
			Explanation: The subarray [1] has the largest sum 1.
			Example 3:
		Input: nums = [5,4,-1,7,8]
			Output: 23
			Explanation: The subarray [5,4,-1,7,8] has the largest sum 23*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		display(nums);
		System.out.println("Maximum Sum for sub array : " + maxSubArray(nums));

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 1 };
		display(nums2);
		System.out.println("Maximum Sum for sub array : " + maxSubArray(nums2));

		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums3[] = { 5, 4, -1, 7, 8 };
		display(nums3);
		System.out.println("Maximum Sum for sub array : " + maxSubArray(nums3));
	}

	public static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = 0;

		for (int index = 0; index < nums.length; index++) {
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum + nums[index];
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}