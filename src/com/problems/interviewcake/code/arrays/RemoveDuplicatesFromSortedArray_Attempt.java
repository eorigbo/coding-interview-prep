package com.problems.interviewcake.code.arrays;

public class RemoveDuplicatesFromSortedArray_Attempt{

    public static int removeDuplicates(int[] theArray){

        if(theArray == null || theArray.length < 2)throw new IllegalArgumentException("Array length should be greater than 1");

        int j = 0;
        for(int i = 0; i < theArray.length - 1; i++){
            if(theArray[i] != theArray[i+1]){
                int valueAtI = theArray[i];
                theArray[i] = theArray[j];
                theArray[j] = valueAtI;
                j++;
            }
        }
        int valueAtI = theArray[theArray.length-1];
        theArray[theArray.length-1] = theArray[j];
        theArray[j] = valueAtI;
        j++;
        return j;
    }
}
