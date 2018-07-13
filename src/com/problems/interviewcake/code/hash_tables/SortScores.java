package com.problems.interviewcake.code.hash_tables;

public class SortScores {
    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore){

        int[] scoreCounts = new int[highestPossibleScore + 1];

        //populate scorecounts
        for (int score: unorderedScores){
            scoreCounts[score]++;
        }

        //initialize the final sorted array
        int[] sortedScores = new int[unorderedScores.length];
        int currentSortedIndex = 0;

        //Loop through scoreCounts in descending order
        for (int score = highestPossibleScore; score >= 0; score--){
            //Find the number of times that score occurred
            int scoreCount = scoreCounts[score];

            //Add that score to sortedScores the number of times the score occurred
            for (int occurrence = 0; occurrence < scoreCount; occurrence ++){
                sortedScores[currentSortedIndex] = score;
                currentSortedIndex++;
            }
        }

        return sortedScores;

    }
}
