package com.problems.ctci.ch1_arrays_strings.q3_replace_spaces;

import com.problems.ctci.ch1_arrays_strings.q1_unique_char_strings.UniqueCharStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceSpacesTest {
    @Test
    public void smallSentence(){
        final char[] word = new char[]{'m','a','n',' ','u','p','\0',' ',' '};
        final char[] expectedWord = new char[]{'m','a','n','%','2','0','u','p','\0'};
        final char[] actualWord = ReplaceSpaces.replaceSpaces(word);

        Assertions.assertArrayEquals(expectedWord, actualWord);

    }

    @Test
    public void threeSpaces(){
        final char[] word = new char[]{' ',' ',' ','\0',' ',' ',' ', ' ', ' ', ' '};
        final char[] expectedWord = new char[]{'%','2','0','%','2','0','%','2','0','\0'};
        final char[] actualWord = ReplaceSpaces.replaceSpaces(word);

        Assertions.assertArrayEquals(expectedWord, actualWord);

    }

    @Test
    public void emptyArray(){
        final char[] empty = new char[3];
        final char[] expectedWord = empty;
        final char[] actualWord = ReplaceSpaces.replaceSpaces(empty);

        Assertions.assertArrayEquals(expectedWord, actualWord);
    }
}
