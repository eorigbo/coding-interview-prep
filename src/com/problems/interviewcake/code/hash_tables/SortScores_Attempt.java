package com.problems.interviewcake.code.hash_tables;

public class SortScores_Attempt{
    public static int[] sortScores(int[] unsortedScores, int highestPossibleValue){

        //declare scoreCounts array of length highestvalue + 1
        int[] scoreCounts = new int[highestPossibleValue + 1];

        //loop through scores and increment scoreCounts in for each loop
        for(int score:unsortedScores) scoreCounts[score]++;

        //created sortedScores array and currentSortedIndex variable
        int[] sortedScores = new int[unsortedScores.length];

        int currSortedIndex = 0;

        //loop in reverse fashion and get scorecount
        for(int score = highestPossibleValue; score >= 0; score--){
            int scoreCount = scoreCounts[score];
            for(int times = 0; times < scoreCount; times++){
                sortedScores[currSortedIndex] = score;
                currSortedIndex++;
            }
        }
        return sortedScores;

    }

}

