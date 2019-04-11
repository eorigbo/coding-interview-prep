package com.problems.interviewcake.ch6_dynamic_programming.q1_string_permutation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static Set<String> getPermutations(String inputString){
        //base case
        if(inputString.length() <= 1)return new HashSet<>(Collections.singletonList(inputString));

        String allCharsExceptLast = inputString.substring(0,inputString.length()-1);
        char lastChar = inputString.charAt(inputString.length() - 1);

        //recursive call: get all possible permutations for all chars except last
        Set<String> permutationsCharsButLast = getPermutations(allCharsExceptLast);

        //put the last char in all possible positions for each of the above permutations
        Set<String> permutations = new HashSet<>();
        for(String permutationCharsButLast: permutationsCharsButLast){
            for(int position = 0; position <= allCharsExceptLast.length(); position++){
                String permutation = permutationCharsButLast.substring(0,position)
                        + lastChar + permutationCharsButLast.substring(position);
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}
