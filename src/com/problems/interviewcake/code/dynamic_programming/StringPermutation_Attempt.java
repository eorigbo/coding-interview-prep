package com.problems.interviewcake.code.dynamic_programming;

import java.util.*;

public class StringPermutation_Attempt {

    public static Set<String> getPermutations(String inputString){
        if(inputString == null || inputString.length() < 2) return new HashSet<>(Collections.singletonList(inputString));

        String allButLast = inputString.substring(0,inputString.length()-1);
        char lastChar = inputString.charAt(inputString.length()-1);

        Set<String> permsAllButLast = getPermutations(allButLast);

        Set<String> permutations = new HashSet<>();
        for(String permAllButLast: permsAllButLast){
            for(int position = 0; position <= allButLast.length(); position++){
                String permutation = permAllButLast.substring(0,position) + lastChar
                        + permAllButLast.substring(position);
                permutations.add(permutation);
            }
        }
        return permutations;
    }
}
