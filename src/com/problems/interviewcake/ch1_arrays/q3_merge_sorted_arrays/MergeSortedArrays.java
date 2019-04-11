package com.problems.interviewcake.ch1_arrays.q3_merge_sorted_arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] firstArray, int[] secondArray){

        //setup our mergedArray
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int currentIndexFirst = 0;
        int currentIndexSecond = 0;

        /*add firstArray element to mergedArray IF
            first array is not exhausted AND
            second array is exhausted OR currentIndexFirst < currentIndexSecond
        */

        for (int i = 0; i < mergedArray.length; i++){

            boolean isFirstExhausted = currentIndexFirst >= firstArray.length;
            boolean isSecondExhausted = currentIndexSecond >= secondArray.length;

            if(!isFirstExhausted && (isSecondExhausted || firstArray[currentIndexFirst] < secondArray[currentIndexSecond])){
                mergedArray[i] = firstArray[currentIndexFirst];
                currentIndexFirst++;
            }else{
                mergedArray[i] = secondArray[currentIndexSecond];
                currentIndexSecond++;
            }
        }

        return mergedArray;
    }
}
