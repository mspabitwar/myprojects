package com.blind75.problem04.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		/*Example 1:
			Input: nums = [1,2,3,4]
			Output: [24,12,8,6]
		Example 2:
			Input: nums = [-1,1,0,-3,3]
			Output: [0,0,9,0,0]*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 1, 2, 3, 4 };
		display(nums, true);
		int output[] = productExceptSelf(nums);
		display(output, false);
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums2[] = { -1, 1, 0, -3, 3 };
		display(nums2, true);
		int output2[] = productExceptSelf(nums2);
		display(output2, false);
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int output[] = new int[nums.length];
		
		int prefixProduct = 1;
		for(int index = 0; index < nums.length; index++) {
			output[index] = prefixProduct;
			prefixProduct = prefixProduct * nums[index];
		}
		
		int postfixProduct = 1;
		for(int index = nums.length - 1; index >= 0; index--) {
			output[index] = postfixProduct * output[index];
			postfixProduct = postfixProduct * nums[index];
		}
		return output;
    }
	
	public static void display(int[] nums, boolean isInputArray) {
		if(isInputArray) {			
			System.out.print("Input Array : [ ");
		} else {
			System.out.print("Product Array Except Self : [ ");
		}
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}