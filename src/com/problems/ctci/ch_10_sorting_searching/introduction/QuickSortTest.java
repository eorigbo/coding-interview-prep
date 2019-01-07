package com.problems.ctci.ch_10_sorting_searching.introduction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch_10_sorting_searching.introduction.QuickSort.quickSort;

public class QuickSortTest {
    @Test
    public void medListTest(){
        int[] actualInts = {2,7,1,19,6,4,5};

        int[] expectedInts = {1,2,4,5,6,7,19};
        quickSort(actualInts);

        Assertions.assertArrayEquals(actualInts, expectedInts);
    }

    @Test
    public void smallListTest(){
        int[] actualInts = {5,12,4,13,6};

        int[] expectedInts = {4,5,6,12,13};
        quickSort(actualInts);

        Assertions.assertArrayEquals(expectedInts, actualInts);
    }

    @Test
    public void sortedListTest(){
        int[] actualInts = {6,7,8,9,10};

        int[] expectedInts = {6,7,8,9,10};
        quickSort(actualInts);

        Assertions.assertArrayEquals(expectedInts, actualInts);
    }
}
