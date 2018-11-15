package com.problems.ctci.ch1_arrays_strings.q1_unique_char_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueCharStringsTest {
    @Test
    public void smallWordTest(){
        final String word = "man";
        boolean expected = true;
        boolean actual = UniqueCharStringsAttempt.hasUniqueChars(word);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void smallWordNotUniqueTest(){
        final String word = "naan";
        boolean expected = false;
        boolean actual = UniqueCharStringsAttempt.hasUniqueChars(word);
        Assertions.assertEquals(expected, actual);
    }
}
