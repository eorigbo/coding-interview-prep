package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.MergeSortedArrays_Attempt.mergeArrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArraysTest {

    @Test
    public void mergeArraysSizeTest(){
        int[] firstArray = new int[]{3,4,6,10,11,15};
        int[] secondArray = new int[]{1,5,8,12,14,19};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        int expectedMergedArraySize = 12;
        int actualMergedArraySize = mergedArray.length;

        Assertions.assertEquals(expectedMergedArraySize,actualMergedArraySize);
    }

    @Test
    public void mergeArraysFirstElementTest(){
        int[] firstArray = new int[]{3,4,6,10,11,15};
        int[] secondArray = new int[]{1,5,8,12,14,19};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        int expectedMergedFirstElement = 1;
        int actualMergedFirstElement = mergedArray[0];

        Assertions.assertEquals(expectedMergedFirstElement,actualMergedFirstElement);
    }

    @Test
    public void mergeArraysLastElementTest(){
        int[] firstArray = new int[]{3,4,6,10,11,15};
        int[] secondArray = new int[]{1,5,8,12,14,19};

        int[] mergedArray = mergeArrays(firstArray, secondArray);

        int expectedMergedLastElement = 19;
        int actualMergedLastElement = mergedArray[mergedArray.length-1];

        Assertions.assertEquals(expectedMergedLastElement,actualMergedLastElement);
    }

    @Test
    public void bothArraysAreEmptyTest() {
        final int[] myArray = {};
        final int[] alicesArray = {};
        final int[] expected = {};
        final int[] actual = mergeArrays(myArray, alicesArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void firstArrayIsEmptyTest() {
        final int[] myArray = {};
        final int[] alicesArray = {1, 2, 3};
        final int[] expected = {1, 2, 3};
        final int[] actual = mergeArrays(myArray, alicesArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void secondArrayIsEmptyTest() {
        final int[] myArray = {5, 6, 7};
        final int[] alicesArray = {};
        final int[] expected = {5, 6, 7};
        final int[] actual = mergeArrays(myArray, alicesArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bothArraysHaveSomeNumbersTest() {
        final int[] myArray = {2, 4, 6};
        final int[] alicesArray = {1, 3, 7};
        final int[] expected = {1, 2, 3, 4, 6, 7};
        final int[] actual = mergeArrays(myArray, alicesArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arraysAreDifferentLengthsTest() {
        final int[] myArray = {2, 4, 6, 8};
        final int[] alicesArray = {1, 7};
        final int[] expected = {1, 2, 4, 6, 7, 8};
        final int[] actual = mergeArrays(myArray, alicesArray);
        assertArrayEquals(expected, actual);
    }
}
