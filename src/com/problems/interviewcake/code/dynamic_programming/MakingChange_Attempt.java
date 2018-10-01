package com.problems.interviewcake.code.dynamic_programming;

public class MakingChange_Attempt {
    public static int getNumberOfWays(int change, int[] coins){

        int[] numWays = new int[change+1];

        numWays[0] = 1;

        for(int coin: coins){
            for(int i = coin; i <= change; i++){
                numWays[i] += numWays[i-coin];
            }
        }
        return numWays[change];
    }
}
