package com.problems.ctci.ch8_recursion_dp.q4_power_set;

import java.util.ArrayList;

public class PowerSet {

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> inputSet, int index) {
        ArrayList<ArrayList<Integer>> allSubsets;
        if (inputSet.size() == index) { // Base case - add empty set
            allSubsets = new ArrayList<ArrayList<Integer>>();
            allSubsets.add(new ArrayList<Integer>());
        } else {
            allSubsets = getSubsets(inputSet, index + 1);
            int item = inputSet.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<>();
            for (ArrayList<Integer> subset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }

}
