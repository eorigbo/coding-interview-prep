package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.StringHasPalindromePermutation_Attempt.stringHasPalindromePermutation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void oneCharStringTest(){
        final String theString = "c";
        assertThrows(IllegalArgumentException.class,
                ()->{
            stringHasPalindromePermutation(theString);
        });
    }
}
