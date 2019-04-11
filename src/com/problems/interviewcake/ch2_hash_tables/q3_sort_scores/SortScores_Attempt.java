package com.problems.interviewcake.ch2_hash_tables.q3_sort_scores;

public class SortScores_Attempt{
    public static int[] sortScores(int[] scores, int highestValue){

        //create an array from 0 to highestValue
        int[] scoreCounts = new int[highestValue + 1];

        //loop through scores and increment created array values where there is a match
        for(int score: scores)scoreCounts[score]++;

        //create new array of sortedScores and initialize sortedIdx
        int[] sortedScores = new int[scores.length];
        int sortedIdx = 0;

        //loop in reverse order from highestValue and get the occurrence for each score
        for(int score = highestValue; score >= 0; score--){
            int scoreCount = scoreCounts[score];
            for(int i = 0; i < scoreCount; i++){
                sortedScores[sortedIdx] = score;
                sortedIdx++;
            }
        }

        //return array outside loop
        return sortedScores;
    }

}

