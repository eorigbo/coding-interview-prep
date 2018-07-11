package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.ReverseWords_Attempt.reverseWords;

public class ReverseWordsTest {

    @Test
    public void checkReverseWords() {
        // write your code here
        String StrSentence = "Nanya eats Beans";
        char[]sentence = StrSentence.toCharArray();
        reverseWords(sentence);

        String expectedSentence = "Beans eats Nanya";
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
}
