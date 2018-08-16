package com.problems.interviewcake.code.greedy;

public class SellStockOnce_Attempt {

    public static int getMaxProfit(int[] stockPrices){
        if(stockPrices.length < 2) throw new IllegalArgumentException("At least two stock prices are needed to make a sale.");

        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for(int currPrice: stockPrices){
            int potentialProfit = currPrice - minPrice;
            maxProfit = Math.max(maxProfit,potentialProfit);
            minPrice = Math.min(currPrice, minPrice);
        }
        return maxProfit;
    }
}
