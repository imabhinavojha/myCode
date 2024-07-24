package org.Leetcode.LeetCode;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        Best_Time_to_Buy_and_Sell_Stock obj = new Best_Time_to_Buy_and_Sell_Stock();
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        obj.maxProfit(arr);
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

}
