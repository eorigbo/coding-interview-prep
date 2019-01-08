package com.problems.ctci.ch10_sorting_searching.q2_group_anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch10_sorting_searching.q2_group_anagrams.GroupAnagrams.groupAnagrams;

public class GroupAnagramTest {
    @Test
    public void largeListTest(){
        String[] stringArray = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
        String[] expectedValue = {"duck", "cudk", "carrot", "tarroc", "banana", "ele", "eel", "lee", "apple", "papel"};
        groupAnagrams(stringArray);

        Assertions.assertArrayEquals(expectedValue, stringArray);
    }

    @Test
    public void smallListTest(){
        String[] stringArray = {"dog", "god", "ogd", "beans", "anseb", "abens", "cat", "meat", "team"};
        String[] expectedValue = {"cat", "meat", "team", "dog", "god", "ogd", "beans", "anseb", "abens"};
        groupAnagrams(stringArray);

        Assertions.assertArrayEquals(expectedValue, stringArray);
    }

    @Test
    public void noAnagramTest(){
        String[] stringArray = {"dog", "beans", "cat", "team"};
        String[] expectedValue = {"cat", "team", "dog", "beans"};
        groupAnagrams(stringArray);

        Assertions.assertArrayEquals(expectedValue, stringArray);
    }

    @Test
    public void emptyArrayTest(){
        String[] stringArray = {};
        String[] expectedValue = {};
        groupAnagrams(stringArray);

        Assertions.assertArrayEquals(expectedValue, stringArray);
    }
}
