package com.problems.ctci.ch_10_sorting_searching.introduction;

public class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int leftIndex, int rightIndex){
        if(leftIndex >= rightIndex) return;

        int pivotValue = arr[(leftIndex + rightIndex)/2];
        int index = partition(arr, leftIndex, rightIndex, pivotValue);
        quickSort(arr, leftIndex, index - 1);
        quickSort(arr, index, rightIndex);
    }

    public static int partition(int[] arr, int leftIndex, int rightIndex, int pivot){
        while(leftIndex <= rightIndex){
            while(arr[leftIndex] < pivot)leftIndex++;
            while(arr[rightIndex] > pivot) rightIndex--;

            if(leftIndex <= rightIndex){
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(int[] arr, int left, int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
