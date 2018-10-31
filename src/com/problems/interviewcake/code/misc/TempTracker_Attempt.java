package com.problems.interviewcake.code.misc;

public class TempTracker_Attempt{
    //min, max
    private int minTemp = Integer.MAX_VALUE, maxTemp = Integer.MIN_VALUE;

    //mean
    private int totalTemps, sumTemps;
    private double mean;

    //mode
    private int[] tempCounts = new int[101];
    private int maxOccurrence = 0, mode = 0;

    public void insert(int temp){
        minTemp = Math.min(temp, minTemp);
        maxTemp = Math.max(temp, maxTemp);

        totalTemps++;
        sumTemps += temp;
        mean = sumTemps/totalTemps;

        tempCounts[temp]++;
        if(tempCounts[temp] > maxOccurrence){
            maxOccurrence = tempCounts[temp];
            mode = temp;
        }
    }

    public double getMean(){
        return mean;
    }

    public int getMin(){
        return minTemp;
    }

    public int getMax(){
        return maxTemp;
    }

    public int getMode(){
        return mode;
    }


}
