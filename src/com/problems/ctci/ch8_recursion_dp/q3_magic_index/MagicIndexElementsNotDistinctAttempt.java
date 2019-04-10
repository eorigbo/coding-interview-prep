package com.problems.ctci.ch8_recursion_dp.q3_magic_index;

public class MagicIndexElementsNotDistinctAttempt {
    public static int getMagicIndex(int[] sortedInts){
        return getMagicIndex(sortedInts, 0, sortedInts.length-1);
    }

    public static int getMagicIndex(int[] sortedInts, int start, int end){
        if(end < start) return -1;

        int mid = ((end - start)/2) + start;
        int midValue = sortedInts[mid];

        if(midValue == mid) return mid;

        int leftIndex = Math.min(midValue, mid - 1);
        int leftResult = getMagicIndex(sortedInts, start, leftIndex);
        if(leftResult >= 0) return leftResult;

        int rightIndex = Math.max(midValue, mid + 1);
        int rightResult = getMagicIndex(sortedInts, rightIndex, end);
        if(rightResult >= 0) return rightResult;

        return -1;

    }
}
