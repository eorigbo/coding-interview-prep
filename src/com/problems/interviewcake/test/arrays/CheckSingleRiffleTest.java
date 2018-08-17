package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.CheckSingleRiffle_Attempt.isSingleRiffle;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void bothHalvesAreTheSameLengthTest() {
        final int[] half1 = {1, 4, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 3, 4, 5, 6};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertTrue(result);
    }

    @Test
    public void halvesAreDifferentLengthsTest() {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 6, 3, 5};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertFalse(result);
    }

    @Test
    public void oneHalfIsEmptyTest() {
        final int[] half1 = {};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {2, 3, 6};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertTrue(result);
    }

    @Test
    public void shuffledDeckIsMissingCardsTest() {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 6, 3, 5};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertFalse(result);
    }

    @Test
    public void shuffledDeckHasExtraCards() {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 3, 5, 6, 8};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertFalse(result);
    }
}
