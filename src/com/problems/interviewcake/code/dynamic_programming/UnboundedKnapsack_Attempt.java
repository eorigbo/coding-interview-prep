package com.problems.interviewcake.code.dynamic_programming;

public class UnboundedKnapsack_Attempt {
    public static int getMaxValue(ItemType[] types, int capacity){

        int[] maxValue = new int[capacity+1];

        for(ItemType type: types){
            for(int currCapacity = type.weight; currCapacity <= capacity; currCapacity++){
                if(type.weight == 0 && type.value != 0) throw new RuntimeException("Cake with 0 weight has positive value.");

                maxValue[currCapacity] = Math.max(maxValue[currCapacity],type.value + maxValue[currCapacity - type.weight]);
            }
        }
        return maxValue[capacity];
    }
}
