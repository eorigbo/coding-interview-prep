package com.problems.interviewcake.code.hash_tables;

public class SortScores_Attempt{
    public static int[] sortScores(int[] scores, int highestPossibleScore){

        int[] scoreCounts = new int[highestPossibleScore + 1];
        for(int score:scores) scoreCounts[score]++;

        int[] sortedScores = new int[scores.length];
        int currentSortedIndex = 0;

        for(int score = highestPossibleScore; score >= 0; score--){
            int scoreCount = scoreCounts[score];
            for(int i=0; i < scoreCount; i++){
                sortedScores[currentSortedIndex] = score;
                currentSortedIndex++;
            }
        }
        return sortedScores;
    }

}

