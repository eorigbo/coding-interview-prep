package com.problems.interviewcake.code.arrays;

public class RemoveDuplicatesFromSortedArray_Attempt{

    public static int removeDuplicates(int[] sortedArray){

        int j = 0;
        for(int i = 0; i < sortedArray.length-1; i++){
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
