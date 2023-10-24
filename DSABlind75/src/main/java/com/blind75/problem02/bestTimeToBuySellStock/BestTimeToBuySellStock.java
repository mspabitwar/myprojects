package com.blind75.problem02.bestTimeToBuySellStock;

public class BestTimeToBuySellStock {

	public static void main(String[] args) {

		/*Example 1:
			Input: prices = [7,1,5,3,6,4]
			Output: 5
			Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
			Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
		Example 2:
			Input: prices = [7,6,4,3,1]
			Output: 0
			Explanation: In this case, no transactions are done and the max profit = 0.*/
		
		System.out.println("----------");
		System.out.println("Example 1");
		System.out.println("----------");
		int nums[] = { 7, 1, 5, 3, 6, 4 };
		display(nums);
		System.out.println("Max Profit : " + maxProfit(nums));

		
		System.out.println("----------");
		System.out.println("Example 2");
		System.out.println("----------");
		int num2[] = { 7, 6, 4, 3, 1 };
		display(num2);
		System.out.println("Max Profit : " + maxProfit(num2));
	}

	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int buyIndex = 0;
		int sellIndex = 1;
		while (sellIndex < prices.length) {
			if (prices[buyIndex] < prices[sellIndex]) {
				int currentProfix = prices[sellIndex] - prices[buyIndex];
				if (currentProfix > maxProfit) {
					maxProfit = currentProfix;
				}
			} else {
				buyIndex = sellIndex;
			}
			sellIndex += 1;
		}
		return maxProfit;
	}
	
	public static void display(int[] nums) {
		System.out.print("Input Array : [ ");
		for (int index = 0; index < nums.length; index++) {
			System.out.print(nums[index] + " ");
		}
		System.out.println("]");
	}
}