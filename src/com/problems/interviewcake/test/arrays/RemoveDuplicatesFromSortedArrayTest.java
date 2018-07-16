package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.RemoveDuplicatesFromSortedArray_Attempt.removeDuplicates;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void hasDuplicatesTest(){
        int[] theArray = new int[]{2,3,4,5,5,7,7,8};

        int expectedNewArraySize = 6;
        int actualNewArraySize = removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }

    @Test
    public void hasNoDuplicatesTest(){
        int[] theArray = new int[]{2,3,4,5,7,8,9};

        int expectedNewArraySize = 7;
        int actualNewArraySize = removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }
}
