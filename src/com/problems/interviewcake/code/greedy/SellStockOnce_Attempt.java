package com.problems.interviewcake.code.greedy;

public class SellStockOnce_Attempt {

    public static int getMaxProfit(int[] stockPrices){
        if(stockPrices == null || stockPrices.length < 2) throw new IllegalArgumentException("At least two prices are needed.");
        //initialize profit as integer.min, minprice as Integer.max
        int maxProfit = Integer.MIN_VALUE, minPrice = Integer.MAX_VALUE;

        //loop through and calculate potential profit as currprice - min price
        for(int currPrice: stockPrices){
            int potentialProfit = currPrice - minPrice;
            maxProfit = Math.max(maxProfit,potentialProfit);
            minPrice = Math.min(minPrice,currPrice);
        }
        return maxProfit;
    }
}
