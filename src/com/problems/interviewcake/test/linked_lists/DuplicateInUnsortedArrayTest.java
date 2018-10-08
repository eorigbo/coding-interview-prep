package com.problems.interviewcake.test.linked_lists;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.linked_lists.DuplicateInUnsortedArray_Attempt.findDuplicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateInUnsortedArrayTest {

    @Test
    public void justTheRepeatedNumberTest() {
        final int[] numbers = {1, 1};
        final int expected = 1;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void shortArrayTest() {
        final int[] numbers = {1, 2, 3, 2};
        final int expected = 2;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void multipleDuplicatesTest() {
        final int[] numbers = {2, 3, 4, 4, 1, 5, 5};
        final int expected = 4;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void longArrayTest() {
        final int[] numbers = {4, 1, 4, 8, 3, 2, 7, 6, 5};
        final int expected = 4;
        final int actual = findDuplicate(numbers);
        assertEquals(expected, actual);
    }
}

