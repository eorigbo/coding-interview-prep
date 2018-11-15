package com.problems.ctci.ch1_arrays_strings.q2_is_string_permutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringPermutationTest {
    @Test
    public void smallStringTest(){
        final String string1 = "bake";
        final String string2 = "keba";

        boolean expected = true;
        boolean actual = StringPermutationAttempt.isPermutation(string1, string2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void noPermutationTest(){
        final String string1 = "mountain";
        final String string2 = "keba";

        boolean expected = false;
        boolean actual = StringPermutationAttempt.isPermutation(string1, string2);

        Assertions.assertEquals(expected, actual);
    }
}
