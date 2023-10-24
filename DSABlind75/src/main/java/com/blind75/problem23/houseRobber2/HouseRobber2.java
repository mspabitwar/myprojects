package com.blind75.problem23.houseRobber2;

import java.util.Arrays;

public class HouseRobber2 {

	public static void main(String[] args) {
		/*Example 1:
			Input: nums = [2,3,2]
			Output: 3
			Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
		Example 2:
			Input: nums = [1,2,3,1]
			Output: 4
			Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
			Total amount you can rob = 1 + 3 = 4.
		Example 3:
			Input: nums = [1,2,3]
			Output: 3*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int[] nums = { 2, 3, 2 };
		display(nums);
		System.out.println("Maximum amount of money you can rob = " + rob(nums));

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int[] nums2 = { 1, 2, 3, 1 };
		display(nums2);
		System.out.println("Maximum amount of money you can rob = " + rob(nums2));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int[] nums3 = { 1, 2, 3 };
		display(nums3);
		System.out.println("Maximum amount of money you can rob = " + rob(nums3));
		
		System.out.println("----------");
		System.out.println("Example 4");
		System.out.println("----------");
		int[] cornerCase = { 1 };
		display(cornerCase);
		System.out.println("Maximum amount of money you can rob = " + rob(cornerCase));
	}

	public static int rob(int[] nums) {
		int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
		int[] nums2 = Arrays.copyOfRange(nums, 1, nums.length);

		return Math.max(nums[0], Math.max(rob1(nums1), rob1(nums2)));
	}
	
	public static int rob1(int[] nums) {
		int rob1 = 0, rob2 = 0;
		for (int index = 0; index < nums.length; index++) {
			int number = nums[index];
			int temp = Math.max(rob1 + number, rob2);
			rob1 = rob2;
			rob2 = temp;
		}
		return rob2;
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}