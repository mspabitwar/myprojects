package com.blind75.problem01.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		/*Example 1:
			Input: nums = [2,7,11,15], target = 9
			Output: [0,1]
			Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		Example 2:
			Input: nums = [3,2,4], target = 6
			Output: [1,2]
		Example 3:
			Input: nums = [3,3], target = 6
			Output: [0,1]*/
		
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
		int nums2[] = { 3, 3 };
		int target2 = 5;
		display(nums2);
		System.out.println("Target Sum : " + target2);
		int output2[] = twoSum(nums2, target2);
		if (output2 == null) {
			System.out.println("No two element found in this array which sums to target");
		} else {
			System.out.println("Indices of 2 elements who sums to " + target2 +" are " + output2[0] + " & " + output2[1]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> differenceMaps = new HashMap<>();
		for (int index = 0; index < nums.length; index++) {
			int currentNum = nums[index];
			int requiredDifference = target - currentNum;
			if (differenceMaps.containsKey(requiredDifference)) {
				return new int[] { differenceMaps.get(requiredDifference), index };
			}
			differenceMaps.put(currentNum, index);
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