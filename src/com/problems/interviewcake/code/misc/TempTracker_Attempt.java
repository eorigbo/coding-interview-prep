package com.problems.interviewcake.code.misc;

public class TempTracker_Attempt{
    //mode
    private int[] occurrences = new int[111];
    private int mode;
    private int maxOccurrence;

    //mean
    private int totalSum;
    private int totalEntries;
    private double mean;

    //min & mode
    private int minTemp = Integer.MAX_VALUE;
    private int maxTemp = Integer.MIN_VALUE;

    public void insert(int temp){
        //mode
        occurrences[temp]++;
        if(occurrences[temp] > maxOccurrence){
            mode = temp;
            maxOccurrence = occurrences[temp];
        }
        //mean
        totalSum += temp;
        totalEntries++;
        mean = (double) totalSum/totalEntries;

        //min and max
        maxTemp = Math.max(temp, maxTemp);
        minTemp = Math.min(temp, minTemp);
    }

    public int getMode(){ return mode;}

    public double getMean(){ return mean;}

    public int getMax(){ return maxTemp;}

    public int getMin(){ return minTemp;}


}
