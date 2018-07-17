package com.problems.interviewcake.code.greedy;

public class SellStockOnce_Attempt {

    public static int getMaxProfit(int[] stockPrices){

        //throw exception if arrayLength < 2
        if(stockPrices.length < 2){
            throw new IllegalArgumentException("Get a profit requires at least 2 stock prices.");
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        //loop through stockPrices and calculate max profit as max of potential profit and max profit
        for(int currPrice: stockPrices){
            int potentialProfit = currPrice - minPrice;
            maxProfit = Math.max(potentialProfit,maxProfit);
            minPrice = Math.min(currPrice,minPrice);
        }


        //return maxProfit outside loop
        return maxProfit;

    }

}
