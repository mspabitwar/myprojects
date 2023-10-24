package com.blind75.problem21.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {

		/*Example 1:
			Input: candidates = [2,3,6,7], target = 7
			Output: [[2,2,3],[7]]
			Explanation:
			2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
			7 is a candidate, and 7 = 7.
			These are the only two combinations.
		Example 2:
			Input: candidates = [2,3,5], target = 8
			Output: [[2,2,2,2],[2,3,3],[3,5]]
		Example 3:
			Input: candidates = [2], target = 1
			Output: []*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		display(candidates);
		System.out.println("Target Sum : " + target);
		System.out.println("Combination Sum : " + combinationSum(candidates, target));
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int[] candidates2 = { 2, 3, 5};
		int target2 = 8;
		display(candidates2);
		System.out.println("Target Sum : " + target2);
		System.out.println("Combination Sum : " + combinationSum(candidates2, target2));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		int[] candidates3 = { 2};
		int target3 = 1;
		display(candidates3);
		System.out.println("Target Sum : " + target3);
		System.out.println("Combination Sum : " + combinationSum(candidates3, target3));
	}
	
	public static void display(int[] nums) {
		System.out.print("Candidates Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> combSum = new ArrayList<>();
		DFS(candidates, target, combSum, 0, new ArrayList<>(), 0);
        return combSum;
    }
	
	public static void DFS(int[] candidates, int target, List<List<Integer>> combSum, int index, List<Integer> currentList, int currentSum) {
		if(currentSum == target) {
			combSum.add(new ArrayList<>(currentList));
			return;
		}
		
		if(index >= candidates.length || currentSum > target) {
			return;
		}
		
		Integer element = candidates[index];
		currentList.add(element);
		DFS(candidates, target, combSum, index, currentList, currentSum + element);
		currentList.remove(element);
		DFS(candidates, target, combSum, index + 1, currentList, currentSum);
	}
}