package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.MergeSortedArrays_Attempt.mergeArrays;

public class MergeSortedArraysTest {

    @Test
    public void mergeArraysTest(){
        int[] firstArray = new int[]{3,4,6,10,11,15};
        int[] secondArray = new int[]{1,5,8,12,14,19};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        int expectedMergedArraySize = 12;
        int actualMergedArraySize = mergedArray.length;

        Assertions.assertEquals(expectedMergedArraySize,actualMergedArraySize);
    }

    @Test
    public void mergeArraysTestFirst(){
        int[] firstArray = new int[]{3,4,6,10,11,15};
        int[] secondArray = new int[]{1,5,8,12,14,19};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        int expectedMergedFirstElement = 1;
        int actualMergedFirstElement = mergedArray[0];

        Assertions.assertEquals(expectedMergedFirstElement,actualMergedFirstElement);
    }

    @Test
    public void mergeArraysTestLast(){
        int[] firstArray = new int[]{3,4,6,10,11,15};
        int[] secondArray = new int[]{1,5,8,12,14,19};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        int expectedMergedLastElement = 19;
        int actualMergedLastElement = mergedArray[mergedArray.length-1];

        Assertions.assertEquals(expectedMergedLastElement,actualMergedLastElement);
    }
}
