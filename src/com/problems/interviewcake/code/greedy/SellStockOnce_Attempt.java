package com.problems.interviewcake.code.greedy;

public class SellStockOnce_Attempt {

    public static int getMaxProfit(int[] prices){
        if(prices.length < 2) throw new IllegalArgumentException("At least 2 prices are needed to calculate a profit.");

        //initialize max profit and min price vars
        int maxProfit = Integer.MIN_VALUE, minPrice = Integer.MAX_VALUE;

        //loop through and calc potential profit as current price - min price
        for(int price: prices){
            int potentialProfit = price - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(price, minPrice);
        }

        //return max profit
        return maxProfit;
    }
}
