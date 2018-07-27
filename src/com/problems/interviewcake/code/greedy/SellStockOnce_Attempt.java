package com.problems.interviewcake.code.greedy;

public class SellStockOnce_Attempt {

    public static int getMaxProfit(int[] theArray){
        if(theArray.length < 2){
            throw new IllegalArgumentException("We need at least 2 prices to trade.");
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int potentialProfit;

        for(int currPrice: theArray){
            potentialProfit = currPrice - minPrice;
            maxProfit = Math.max(maxProfit,potentialProfit);
            minPrice = Math.min(minPrice, currPrice);
        }
        return maxProfit;
    }

}
