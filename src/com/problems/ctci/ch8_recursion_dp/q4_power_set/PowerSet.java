package com.problems.ctci.ch8_recursion_dp.q4_power_set;

import java.util.ArrayList;

public class PowerSet {

    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> inputSet, int index) {
        ArrayList<ArrayList<Integer>> allSubsets;
        if (inputSet.size() == index) { // Base case - add empty set
            allSubsets = new ArrayList<ArrayList<Integer>>();
            allSubsets.add(new ArrayList<Integer>());
        } else {
            //recursive call that takes you to the last index and triggers base case
            allSubsets = getSubsets(inputSet, index + 1);

            int currItem = inputSet.get(index);

            //initialize temporary store for new subsets
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<>();

            /**for each subset in AllSubsets, add the current item and store
             * new subset in temporary store, then add all elements of the temp store
             * to allSubsets*/
            for (ArrayList<Integer> currSubset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(currSubset);
                newSubset.add(currItem);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }

}
