package com.blind75.problem03.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		/*Example 1:
			Input: nums = [1,2,3,1]
			Output: true
		Example 2:
			Input: nums = [1,2,3,4]
			Output: false
		Example 3:
			Input: nums = [1,1,1,3,3,4,3,2,4,2]
			Output: true*/
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 1, 2, 3, 1 };
		display(nums);
		System.out.println("Contains Duplicate ? " + containsDuplicate(nums));
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int nums2[] = { 1, 2, 3, 4 };
		display(nums2);
		System.out.println("Contains Duplicate ? " + containsDuplicate(nums2));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		display(nums3);
		System.out.println("Contains Duplicate ? " + containsDuplicate(nums3));

	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> visitedNumbers = new HashSet<>();
		for (int index = 0; index < nums.length; index++) {
			if (visitedNumbers.contains(nums[index])) {
				return true;
			}
			visitedNumbers.add(nums[index]);
		}
		return false;
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}