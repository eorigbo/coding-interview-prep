package com.problems.interviewcake.ch6_dynamic_programming.q1_string_permutation;

import java.util.*;

public class StringPermutation_Attempt {

    public static Set<String> getPermutations(String theString){
        if(theString.length() <= 1) return new HashSet<>(Collections.singletonList(theString));

        String allButLast = theString.substring(0,theString.length()-1); //check substring
        char lastChar = theString.charAt(theString.length()-1);

        Set<String> permsAllButLast = getPermutations(allButLast);

        Set<String> permutations = new HashSet<>();
        for(String permAllButLast: permsAllButLast){
            for(int i = 0; i <= allButLast.length(); i++){
                String permutation = permAllButLast.substring(0,i) + lastChar + permAllButLast.substring(i);
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}
