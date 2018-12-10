package com.problems.ctci.ch8_recursion_dp.q3_magic_index;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch8_recursion_dp.q3_magic_index.MagicIndexElementsNotDistinct.getMagicIndex;

public class MagicIndexElementsNotDistinctTest {
    @Test
    public void smallListTest() {
        int[] arr = {-1, 2, 2, 2, 3, 3, 3, 4, 5, 5};

        int expectedValue = 2;
        int actualValue = getMagicIndex(arr);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void otherMagicIndexTests(){
        MagicIndexTest magicIndexTest = new MagicIndexTest();

        magicIndexTest.smallListTest();
        magicIndexTest.emptyArrayTest();
        magicIndexTest.firstIndexTest();
        magicIndexTest.noMagicIndexTest();
        magicIndexTest.lastIndexTest();

    }


}
