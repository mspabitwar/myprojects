package com.blind75.problem22.houseRobber;

public class HouseRobber {

	public static void main(String[] args) {
		/*Example 1:
			Input: nums = [1,2,3,1]
			Output: 4
			Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
			Total amount you can rob = 1 + 3 = 4.
		Example 2:
			Input: nums = [2,7,9,3,1]
			Output: 12
			Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
			Total amount you can rob = 2 + 9 + 1 = 12.*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int[] nums = { 1, 2, 3, 1 };
		display(nums);
		System.out.println("Maximum amount of money you can rob = " + rob(nums));

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int[] nums2 = { 2, 7, 9, 3, 1 };
		display(nums2);
		System.out.println("Maximum amount of money you can rob = " + rob(nums2));
	}

	public static int rob(int[] nums) {
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