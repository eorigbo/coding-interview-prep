package com.problems.interviewcake.ch6_dynamic_programming.q5_unbounded_knapsack_problem;

public class UnboundedKnapsack {
    public static int getMaxValue(ItemType[] types, int weightCapacity){
        int[] maxValue = new int[weightCapacity+1];

        for(ItemType type: types){
            for(int currentCapacity= 0; currentCapacity <= weightCapacity; currentCapacity++){
                int currentWeight = type.weight;
                int currentValue = type.value;

                if(currentWeight == 0 && currentValue != 0) throw new RuntimeException("Cake with no weight should not have positive value.");

                if(currentCapacity >= currentWeight){
                    maxValue[currentCapacity] = Math.max(maxValue[currentCapacity],currentValue + maxValue[currentCapacity-currentWeight]);
                }
            }
        }
        return maxValue[weightCapacity];
    }
}
