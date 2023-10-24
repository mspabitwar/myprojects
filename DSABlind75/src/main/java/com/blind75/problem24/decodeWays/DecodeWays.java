package com.blind75.problem24.decodeWays;

public class DecodeWays {

	public static void main(String[] args) {

		/*Example 1:
			Input: s = "12"
			Output: 2
			Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
		Example 2:
			Input: s = "226"
			Output: 3
			Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
		Example 3:
			Input: s = "06"
			Output: 0
			Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").*/
		
		String s = "12";
		System.out.println(s + " can be decoded in " + numDecodings(s) + " ways");
		
		s = "226";
		System.out.println(s + " can be decoded in " + numDecodings(s) + " ways");
		
		s = "06";
		System.out.println(s + " can be decoded in " + numDecodings(s) + " ways");
	}
	
	public static int numDecodings(String s) {
		int dp1 = 1, dp2 = 0, length = s.length();
		for (int index = length - 1; index >= 0; index--) {
			int dp = s.charAt(index) == '0' ? 0 : dp1;
			if (index < length - 1 && (s.charAt(index) == '1' || s.charAt(index) == '2' && s.charAt(index + 1) < '7'))
				dp += dp2;
			dp2 = dp1;
			dp1 = dp;
		}
		return dp1;
	}
}