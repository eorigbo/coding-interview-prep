package com.problems.ctci.ch8_recursion_dp.q3_magic_index;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch8_recursion_dp.q3_magic_index.MagicIndexElementsNotDistinct.getMagicIndex;

public class MagicIndexElementsNotDistinctTest {
    @Test
    public void medListTest() {
        int[] arr = {-1, 2, 2, 2, 3, 3, 3, 4, 5, 5};

        int expectedValue = 2;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void smallListTest(){
        int[] arr = {-2,-1,1,3,4,6,8};

        int expectedValue = 3;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void noMagicIndexTest(){
        int[] arr = {-2,-1,1,2,5,6,8};

        int expectedValue = -1;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void emptyArrayTest(){
        int[] arr = {};

        int expectedValue = -1;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void firstIndexTest(){
        int[] arr = {0,2,4,5,6,7,9,10,12,13};

        int expectedValue = 0;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void lastIndexTest(){
        int[] arr = {-12,-8,-4,-2,0,2,4,5,7,9};

        int expectedValue = 9;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

}
