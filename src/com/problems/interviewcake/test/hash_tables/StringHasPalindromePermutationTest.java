package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.StringHasPalindromePermutation.stringHasPalindromePermutation;

public class StringHasPalindromePermutationTest {

    @Test
    public void stringWithPalindromePermutationTest(){
        String theString = "civic";

        boolean expectedResult = true;
        boolean actualResult = stringHasPalindromePermutation(theString);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void stringWithoutPalindromePermutationTest(){
        String theString = "civil";

        boolean expectedResult = false;
        boolean actualResult = stringHasPalindromePermutation(theString);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
