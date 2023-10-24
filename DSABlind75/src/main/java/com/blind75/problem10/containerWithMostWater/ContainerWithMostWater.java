package com.blind75.problem10.containerWithMostWater;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		/*Example 1:
			Input: height = [1,8,6,2,5,4,8,3,7]
			Output: 49
			Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
			In this case, the max area of water (blue section) the container can contain is 49.
		Example 2:
			Input: height = [1,1]
			Output: 1*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		display(height);
		System.out.println("the max area of water the container can contain is " + maxArea(height));
		
		System.out.println("----------");
		System.out.println("Example 1");
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