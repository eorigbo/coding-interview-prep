package com.problems.ctci.ch8_recursion_dp.q3_magic_index;

public class MagicIndexElementsNotDistinct {
    public static int getMagicIndex(int[] intArray){
        return getMagicIndex(intArray, 0, intArray.length - 1);
    }

    private static int getMagicIndex(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }
        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];
        if (midValue == midIndex) {
            return midIndex;
        }
        /* Search left */
        int leftIndex = Math.min(midIndex - 1, midValue);
        int left = getMagicIndex(array, start, leftIndex);
        if (left >= 0) return left;


        /* Search right */
        int rightIndex = Math.max(midIndex + 1, midValue);
        int right = getMagicIndex(array, rightIndex, end);

        return right;
    }
}
