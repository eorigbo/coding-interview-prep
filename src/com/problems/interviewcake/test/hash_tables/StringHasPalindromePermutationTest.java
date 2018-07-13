package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation;

public class StringHasPalindromePermutationTest {

    @Test
    public void stringWithPalindromePermutationTest(){
        String theString = "toppot";

        boolean expectedResult = true;
        boolean actualResult = stringHasPalindromePermutation(theString);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void stringWithoutPalindromePermutationTest(){
        String theString = "civgic";

        boolean expectedResult = false;
        boolean actualResult = stringHasPalindromePermutation(theString);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
