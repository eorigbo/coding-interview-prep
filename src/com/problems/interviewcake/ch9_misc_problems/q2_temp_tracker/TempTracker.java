package com.problems.interviewcake.ch9_misc_problems.q2_temp_tracker;

public class TempTracker {
    //for mode
    private int[] occurrences = new int[111];
    private int  maxOccurrences;
    private int mode;

    //for mean
    private int numberOfReadings;
    private long totalSum;
    private double mean;

    //for min and max
    private int minTemp = Integer.MAX_VALUE;
    private int maxTemp = Integer.MIN_VALUE;

    public void insert(int temperature){
        //for mode
        occurrences[temperature]++;
        if(occurrences[temperature] > maxOccurrences){
            mode = temperature;
            maxOccurrences = occurrences[temperature];
        }

        //for mean
        numberOfReadings++;
        totalSum += temperature;
        mean = (double) totalSum/numberOfReadings;

        //for min and max
        minTemp = Math.min(minTemp, temperature);
        maxTemp = Math.max(maxTemp, temperature);
    }

    public int getMax(){return maxTemp;}

    public int getMin(){return minTemp;}

    public double getMean(){return mean;}

    public int getMode(){return mode;}
}
