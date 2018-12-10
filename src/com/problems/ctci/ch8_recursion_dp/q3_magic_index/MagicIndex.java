package com.problems.ctci.ch8_recursion_dp.q3_magic_index;

public class MagicIndex {
    public static int getMagicIndex(int[] intArray){
        return getMagicIndex(intArray, 0, intArray.length - 1);
    }

    private static int getMagicIndex(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == mid) {
            return mid;
        } else if (array[mid] > mid){
            return getMagicIndex(array, start, mid - 1);
        } else {
            return getMagicIndex(array, mid + 1, end);
        }
    }
}
