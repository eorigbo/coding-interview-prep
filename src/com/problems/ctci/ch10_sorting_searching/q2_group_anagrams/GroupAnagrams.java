package com.problems.ctci.ch10_sorting_searching.q2_group_anagrams;

import com.problems.ctci.AssortedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {

    public static void groupAnagrams(String[] stringArray) {
        HashMap<String, ArrayList<String>> anagramMap = new HashMap<>();

        /* Group words by anagram */
        for (String string : stringArray) {
            String key = sortChars(string);
            ArrayList<String> tempStringList = new ArrayList<>();

            if(anagramMap.containsKey(key)) tempStringList = anagramMap.get(key);

            tempStringList.add(string);
            anagramMap.put(key, tempStringList);
        }

        /* Convert hash table to array */
        int index = 0;
        for (String key : anagramMap.keySet()) {
            ArrayList<String> anagramList = anagramMap.get(key);
            for (String anagram : anagramList) {
                stringArray[index] = anagram;
                index++;
            }
        }
    }

    public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

}
