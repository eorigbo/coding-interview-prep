package com.problems.interviewcake.code.ch1_arrays.q2_reverse_words;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.ch1_arrays.q2_reverse_words.ReverseWords_Attempt.reverseWords;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseWordsTest {

    @Test
    public void checkReverseWords() {
        // write your code here
        String StrSentence = "Nanya  eats Beans";
        char[]sentence = StrSentence.toCharArray();
        reverseWords(sentence);

        String expectedSentence = "Beans eats  Nanya";
        String actualSentence = new String(sentence);

        Assertions.assertEquals(expectedSentence,actualSentence);

    }

    @Test
    public void checkReverseWordsSingleWord() {
        // write your code here
        String StrSentence = "Nanya";
        char[]sentence = StrSentence.toCharArray();
        reverseWords(sentence);

        String expectedSentence = "Nanya";
        String actualSentence = new String(sentence);

        Assertions.assertEquals(expectedSentence,actualSentence);

    }

    @Test
    public void oneWordTest() {
        final char[] expected = "vault".toCharArray();
        final char[] actual = "vault".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoWordsTest() {
        final char[] expected = "cake thief".toCharArray();
        final char[] actual = "thief cake".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void threeWordsTest() {
        final char[] expected = "get another one".toCharArray();
        final char[] actual = "one another get".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void multipleWordsSameLengthTest() {
        final char[] expected = "the cat ate the rat".toCharArray();
        final char[] actual = "rat the ate cat the".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void multipleWordsDifferentLengthsTest() {
        final char[] expected = "chocolate bundt cake is yummy".toCharArray();
        final char[] actual = "yummy is cake bundt chocolate".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyStringTest() {
        final char[] expected = "".toCharArray();
        final char[] actual = "".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }
}
