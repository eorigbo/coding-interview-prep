package com.problems.ctci.ch10_sorting_searching.q4_search_sorted_array_no_size;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch10_sorting_searching.q4_search_sorted_array_no_size.SearchSortedArrayNoSize.findIndex;

public class SearchSortedArrayNoSizeTest {
    @Test
    public void smallListTest(){
        int[] arr = {3, 6, 7, 8, 10, 12};
        Listy listy = new Listy(arr);

        int expectedValue = 2;
        int actualValue = findIndex(listy, 7);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void targetNotInListTest(){
        int[] arr = {4, 5, 9, 11, 14, 19};
        Listy listy = new Listy(arr);

        int expectedValue = -1;
        int actualValue = findIndex(listy, 15);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
