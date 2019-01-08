package com.problems.ctci.ch10_sorting_searching.q1_merge_sorted_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch10_sorting_searching.q1_merge_sorted_arrays.MergeSortedArrays.mergeSorted;

public class MergeSortedArraysTest {
    @Test
    public void medArraysTest(){
        int[] smallArr = {2,5,7};
        int[] largeArr = {3,4,6,9,10,12,13,0,0,0};

        int[] expectedValue = {2,3,4,5,6,7,9,10,12,13};
        mergeSorted(smallArr, largeArr,7);

        Assertions.assertArrayEquals(expectedValue, largeArr);
    }

    @Test
    public void smallArraysTest(){
        int[] smallArr = {12,15,27};
        int[] largeArr = {13,44,66,0,0,0};

        int[] expectedValue = {12,13,15,27,44,66};
        mergeSorted(smallArr, largeArr,3);

        Assertions.assertArrayEquals(expectedValue, largeArr);
    }

    @Test
    public void oneEmptyArrayTest(){
        int[] smallArr = {};
        int[] largeArr = {3,4,8};

        int[] expectedValue = {3,4,8};
        mergeSorted(smallArr, largeArr,3);

        Assertions.assertArrayEquals(expectedValue, largeArr);
    }

    @Test
    public void bothEmptyArraysTest(){
        int[] smallArr = {};
        int[] largeArr = {};

        int[] expectedValue = {};
        mergeSorted(smallArr, largeArr,0);

        Assertions.assertArrayEquals(expectedValue, largeArr);
    }


}
