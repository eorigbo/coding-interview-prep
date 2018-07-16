package com.problems.interviewcake.code.arrays;

public class RemoveDuplicatesFromSortedArray_Attempt{

    public static int removeDuplicates(int[] sortedArray){

        //initialize j
        int j = 0;

        //loop through sortedArray but stop at arrayLength - 1 since we want to handle the last element specially
        for(int i = 0; i < sortedArray.length - 1; i++){
            //if current element and next element are not equal assign sortedArray[i] to j and increment j
            if(sortedArray[i] != sortedArray[i+1]){
                sortedArray[j] = sortedArray[i];
                j++;
            }
        }

        //for last element add to j since it always unique and increment j
        sortedArray[j] = sortedArray[sortedArray.length-1];
        j++;

        //return j as the size of the new array
        return j;
    }
}
