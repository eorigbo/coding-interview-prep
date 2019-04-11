package com.problems.interviewcake.ch6_dynamic_programming.q3_making_change;

public class MakingChange {
    public static int getNumberOfWays(int amount, int[] denominations){
        int[] numWays = new int[amount+1];
        numWays[0] = 1;

        for(int coin: denominations){
            for(int higherAmount = coin; higherAmount <= amount; higherAmount++){
                int higherAmountRemainder = higherAmount - coin;
                numWays[higherAmount] += numWays[higherAmountRemainder];
            }
        }
        return numWays[amount];
    }
}
