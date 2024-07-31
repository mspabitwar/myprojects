package com.gamam.pattern01.twoPointers;

public class P03RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 1, 2, 1 };
		display("Input Array", nums);
		System.out.println("the number of unique elements is " + removeDuplicates(nums));
		display("Changed Array", nums);

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		display("Input Array", nums2);
		System.out.println("the number of unique elements is " + removeDuplicates(nums2));
		display("Changed Array", nums2);
	}

	public static void display(String name, int[] nums) {
		System.out.print(name + " : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}

	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}
}