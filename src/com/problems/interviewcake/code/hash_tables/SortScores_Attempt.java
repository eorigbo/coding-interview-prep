package com.problems.interviewcake.code.hash_tables;

public class SortScores_Attempt{
        public static int[] sortScores(int[] unsortedScores, int highestPossibleScore){

            //initialize score counting array and count scores
            int[] scoreCounts = new int[highestPossibleScore + 1];
            for(int score: unsortedScores){
                scoreCounts[score]++;
            }

            //initialize sortedScores array and sortedScoreIndex
            int[] sortedScores = new int[unsortedScores.length];
            int sortedScoreIndex = 0;

            //loop through score counting array and populate sorted scores
            for(int i = scoreCounts.length - 1; i >= 0; i--){
                int scoreCount = scoreCounts[i];
                for(int occurrence = 0; occurrence < scoreCount; occurrence++){
                    sortedScores[sortedScoreIndex] = i;
                    sortedScoreIndex++;
                }
            }
            return sortedScores;
        }

}

