package com.gamam.pattern01.twoPointers;

public class P02ContainerWithMostWater {

	public static void main(String[] args) {

		// https://leetcode.com/problems/container-with-most-water/description/

		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		display(height);
		System.out.println("the max area of water the container can contain is " + maxArea(height));

		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int height2[] = { 1, 1 };
		display(height2);
		System.out.println("the max area of water the container can contain is " + maxArea(height2));
	}

	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}

	public static int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0, right = height.length - 1;

		while (left < right) {
			int currentArea = (right - left) * Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, currentArea);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}
}