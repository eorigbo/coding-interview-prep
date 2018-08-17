package com.problems.interviewcake.code.arrays;

public class MergeSortedArrays_Attempt{

//create new array with length = sum of lengths of first and second array

//create index for first, second and merged array

//while merged index < length of merged array

//add the index of first array to merged array and increment merged array when
//second array is exhausted, or first array is not exhausted and index of first array < index of second array
//else add index of second array to merged array and increment merged array

    public static int[] mergeArrays(int[] first, int[] second){
        int[] mergedArray = new int[first.length + second.length];
        int firstIndex = 0, secondIndex = 0;

        for(int i=0; i<mergedArray.length;i++){
            boolean firstExhausted = firstIndex >= first.length;
            boolean secondExhausted = secondIndex >= second.length;

            if(!firstExhausted && (secondExhausted || first[firstIndex] < second[secondIndex])){
                mergedArray[i] = first[firstIndex];
                firstIndex++;
            }else{
                mergedArray[i] = second[secondIndex];
                secondIndex++;
            }
        }
        return mergedArray;
    }

}
