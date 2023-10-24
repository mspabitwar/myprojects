package com.blind75.problem20.wordBreak;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
	
		/*Example 1:
			Input: s = "leetcode", wordDict = ["leet","code"]
			Output: true
			Explanation: Return true because "leetcode" can be segmented as "leet code".
		Example 2:
			Input: s = "applepenapple", wordDict = ["apple","pen"]
			Output: true
			Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
			Note that you are allowed to reuse a dictionary word.
		Example 3:
			Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
			Output: false*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		String inputString = "leetcode";
		List<String> wordDict = Arrays.asList("leet", "code");
		System.out.println("InputString : " + inputString + ", wordDict : " + wordDict);
		System.out.println("Word Break ? " + wordBreak(inputString, wordDict));
		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		inputString = "applepenapple";
		wordDict = Arrays.asList("apple", "pen");
		System.out.println("InputString : " + inputString + ", wordDict : " + wordDict);
		System.out.println("Word Break ? " + wordBreak(inputString, wordDict));
		
		System.out.println("----------");
		System.out.println("Example 3");
		System.out.println("----------");
		inputString = "catsandog";
		wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
		System.out.println("InputString : " + inputString + ", wordDict : " + wordDict);
		System.out.println("Word Break ? " + wordBreak(inputString, wordDict));
	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
		int length = s.length();
		int[] dp = new int[length + 1];
		dp[length] = 1;
		for (int index = length; index >= 0; index--) {
			for (String word : wordDict) {
				if (index + word.length() <= length && s.substring(index, index + word.length()).equals(word)) {
					dp[index] = dp[index + word.length()];
				} else {
					continue;
				}
				if (dp[index] == 1) {
					break;
				}
			}
		}
		return dp[0] == 1;
	}
}