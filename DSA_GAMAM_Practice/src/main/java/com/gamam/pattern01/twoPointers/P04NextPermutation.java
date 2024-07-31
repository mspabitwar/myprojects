package com.gamam.pattern01.twoPointers;

import java.util.Arrays;

public class P04NextPermutation {

	public static void main(String[] args) {

		// https://leetcode.com/problems/next-permutation/description/

		int nums[] = { 2, 4, 1, 7, 5, 0 };
		System.out.println("Input Array : " + Arrays.toString(nums));
		nextPermutation(nums);
		System.out.println("Next Permutation : " + Arrays.toString(nums));

		int nums2[] = { 1, 2, 3 };
		System.out.println("Input Array : " + Arrays.toString(nums2));
		nextPermutation(nums2);
		System.out.println("Next Permutation : " + Arrays.toString(nums2));

		int nums3[] = { 3, 2, 1 };
		System.out.println("Input Array : " + Arrays.toString(nums3));
		nextPermutation(nums3);
		System.out.println("Next Permutation : " + Arrays.toString(nums3));

		int nums4[] = { 1, 1, 5 };
		System.out.println("Input Array : " + Arrays.toString(nums4));
		nextPermutation(nums4);
		System.out.println("Next Permutation : " + Arrays.toString(nums4));
	}

	public static void nextPermutation(int[] nums) {

		// Find the first element from the right that is not in decreasing order
		int i = nums.length - 2;
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		// If such an element is found, find the smallest element from the right that is
		// greater than it
		if (i >= 0) {
			int j = nums.length - 1;
			while (nums[j] <= nums[i]) {
				j--;
			}
			// Swap the two elements
			swap(nums, i, j);
		}

		// Reverse the elements from index+1 to the end to get the next permutation
		reverse(nums, i + 1);
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}
}