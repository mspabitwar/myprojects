package com.blind75.problem09.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [-1,0,1,2,-1,-4]
			Output: [[-1,-1,2],[-1,0,1]]
			Explanation: 
			nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
			nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
			nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
			The distinct triplets are [-1,0,1] and [-1,-1,2].
			Notice that the order of the output and the order of the triplets does not matter.
		Example 2:
			Input: nums = [0,1,1]
			Output: []
			Explanation: The only possible triplet does not sum up to 0.
		Example 3:
			Input: nums = [0,0,0]
			Output: [[0,0,0]]
			Explanation: The only possible triplet sums up to 0.*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		display(nums);
		System.out.println("The possible triplet sums up to 0 = " + threeSum(nums));

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 0, 1, 1 };
		display(nums2);
		System.out.println("The possible triplet sums up to 0 = " + threeSum(nums2));

		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums3[] = { 0, 0, 0 };
		display(nums3);
		System.out.println("The possible triplet sums up to 0 = " + threeSum(nums3));

		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums4[] = { -3, 3, 4, -3, 1, 1, 2 };
		display(nums4);
		System.out.println("The possible triplet sums up to 0 = " + threeSum(nums4));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int index = 0; index < nums.length; index++) {
			if (index > 0 && nums[index] == nums[index - 1]) {
				continue;
			}
			int left = index + 1;
			int right = nums.length - 1;
			while (left < right) {
				if (nums[index] + nums[left] + nums[right] > 0) {
					right = right - 1;
				} else if (nums[index] + nums[left] + nums[right] < 0) {
					left = left + 1;
				} else {
					result.add(Arrays.asList(nums[index], nums[left], nums[right]));
					left = left + 1;
					while (nums[left] == nums[left - 1] && left < right) {
						left = left + 1;
					}
				}
			}
		}
		return result;
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}