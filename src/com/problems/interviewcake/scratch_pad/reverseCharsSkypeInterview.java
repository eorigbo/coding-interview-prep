package com.problems.interviewcake.scratch_pad;

import java.util.Arrays;

public class reverseCharsSkypeInterview {

    private static void reverse(char[] chars) {
        int start = 0, end = chars.length-1;
        // reverse input array of characters in place
        while(start < end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
    }

    // tests
    private static String emptyStringTest() {
        final char[] actual = "".toCharArray();
        reverse(actual);
        final char[] expected = "".toCharArray();
        return Arrays.equals(expected, actual) ?  "passed!" : "failed." ;
    }

    private static String singleCharacterStringTest() {
        final char[] actual = "A".toCharArray();
        reverse(actual);
        final char[] expected = "A".toCharArray();
        return Arrays.equals(expected, actual) ?  "passed!" : "failed." ;
    }

    private static String longerStringTest() {
        final char[] actual = "ABCDE".toCharArray();
        reverse(actual);
        final char[] expected = "EDCBA".toCharArray();
        return Arrays.equals(expected, actual) ?  "passed!" : "failed." ;
    }

    public static void main(String[] args) {
        System.out.println("Running tests..");
        System.out.println(" - emptyStringTest: " + emptyStringTest());
        System.out.println(" - singleCharacterStringTest: " + singleCharacterStringTest());
        System.out.println(" - longerStringTest: " + longerStringTest());
        System.out.println("End of tests.");
    }
}
