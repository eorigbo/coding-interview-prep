package com.problems.interviewcake.code.arrays;

public class RemoveDuplicatesFromSortedArray_Attempt{

    public static int removeDuplicates(int[] theArray){
        //return 0 if array is empty
        if(theArray.length < 2) return 1;

        int j = 0;

        //loop through array but exclude last element
        for(int i = 0; i < theArray.length - 1; i++){

            //if current element not equal to one after it, assign to element j and increment j
            if(theArray[i] != theArray[i+1]){
                theArray[j] = theArray[i];
                j++;
            }

        }

        //for last element add to j and increment j
        theArray[j] = theArray[theArray.length-1];
        j++;

        //return j as length of new array
        return j;

    }
}
