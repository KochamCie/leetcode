package com.hama.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * Accepted
 */
public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit = prices[j]-prices[i];
                if(profit>max){
                    max = profit;
                }
            }
        }
        return max;

    }


    public int maxProfit2(int[] prices){
        int max = 0, result = 0;
        for(int i=1; i<prices.length; i++){
            int minus = prices[i] - prices[i-1];
            max += minus;
            if(max<0) max = 0;
            if(max>result){
                result = max;
            }
        }
        return result;

    }




}
