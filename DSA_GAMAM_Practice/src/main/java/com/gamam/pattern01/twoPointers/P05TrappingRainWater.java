package com.gamam.pattern01.twoPointers;

import java.util.Arrays;

public class P05TrappingRainWater {

	public static void main(String[] args) {

		// https://leetcode.com/problems/trapping-rain-water/description/

		int nums[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("Input heightay : " + Arrays.toString(nums));
		System.out.println("Maximum water that can be trapped : " + trap(nums));

		int nums2[] = { 4, 2, 0, 3, 2, 5 };
		System.out.println("Input heightay : " + Arrays.toString(nums2));
		System.out.println("Maximum water that can be trapped : " + trap(nums2));

	}

	public static int trap(int[] height) {
		// Indices to traverse the height
		int n = height.length;
        int left = 0;
        int right = n - 1;

        // To store Left max and right max
        // for two pointers left and right
        int l_max = 0;
        int r_max = 0;

        // To store the total amount
        // of rain water trapped
        int result = 0;
        while (left <= right) {

            // We need check for minimum of left
            // and right max for each element
            if (r_max <= l_max) {

                // Add the difference between
                // current value and right max at index r
                result += Math.max(0, r_max - height[right]);

                // Update right max
                r_max = Math.max(r_max, height[right]);

                // Update right pointer q
                right -= 1;
            }
            else {
              
                // Add the difference between
                // current value and left max at index l
                result += Math.max(0, l_max - height[left]);

                // Update left max
                l_max = Math.max(l_max, height[left]);

                // Update left pointer
                left += 1;
            }
        }
        return result;
	}
}