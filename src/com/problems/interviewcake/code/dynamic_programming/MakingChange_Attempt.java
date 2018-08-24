package com.problems.interviewcake.code.dynamic_programming;

public class MakingChange_Attempt {
    public static int getNumberOfWays(int amount, int[] coins ){

        int[] numWays = new int[amount+1];
        numWays[0] = 1;

        for(int coin: coins){
            for(int currAmount = coin; currAmount <= amount; currAmount++){
                numWays[currAmount] += numWays[currAmount - coin];
            }
        }
        return numWays[amount];
    }
}
