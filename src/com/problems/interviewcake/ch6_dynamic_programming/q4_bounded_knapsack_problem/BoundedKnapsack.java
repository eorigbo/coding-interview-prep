package com.problems.interviewcake.ch6_dynamic_programming.q4_bounded_knapsack_problem;

import com.problems.interviewcake.ch6_dynamic_programming.q5_unbounded_knapsack_problem.ItemType;

public class BoundedKnapsack {

    public static int getMaxValue(ItemType[] types, int weightCapacity){
        int[][] maxValue = new int[types.length+1][weightCapacity+1];

        for(int i=0; i <= types.length; i++){
            for(int j=0; j<= weightCapacity; j++){
                if(i == 0 || j==0){
                    maxValue[i][j] = 0;
                }else if(j < types[i-1].weight){
                    maxValue[i][j] = maxValue[i-1][j];
                }else{
                    maxValue[i][j] = Math.max(maxValue[i-1][j],
                        types[i-1].value + maxValue[i-1][j-types[i-1].weight]);
                }
            }
        }
        return maxValue[types.length][weightCapacity];
    }
}
