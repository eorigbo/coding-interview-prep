package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.CheckSingleRiffle_Attempt.isSingleRiffle;

public class CheckSingleRiffleTest {

    @Test
    public void checkIsSingleRiffle(){
        int[] firstHalf = new int[]{2,3,5,6};
        int[] secondHalf = new int[]{7,8,9,12};

        int[] shuffleDeck = new int[]{2,3,5,6,7,8,9,12};

        boolean expectedResult = true;
        boolean actualResult = isSingleRiffle(firstHalf,secondHalf,shuffleDeck);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void checkSingleArrayElement(){
        int[] firstHalf = new int[]{2};
        int[] secondHalf = new int[]{7};

        int[] shuffleDeck = new int[]{2,7};

        boolean expectedResult = true;
        boolean actualResult = isSingleRiffle(firstHalf,secondHalf,shuffleDeck);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
