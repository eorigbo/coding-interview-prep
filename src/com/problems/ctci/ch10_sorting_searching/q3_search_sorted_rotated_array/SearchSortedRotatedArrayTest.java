package com.problems.ctci.ch10_sorting_searching.q3_search_sorted_rotated_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch10_sorting_searching.q3_search_sorted_rotated_array.SearchSortedRotatedArray.findIndex;

public class SearchSortedRotatedArrayTest {
    @Test
    public void midArrayTest(){
        int[] arr = { 5, 8, 15, 1, 3, 4};

        int expectedValue = 0;
        int actualValue = findIndex(arr, 5);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = 4;
        actualValue = findIndex(arr, 3);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = -1;
        actualValue = findIndex(arr, 9);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = 5;
        actualValue = findIndex(arr, 4);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = 2;
        actualValue = findIndex(arr, 15);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void allDuplicatesArrayTest(){
        int[] arr = { 6, 6, 6, 6, 6, 6};

        int expectedValue = 0;
        int actualValue = findIndex(arr, 6);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void nonRotatedArrayTest(){
        int[] arr = { 6, 8, 12, 15, 17};

        int expectedValue = 0;
        int actualValue = findIndex(arr, 6);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = 4;
        actualValue = findIndex(arr, 17);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = -1;
        actualValue = findIndex(arr, 13);

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = 2;
        actualValue = findIndex(arr, 12);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
