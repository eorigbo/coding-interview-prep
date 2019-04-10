package com.problems.ctci.ch8_recursion_dp.q4_power_set;

import java.util.ArrayList;
import java.util.List;

public class PowerSetAttempt {
    public static List<ArrayList<Integer>> getSubsets(List<Integer> inputList){
        return getSubsets(inputList, 0);
    }

    private static List<ArrayList<Integer>> getSubsets(List<Integer> inputList, int index){
        List<ArrayList<Integer>> allSubsets;

        //base case - index and size are the same
        if(index == inputList.size()){
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
        }else{
            //recursive call
            allSubsets = getSubsets(inputList, index + 1);

            //currItem
            int currItem = inputList.get(index);

            //moreSubsets
            List<ArrayList<Integer>> moreSubsets = new ArrayList<>();

            //loop through allSubsets
            for(ArrayList<Integer> currSubset: allSubsets){
                //initialize newSubset and add currItem then add to moreSubsets
                ArrayList<Integer> newSubset = new ArrayList<>(currSubset);
                newSubset.add(currItem);
                moreSubsets.add(newSubset);
            }
            //outside loop add all of moreSubsets to allSubsets
            allSubsets.addAll(moreSubsets);
        }
        //return allSubsets
        return allSubsets;
    }
}
