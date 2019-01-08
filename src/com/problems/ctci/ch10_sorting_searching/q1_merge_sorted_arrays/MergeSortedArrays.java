package com.problems.ctci.ch10_sorting_searching.q1_merge_sorted_arrays;

public class MergeSortedArrays {
    public static void mergeSorted(int[] smallArray, int[] largeArray, int largeArrayCount ){
        int largeIndex = largeArrayCount - 1;
        int smallIndex = smallArray.length - 1;
        int mergedIndex = smallArray.length + largeArrayCount - 1;

        while(mergedIndex >= 0){
            if(smallIndex >= 0 && (largeIndex < 0 || smallArray[smallIndex] > largeArray[largeIndex])){
                largeArray[mergedIndex] = smallArray[smallIndex];
                smallIndex--;
            }else{
                largeArray[mergedIndex] = largeArray[largeIndex];
                largeIndex--;
            }
            mergedIndex--;
        }
    }
}


