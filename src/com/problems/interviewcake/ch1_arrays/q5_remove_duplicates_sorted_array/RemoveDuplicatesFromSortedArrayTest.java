package com.problems.interviewcake.ch1_arrays.q5_remove_duplicates_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void hasDuplicatesTest(){
        int[] theArray = new int[]{2,3,4,5,5,7,7,8};

        int expectedNewArraySize = 6;
        int actualNewArraySize = RemoveDuplicatesFromSortedArray_Attempt.removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }

    @Test
    public void hasNoDuplicatesTest(){
        int[] theArray = new int[]{2,3,4,5,7,8,9};

        int expectedNewArraySize = 7;
        int actualNewArraySize = RemoveDuplicatesFromSortedArray_Attempt.removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }

    @Test
    public void emptyArrayTest(){
        int[] theArray = new int[]{};

        int expectedNewArraySize = 0;
        int actualNewArraySize = RemoveDuplicatesFromSortedArray_Attempt.removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }

    @Test
    public void singleItemArrayTest(){
        int[] theArray = new int[]{2};

        int expectedNewArraySize = 1;
        int actualNewArraySize = RemoveDuplicatesFromSortedArray_Attempt.removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }

    @Test
    public void emptyArrayFiveItemsTest(){
        int[] theArray = new int[5];

        int expectedNewArraySize = 1;
        int actualNewArraySize = RemoveDuplicatesFromSortedArray_Attempt.removeDuplicates(theArray);

        Assertions.assertEquals(expectedNewArraySize,actualNewArraySize);
    }
}
