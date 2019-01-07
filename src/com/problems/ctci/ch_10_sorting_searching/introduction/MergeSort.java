package com.problems.ctci.ch_10_sorting_searching.introduction;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] tempArr, int low, int high) {
        if (low < high) {
            int mid = ((high - low) / 2) + low;
            mergeSort(arr, tempArr, low, mid); // Sort left half
            mergeSort(arr, tempArr, mid+1, high); // Sort right half
            merge(arr, tempArr, low, mid, high); // Merge them
        }
    }

    public static void merge(int[] arr, int[] tempArr, int low, int mid, int high) {
        /* Copy both halves into a temp array */
        for (int i = low; i <= high; i++) {
            tempArr[i] = arr[i];
        }

        int tempLeftIdx = low;
        int tempRightIdx = mid + 1;
        int index = low;

        /* Iterate through helper array. Compare the left and right
         * half, copying back the smaller element from the two halves
         * into the original array. */
        while (tempLeftIdx <= mid && tempRightIdx <= high) {
            if (tempArr[tempLeftIdx] <= tempArr[tempRightIdx]) {
                arr[index] = tempArr[tempLeftIdx];
                tempLeftIdx++;
            } else { // If right element is smaller than left element
                arr[index] = tempArr[tempRightIdx];
                tempRightIdx++;
            }
            index++;
        }

        /* Copy the rest of the left side of the array into the
         * target array */
        int remaining = mid - tempLeftIdx;
        for (int i = 0; i <= remaining; i++) {
            arr[index + i] = tempArr[tempLeftIdx + i];
        }
    }
}
