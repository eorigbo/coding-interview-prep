package com.problems.interviewcake.code.arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] sortedArray){

        int arrayLength = sortedArray.length;
        if(arrayLength == 0 || arrayLength == 1)return arrayLength;

        int j = 0;

        //we do i < arrayLength - 1 because we want to process
        //the last element separately. It will always be unique
        for (int i = 0; i < arrayLength-1; i++){
            if (sortedArray[i] != sortedArray[i+1]){
                sortedArray[j] = sortedArray[i];
                j++;
            }
        }

        //add the last element of array as it will always be unique
        sortedArray[j] = sortedArray[arrayLength-1];
        j++;
        return j;
    }
}
