package com.problems.interviewcake.code.arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] firstArray, int[] secondArray){

        //setup our mergedArray
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int currentIndexFirst = 0;
        int currentIndexSecond = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length){

            boolean isFirstArrayExhausted = currentIndexFirst >= firstArray.length;
            boolean isSecondArrayExhausted = currentIndexSecond >= secondArray.length;

            /*
            add firstArray element to mergedArray AND
            increment currentIndexFirst if
            first array is not exhausted AND
            second array is exhausted OR
            currentIndexFirst < currentIndexSecond
            */
            if (!isFirstArrayExhausted && (isSecondArrayExhausted || firstArray[currentIndexFirst] < secondArray[currentIndexSecond])){
                mergedArray[currentIndexMerged] = firstArray[currentIndexFirst];
                currentIndexFirst++;
            }else{
                mergedArray[currentIndexMerged] = secondArray[currentIndexSecond];
                currentIndexSecond++;
            }


            currentIndexMerged++;
        }

        return mergedArray;
    }
}
