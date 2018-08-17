package com.problems.interviewcake.test.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.ReverseCharacterArray_Attempt.reverseChars;

public class ReverseCharacterArrayTest {

    @Test
    public void testReverseCharacterArray(){

        String StrSentence = "Nanya eats";
        char[]sentence = StrSentence.toCharArray();

        String expectedArray = "stae aynaN";

        reverseChars(sentence,0,sentence.length-1);
        String actualArray = new String(sentence);

        Assertions.assertEquals(expectedArray,actualArray);
    }
}
