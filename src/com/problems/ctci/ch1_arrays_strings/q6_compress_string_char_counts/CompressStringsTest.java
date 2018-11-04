package com.problems.ctci.ch1_arrays_strings.q6_compress_string_char_counts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch1_arrays_strings.q6_compress_string_char_counts.CompressStrings.compress;

public class CompressStringsTest {
    @Test
    public void smallStringTest(){
        final String newString = "aabbbccccaaa";
        final String expectedString = "a2b3c4a3";

        String actualString = compress(newString);
        Assertions.assertTrue(expectedString.equals(actualString));
    }

    @Test
    public void singleCharStringTest(){
        final String newString = "b";
        final String expectedString = "b";

        String actualString = compress(newString);
        Assertions.assertTrue(expectedString.equals(actualString));
    }

    @Test
    public void emptyStringTest(){
        final String newString = "";
        final String expectedString = "";

        String actualString = compress(newString);
        Assertions.assertTrue(expectedString.equals(actualString));
    }

    @Test
    public void uniqueCharacterStringTest(){
        final String newString = "abc";
        final String expectedString = "a1b1c1";

        String actualString = compress(newString);
        Assertions.assertTrue(expectedString.equals(actualString));
    }
}
