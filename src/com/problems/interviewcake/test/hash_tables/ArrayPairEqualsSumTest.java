package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.ArrayPairEqualsSum.arrayPairEqualsSum;

public class ArrayPairEqualsSumTest {

    @Test
    public void arrayPairSumExistsTest(){
        int[] testArray = new int[]{1,2,3,4,5};
        int sumPair = 5;

        boolean expectedSumPairExists = true;
        boolean actualSumPairExists = arrayPairEqualsSum(testArray,sumPair);

        Assertions.assertEquals(expectedSumPairExists,actualSumPairExists);
    }

    @Test
    public void arrayPairNoSumExistsTest(){
        int[] testArray = new int[]{1,3,5,7,9};
        int sumPair = 55;

        boolean expectedSumPairExists = false;
        boolean actualSumPairExists = arrayPairEqualsSum(testArray,sumPair);

        Assertions.assertEquals(expectedSumPairExists,actualSumPairExists);
    }
}
