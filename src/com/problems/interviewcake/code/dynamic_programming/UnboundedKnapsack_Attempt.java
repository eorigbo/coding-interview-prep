package com.problems.interviewcake.code.dynamic_programming;

public class UnboundedKnapsack_Attempt {
    public static int getMaxValue(ItemType[] types, int weightCapacity){

        int[] maxValue = new int[weightCapacity+1];

        for(ItemType type: types){
            for(int currentCapacity=type.weight; currentCapacity <= weightCapacity; currentCapacity++){
                if(type.weight == 0 && type.value != 0) throw new RuntimeException("Item with weight of 0 has a positive value.");

                maxValue[currentCapacity] = Math.max(maxValue[currentCapacity],type.value
                        + maxValue[currentCapacity - type.weight]);
            }
        }
        return maxValue[weightCapacity];
    }
}
