package com.problems.interviewcake.ch4_sorting_searching.q2_find_index_rotated_array;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.ch4_sorting_searching.q2_find_index_rotated_array.FindIndexOfRotatedArray_Attempt.findIndexOfRotatedArray;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindIndexOfRotatedArrayTest {

    @Test
    public void smallArrayTest() {
        final int actual = findIndexOfRotatedArray(new String[] {"cape", "cake"});
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void mediumArrayTest() {
        final int actual = findIndexOfRotatedArray(new String[] {"grape", "orange", "plum",
                "radish", "apple"});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void largeArrayTest() {
        final int actual = findIndexOfRotatedArray(
                new String[] {"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
                        "asymptote", "babka", "banoffee", "engender", "othellolagkage"});
        final int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void emptyArrayTest() {
        assertThrows(IllegalArgumentException.class,
                    ()->{
                        findIndexOfRotatedArray(new String[]{});
                        }
                    );
    }

    @Test
    public void nonRotatedArrayTest() {
        final int actual = findIndexOfRotatedArray(
                new String[] {"asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void sameStringArrayTest() {
        final int actual = findIndexOfRotatedArray(
                new String[] {"asymptote","asymptote","asymptote","asymptote","asymptote","asymptote"});
        final int expected = 0;
        assertEquals(expected, actual);
    }
}
