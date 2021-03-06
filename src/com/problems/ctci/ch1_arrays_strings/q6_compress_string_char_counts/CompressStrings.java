package com.problems.ctci.ch1_arrays_strings.q6_compress_string_char_counts;

public class CompressStrings {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // If next character is different than current, append this char to result.
            // Also append if we are at the last element of the string
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
