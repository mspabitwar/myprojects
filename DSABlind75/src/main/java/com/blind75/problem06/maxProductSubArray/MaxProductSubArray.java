package com.blind75.problem06.maxProductSubArray;

public class MaxProductSubArray {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [2,3,-2,4]
			Output: 6
			Explanation: [2,3] has the largest product 6.
		Example 2:
			Input: nums = [-2,0,-1]
			Output: 0
			Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 2, 3, -2, 4 };
		display(nums);
		System.out.println("Maximum Prodcuct for sub array : " + maxProduct(nums));

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { -2, 0, -1};
		display(nums2);
		System.out.println("Maximum Prodcuct for sub array : " + maxProduct(nums2));
		
		//int leetcode[] = { 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0 };
		//int leetcode[] = {2,-5,-2,-4,3};
		//System.out.println("Maximum Prodcuct for sub array : " + maxProduct(leetcode));
		
	}

	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
	
	public static int maxProduct(int[] nums) {
		int currentMax = nums[0], currentMin = nums[0], maxProduct = nums[0];

		for (int index = 1; index < nums.length; index++) {
			int currentNumber = nums[index];
			if (currentNumber < 0) {
				int temp = currentMax;
				currentMax = currentMin;
				currentMin = temp;
			}
			currentMax = Math.max(currentNumber, currentMax * currentNumber);
			currentMin = Math.min(currentNumber, currentMin * currentNumber);
			maxProduct = Math.max(maxProduct, currentMax);
		}
		return maxProduct;
	}
}