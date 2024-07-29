package com.gamam.pattern01.twoPointers;

public class P01TwoSum {

	//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
	
	public static void main(String[] args) {
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		display(nums);
		System.out.println("Target Sum : " + target);
		int output[] = twoSum(nums, target);
		if (output == null) {
			System.out.println("No two element found in this array which sums to target");
		} else {
			System.out.println("Indices of 2 elements who sums to " + target +" are " + output[0] + " & " + output[1]);
		}
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 2, 3, 4 };
		int target2 = 6;
		display(nums2);
		System.out.println("Target Sum : " + target2);
		int output2[] = twoSum(nums2, target2);
		if (output2 == null) {
			System.out.println("No two element found in this array which sums to target");
		} else {
			System.out.println("Indices of 2 elements who sums to " + target2 +" are " + output2[0] + " & " + output2[1]);
		}
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums3[] = { -1, 0 };
		int target3 = -1;
		display(nums3);
		System.out.println("Target Sum : " + target3);
		int output3[] = twoSum(nums3, target3);
		if (output3 == null) {
			System.out.println("No two element found in this array which sums to target");
		} else {
			System.out.println("Indices of 2 elements who sums to " + target3 +" are " + output3[0] + " & " + output3[1]);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		
		int left = 0;
		int right = numbers.length - 1;
		
		while(left < right) {
			int currentSum = numbers[left] + numbers[right];
			if(currentSum == target) {
				return new int[] { left + 1, right + 1 };
			} else if(currentSum < target) {
				left++;
			} else if(currentSum > target) {
				right--;
			}
		}
		
		return null;
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}