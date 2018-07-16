package com.problems.interviewcake.code.hash_tables;

public class SortScores_Attempt{

    public static int[] sortScores(int[] unsortedScores, int highestPossibleScore){

        //initiate and populate scoreCounts array
        int[] scoreCounts = new int[highestPossibleScore+1];

        for(int score: unsortedScores){
            scoreCounts[score]++;
        }

        //initiate sortedScores array
        int[] sortedScores = new int[unsortedScores.length];
        int currentSortedIndex = 0;

        //loop through scores in descending order and populated sortedScores array
        for(int score = highestPossibleScore; score >= 0; score--){
            int scoreCount = scoreCounts[score];

            for(int occurrence = 0; occurrence < scoreCount; occurrence ++){
                sortedScores[currentSortedIndex] = score;
                currentSortedIndex++;
            }
        }
        return sortedScores;

    }
}

