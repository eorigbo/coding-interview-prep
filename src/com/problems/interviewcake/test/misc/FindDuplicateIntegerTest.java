package com.problems.interviewcake.test.misc;

import org.junit.jupiter.api.Test;
import static com.problems.interviewcake.code.misc.FindDuplicateInteger.findDuplicate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicateIntegerTest {

    @Test
    public void shortArrayTest() {
        final int[] numbers = {1, 2, 1};
        final int expected = 1;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void mediumArrayTest() {
        final int[] numbers = {4, 1, 3, 4, 2};
        final int expected = 4;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void longArrayTest() {
        final int[] numbers = {1, 5, 9, 7, 2, 6, 3, 8, 2, 4};
        final int expected = 2;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }
}
