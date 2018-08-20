package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.ArrayPairEqualsSum_Attempt.arrayPairEqualsSum;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void shortFlightTest() {
        final boolean result = arrayPairEqualsSum(new int[] {2, 4}, 1);
        assertFalse(result);
    }

    @Test
    public void longFlightTest() {
        final boolean result = arrayPairEqualsSum(new int[] {2, 4}, 6);
        assertTrue(result);
    }

    @Test
    public void onlyOneMovieHalfFlightLenghtTest() {
        final boolean result = arrayPairEqualsSum(new int[] {3, 8}, 6);
        assertFalse(result);
    }

    @Test
    public void twoMoviesHalfFlightLengthTest() {
        final boolean result = arrayPairEqualsSum(new int[] {3, 8, 3}, 6);
        assertTrue(result);
    }

    @Test
    public void lotsOfPossiblePairsTest() {
        final boolean result = arrayPairEqualsSum(new int[] {1, 2, 3, 4, 5, 6}, 7);
        assertTrue(result);
    }

    @Test
    public void oneMovieTest() {
        final boolean result = arrayPairEqualsSum(new int[] {6}, 6);
        assertFalse(result);
    }

    @Test
    public void noMoviesTest() {
        final boolean result = arrayPairEqualsSum(new int[] {}, 6);
        assertFalse(result);
    }
}
