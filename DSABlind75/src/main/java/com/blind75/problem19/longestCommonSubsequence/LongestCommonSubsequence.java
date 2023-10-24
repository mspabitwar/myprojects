package com.blind75.problem19.longestCommonSubsequence;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		/*Example 1:
			Input: text1 = "abcde", text2 = "ace" 
			Output: 3  
			Explanation: The longest common subsequence is "ace" and its length is 3.
		Example 2:
			Input: text1 = "abc", text2 = "abc"
			Output: 3
			Explanation: The longest common subsequence is "abc" and its length is 3.
		Example 3:
			Input: text1 = "abc", text2 = "def"
			Output: 0
			Explanation: There is no such common subsequence, so the result is 0.*/
		
		String text1 = "abcde", text2 = "ace";
		System.out.println("The length of longest common subsequence of " + text1 + " and " + text2 + " is " + longestCommonSubsequence(text1, text2));
		
		text1 = "abc";
		text2 = "abc";
		System.out.println("The length of longest common subsequence of " + text1 + " and " + text2 + " is " + longestCommonSubsequence(text1, text2));
		
		text1 = "abc";
		text2 = "def";
		System.out.println("The length of longest common subsequence of " + text1 + " and " + text2 + " is " + longestCommonSubsequence(text1, text2));
	}

	public static int longestCommonSubsequence(String text1, String text2) {
		int length1 = text1.length();
		int length2 = text2.length();
		int[][] dp = new int[length1 + 1][length2 + 1];
		for (int row = (length1 - 1); row >= 0; row--) {
			for (int column = (length2 - 1); column >= 0; column--) {
				if (text1.charAt(row) == text2.charAt(column)) {
					dp[row][column] = 1 + dp[row + 1][column + 1];
				} else {
					dp[row][column] = Math.max(dp[row][column + 1], dp[row + 1][column]);
				}
			}
		}
		return dp[0][0];
	}
}