package com.problems.interviewcake.ch3_greedy.q1_sell_stock_once;

public class SellStockOnce {

    public static int getMaxProfit(int[] stockPrices){
        if (stockPrices.length < 2){
            throw new IllegalArgumentException("Getting a profit requires at least 2 stock prices");
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int currPrice: stockPrices){
            int potentialProfit = currPrice - minPrice;
            maxProfit = Math.max(maxProfit,potentialProfit);
            minPrice = Math.min(minPrice,currPrice);
        }

        return maxProfit;
    }
}
