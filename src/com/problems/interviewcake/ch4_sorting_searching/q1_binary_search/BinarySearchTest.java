package com.problems.interviewcake.ch4_sorting_searching.q1_binary_search;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.ch4_sorting_searching.q1_binary_search.BinarySearch_Attempt.binarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void intExistsTest(){
        int[] sortedArray = new int[]{2,3,5,7,8,9};
        int target = 3;

        boolean expected = true;
        boolean actual = binarySearch(sortedArray,target);

        assertEquals(expected,actual);
    }

    @Test
    public void noIntExistsTest(){
        int[] sortedArray = new int[]{3,5,7,8,9};
        int target = 6;

        boolean expected = false;
        boolean actual = binarySearch(sortedArray,target);

        assertEquals(expected,actual);
    }

    @Test
    public void singleValueTest(){
        int[] sortedArray = new int[]{3};
        int target = 3;

        boolean expected = true;
        boolean actual = binarySearch(sortedArray,target);

        assertEquals(expected,actual);
    }

    @Test
    public void noValueTest(){
        int[] sortedArray = new int[]{};
        int target = 3;

        boolean expected = false;
        boolean actual = binarySearch(sortedArray,target);

        assertEquals(expected,actual);
    }
}
