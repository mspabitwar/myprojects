package com.blind75.problem08.searchRotatedSortedArray;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [4,5,6,7,0,1,2], target = 0
			Output: 4
		Example 2:
			Input: nums = [4,5,6,7,0,1,2], target = 3
			Output: -1
		Example 3:
			Input: nums = [1], target = 0
			Output: -1*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		display(nums);
		System.out.println("Index of " + target + " = " + search(nums, target));
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target2 = 3;
		display(nums2);
		System.out.println("Index of " + target2 + " = " + search(nums2, target2));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums3[] = { 1 };
		int target3 = 0;
		display(nums3);
		System.out.println("Index of " + target3 + " = " + search(nums3, target3));
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
	
	public static int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// left portion
			if (nums[left] <= nums[mid]) {
				if (target > nums[mid] || target < nums[left]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			// right portion
			else {
				if (target < nums[mid] || target > nums[right]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
		}
		return -1;
	}
}