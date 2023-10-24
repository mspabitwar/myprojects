package com.blind75.problem17.coinChange;

public class CoinChange {

	public static void main(String[] args) {
		
		/*Example 1:
			Input: coins = [1,2,5], amount = 11
			Output: 3
			Explanation: 11 = 5 + 5 + 1
		Example 2:
			Input: coins = [2], amount = 3
			Output: -1
		Example 3:
			Input: coins = [1], amount = 0
			Output: 0*/
		
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		display(coins);
		System.out.println("Fewest Number of coins to make upto amount " + amount + " = " + coinChange(coins, amount));
		
		int[] coins2 = { 2 };
		int amount2 = 3;
		display(coins2);
		System.out.println("Fewest Number of coins to make upto amount " + amount2 + " = " + coinChange(coins2, amount2));
		
		int[] coins3 = { 1 };
		int amount3 = 0;
		display(coins3);
		System.out.println("Fewest Number of coins to make upto amount " + amount3 + " = " + coinChange(coins3, amount3));
		
		int[] coins4 = { 1, 3, 4, 5 };
		int amount4 = 7;
		display(coins4);
		System.out.println("Fewest Number of coins to make upto amount " + amount4 + " = " + coinChange(coins4, amount4));
	}
	
	public static int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		for (int amt = 1; amt <= amount; amt++) {
			dp[amt] = amount + 1;
			for (int coinIndex = 0; coinIndex < coins.length; coinIndex++) {
				int currentCoin = coins[coinIndex];
				if (amt - currentCoin >= 0) {
					dp[amt] = Math.min(dp[amt], 1 + dp[amt - currentCoin]);
				}
			}
		}
		return dp[amount] != (amount + 1) ? dp[amount] : -1;
	}

	public static void display(int[] nums) {
		System.out.print("Coins : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}