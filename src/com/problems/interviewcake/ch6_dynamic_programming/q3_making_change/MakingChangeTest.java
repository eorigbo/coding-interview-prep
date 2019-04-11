package com.problems.interviewcake.ch6_dynamic_programming.q3_making_change;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.ch6_dynamic_programming.q3_making_change.MakingChange_Attempt.getNumberOfWays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingChangeTest {
    @Test
    public void sampleInputTest() {
        final int actual = getNumberOfWays(4, new int[] {1, 2, 3});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void oneWayToMakeZeroCentsTest() {
        final int actual = getNumberOfWays(0, new int[] {1, 2});
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void noWaysIfNoCoinsTest() {
        final int actual = getNumberOfWays(1, new int[] {});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void bigCoinValueTest() {
        final int actual = getNumberOfWays(5, new int[] {25, 50});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void bigTargetAmountTest() {
        final int actual = getNumberOfWays(50, new int[] {5, 10});
        final int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void changeForOneDollarTest() {
        final int actual = getNumberOfWays(100, new int[] {1, 5, 10, 25, 50});
        final int expected = 292;
        assertEquals(expected, actual);
    }
}
