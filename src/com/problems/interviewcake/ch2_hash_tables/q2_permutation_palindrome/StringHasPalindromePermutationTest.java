package com.problems.interviewcake.ch2_hash_tables.q2_permutation_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHasPalindromePermutationTest {

    @Test
    public void stringWithPalindromePermutationTest(){
        String theString = "toppot";

        boolean expectedResult = true;
        boolean actualResult = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation(theString);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void stringWithoutPalindromePermutationTest(){
        String theString = "civgic";

        boolean expectedResult = false;
        boolean actualResult = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation(theString);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void permutationWithOddNumberOfCharsTest() {
        final boolean result = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation("aabcbcd");
        assertTrue(result);
    }

    @Test
    public void permutationWithEvenNumberOfCharsTest() {
        final boolean result = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation("aabccbdd");
        assertTrue(result);
    }

    @Test
    public void noPermutationWithOddNumberOfChars() {
        final boolean result = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation("aabcd");
        assertFalse(result);
    }

    @Test
    public void noPermutationWithEvenNumberOfCharsTest() {
        final boolean result = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation("aabbcd");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation("");
        assertTrue(result);
    }

    @Test
    public void oneCharacterStringTest() {
        final boolean result = StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation("a");
        assertTrue(result);
    }
}
