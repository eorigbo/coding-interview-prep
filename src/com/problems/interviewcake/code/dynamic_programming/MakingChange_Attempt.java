package com.problems.interviewcake.code.dynamic_programming;

public class MakingChange_Attempt {
    public static int getNumberOfWays(int amount,int[] denominations){

        int[] numWays = new int[amount + 1];
        numWays[0] = 1;

        for(int coin: denominations){
            for(int currentAmount = coin; currentAmount <= amount; currentAmount++){
                numWays[currentAmount] += numWays[currentAmount - coin];
            }
        }
        return numWays[amount];
    }
}
