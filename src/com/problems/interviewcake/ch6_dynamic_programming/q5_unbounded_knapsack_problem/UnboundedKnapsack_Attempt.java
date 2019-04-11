package com.problems.interviewcake.ch6_dynamic_programming.q5_unbounded_knapsack_problem;

public class UnboundedKnapsack_Attempt {
    public static int getMaxValue(ItemType[] items, int maxCapacity){
        int[] maxValue = new int[maxCapacity+1];

        for(ItemType item: items){
            for(int i = item.weight; i <= maxCapacity; i++){
                if(item.weight == 0 && item.value > 0) throw new IllegalArgumentException("Item with no weight has positive value.");
                maxValue[i] = Math.max(maxValue[i], item.value + maxValue[i - item.weight]);
            }
        }
        return maxValue[maxCapacity];
    }
}
