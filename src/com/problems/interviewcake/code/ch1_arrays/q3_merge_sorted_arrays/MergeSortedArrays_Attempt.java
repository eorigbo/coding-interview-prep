package com.problems.interviewcake.code.ch1_arrays.q3_merge_sorted_arrays;

public class MergeSortedArrays_Attempt{

//create new array with length = sum of lengths of first and second array

//create index for first, second and merged array

//while merged index < length of merged array

//add the index of first array to merged array and increment merged array when
//second array is exhausted, or first array is not exhausted and index of first array < index of second array
//else add index of second array to merged array and increment merged array

    public static int[] mergeArrays(int[] firstHalf, int[] secondHalf){

        int firstIdx = 0, secondIdx = 0;

        int[] mergedArray = new int[firstHalf.length + secondHalf.length];

        for(int i = 0; i < mergedArray.length; i++){
            boolean firstExh = firstIdx >= firstHalf.length;
            boolean secondExh = secondIdx >= secondHalf.length;

            if(!firstExh && (secondExh || firstHalf[firstIdx] < secondHalf[secondIdx])){
                mergedArray[i] = firstHalf[firstIdx];
                firstIdx++;
            } else {
                mergedArray[i] = secondHalf[secondIdx];
                secondIdx++;
            }
        }
        return mergedArray;
    }


}
