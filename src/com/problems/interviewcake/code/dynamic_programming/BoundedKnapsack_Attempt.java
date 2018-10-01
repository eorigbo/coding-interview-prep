package com.problems.interviewcake.code.dynamic_programming;

public class BoundedKnapsack_Attempt {
    public static int getMaxValue(ItemType[] items, int maxCapacity){

        //create 2d array value of capacity on x-axis and items on y-axis
        int[][] maxValue = new int[items.length+1][maxCapacity+1];

        //loop from 0 to maxCapacity, and from 0 to items.length
        for(int i=0; i <= items.length; i++){
            for(int j=0; j <= maxCapacity; j++){
                if(i == 0 || j == 0) maxValue[i][j] = 0;
                else if (j < items[i-1].weight) maxValue[i][j] = maxValue[i-1][j];
                else maxValue[i][j] = Math.max(maxValue[i-1][j], items[i-1].value + maxValue[i-1][j-items[i-1].weight]);
            }
        }
        return maxValue[items.length][maxCapacity];
    }
}
