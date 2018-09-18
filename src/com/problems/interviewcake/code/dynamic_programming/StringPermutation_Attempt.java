package com.problems.interviewcake.code.dynamic_programming;

import java.util.*;

public class StringPermutation_Attempt {

    public static Set<String> getPermutations(String theWord){

        if(theWord.length() < 1) return new HashSet<>(Collections.singletonList(theWord));

        String allButLast = theWord.substring(0,theWord.length()-1);
        char lastChar = theWord.charAt(theWord.length()-1);

        Set<String> permsButLast = getPermutations(allButLast);

        Set<String> permutations = new HashSet<>();

        for(String permButLast: permsButLast){
            for(int position = 0; position <= allButLast.length(); position++){
                String permutation = permButLast.substring(0, position) + lastChar
                        + permButLast.substring(position);
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}
