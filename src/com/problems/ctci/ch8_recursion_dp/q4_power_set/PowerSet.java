package com.problems.ctci.ch8_recursion_dp.q4_power_set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<ArrayList<Integer>> getSubsets(List<Integer> inputSet){
        return getSubsets(inputSet, 0);
    }

    private static List<ArrayList<Integer>> getSubsets(List<Integer> inputSet, int index) {
        List<ArrayList<Integer>> allSubsets;

        // Base case - add empty set
        if (inputSet.size() == index) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<Integer>());
        } else {
            //recursive call that takes you to the last index and triggers base case
            allSubsets = getSubsets(inputSet, index + 1);

            int currItem = inputSet.get(index);

            // for each item in AllSubsets,
            // add the current item and store new subset in a temp store called moreSubsets,
            // then add all elements of the moreSubsets to allSubsets

            //initialize temporary store for new subsets
            List<ArrayList<Integer>> moreSubsets = new ArrayList<>();

            // For each item in allSubsets, add current item and store in moreSubsets
            for (ArrayList<Integer> currSubset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<>(currSubset);
                newSubset.add(currItem);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }

}
