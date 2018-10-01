package com.problems.interviewcake.code.arrays;

public class RemoveDuplicatesFromSortedArray_Attempt{

    public static int removeDuplicates(int[] sortedArray){
        if(sortedArray.length == 0) return 0;

        //initialize int j as 0
        int j = 0;

        //loop through array starting at 0 and going on till the 2nd to last element
        for(int i = 0; i < sortedArray.length - 1; i++){
            if(sortedArray[i] != sortedArray[i+1]){
                sortedArray[j] = sortedArray[i];
                j++;
            }
        }

        sortedArray[j] = sortedArray[sortedArray.length-1];
        j++;
        return j;

    }
}
