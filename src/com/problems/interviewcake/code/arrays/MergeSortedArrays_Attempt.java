package com.problems.interviewcake.code.arrays;

public class MergeSortedArrays_Attempt{

//create new array with length = sum of lengths of first and second array

//create index for first, second and merged array

//while merged index < length of merged array

//add the index of first array to merged array and increment merged array when
//second array is exhausted, or first array is not exhausted and index of first array < index of second array
//else add index of second array to merged array and increment merged array

    public static int[] mergeArrays(int[] firstArray, int[] secondArray){

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        int currentIndexFirst = 0;
        int currentIndexSecond = 0;

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
