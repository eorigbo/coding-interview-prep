package com.problems.ctci.ch10_sorting_searching.q5_sparse_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch10_sorting_searching.q5_sparse_search.SparseSearch.findIndex;

public class SparseSearchTest {
    @Test
    public void smallListTest(){
        String [] arr = {"for", "geeks", "", "", "", "", "ide",
                "practice", "", "", "", "quiz"};

        String target = "geeks";

        int expectedValue = 1;
        int actualValue = findIndex(arr, target);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void itemNotFoundTest(){
        String [] arr = {"for", "geeks", "", "", "", "", "ide",
                "practice", "", "", "", "quiz"};

        String target = "geeksa";

        int expectedValue = -1;
        int actualValue = findIndex(arr, target);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
