package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation;
import static org.junit.jupiter.api.Assertions.*;

public class StringHasPalindromePermutationTest {

    @Test
    public void stringWithPalindromePermutationTest(){
        String theString = "toppot";

        boolean expectedResult = true;
        boolean actualResult = stringHasPalindromePermutation(theString);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void stringWithoutPalindromePermutationTest(){
        String theString = "civgic";

        boolean expectedResult = false;
        boolean actualResult = stringHasPalindromePermutation(theString);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void permutationWithOddNumberOfCharsTest() {
        final boolean result = stringHasPalindromePermutation("aabcbcd");
        assertTrue(result);
    }

    @Test
    public void permutationWithEvenNumberOfCharsTest() {
        final boolean result = stringHasPalindromePermutation("aabccbdd");
        assertTrue(result);
    }

    @Test
    public void noPermutationWithOddNumberOfChars() {
        final boolean result = stringHasPalindromePermutation("aabcd");
        assertFalse(result);
    }

    @Test
    public void noPermutationWithEvenNumberOfCharsTest() {
        final boolean result = stringHasPalindromePermutation("aabbcd");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = stringHasPalindromePermutation("");
        assertTrue(result);
    }

    @Test
    public void oneCharacterStringTest() {
        final boolean result = stringHasPalindromePermutation("a");
        assertTrue(result);
    }
}
