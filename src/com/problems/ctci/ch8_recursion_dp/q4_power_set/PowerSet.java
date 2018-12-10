package com.problems.ctci.ch8_recursion_dp.q4_power_set;

import java.util.ArrayList;

public class PowerSet {

    public static ArrayList<Integer> convertIntToSet(int parentIndex, ArrayList<Integer> set) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        int setIdx = 0;
        for (int i = parentIndex; i > 0; i >>= 1) {
            if ((i & 1) == 1) {
                subset.add(set.get(setIdx));
            }
            setIdx++;
        }
        return subset;
    }

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.size(); /* Compute 2^n */
        for (int i = 0; i < max; i++) {
            ArrayList<Integer> subset = convertIntToSet(i, set);
            allSubsets.add(subset);
        }
        return allSubsets;
    }

}
