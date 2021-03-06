package com.problems.interviewcake.ch3_greedy.q2_highest_product_3_ints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HighestProduct3IntsTest {
    @Test
    public void shortArrayTest() {
        final int actual = HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {1, 2, 3, 4});
        final int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void longerArrayTest() {
        final int actual = HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {6, 1, 3, 5, 7, 8, 2});
        final int expected = 336;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayHasOneNegativeTest() {
        final int actual = HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {-5, 4, 8, 2, 3});
        final int expected = 96;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayHasTwoNegativesTest() {
        final int actual = HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {-10, 1, 3, 2, -10});
        final int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayIsAllNegativesTest() {
        final int actual = HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {-5, -1, -3, -2});
        final int expected = -6;
        assertEquals(expected, actual);
    }

    @Test
    public void exceptionWithEmptyArrayTest() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {});
                });
    }

    @Test
    public void exceptionWithOneNumberTest() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {1});
                });
    }

    @Test
    public void exceptionWithTwoNumbersTest() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    HighestProduct3Ints_Attempt.highestProduct3Ints(new int[] {1, 1});
                });
    }
}
