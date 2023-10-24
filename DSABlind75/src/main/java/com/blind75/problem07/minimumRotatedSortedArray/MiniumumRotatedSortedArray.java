package com.blind75.problem07.minimumRotatedSortedArray;

public class MiniumumRotatedSortedArray {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [3,4,5,1,2]
			Output: 1
			Explanation: The original array was [1,2,3,4,5] rotated 3 times.
		Example 2:
			Input: nums = [4,5,6,7,0,1,2]
			Output: 0
			Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
		Example 3:
			Input: nums = [11,13,15,17]
			Output: 11
			Explanation: The original array was [11,13,15,17] and it was rotated 4 times. */
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 3, 4, 5, 1, 2 };
		display(nums);
		System.out.println("Minimum Element = " + findMinimun(nums));
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 4, 5, 6, 7, 0, 1, 2 };
		display(nums2);
		System.out.println("Minimum Element = " + findMinimun(nums2));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums3[] = { 11, 13, 15, 17 };
		display(nums3);
		System.out.println("Minimum Element = " + findMinimun(nums3));
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
	
	public static int findMinimun(int[] nums) {
		int left = 0, right = nums.length - 1;
		int minimum = nums[0];

		while (left <= right) {
			if(nums[left] < nums[right]) {
				minimum = Math.min(minimum, nums[left]);
				break;
			}
				
			int mid = (left + right) / 2;
			minimum = Math.min(minimum, nums[mid]);

			// left portion
			if (nums[left] <= nums[mid]) {
				left = mid + 1;
			}
			// right portion
			else {
				right = mid - 1;
			}
		}
		return minimum;
	}
}