package com.problems.interviewcake.ch3_greedy.q4_shuffle_in_place;

import java.util.Random;

public class ShuffleArrayInPlace {
    private static Random rand = new Random();

    private static int getRandom(int floor, int ceiling){
        return  rand.nextInt((ceiling - floor)+ 1) + floor;
    }

    public static void shuffleArrayInPlace(int[] theArray){
        if (theArray.length <= 1) return;

        for (int index2Shuffle = 0; index2Shuffle < theArray.length - 1; index2Shuffle++){
            int randomChoiceIndex = getRandom(index2Shuffle,theArray.length-1);

            if (randomChoiceIndex != index2Shuffle){
                int valueAtIndex2Shuffle = theArray[index2Shuffle];
                theArray[index2Shuffle] = theArray[randomChoiceIndex];
                theArray[randomChoiceIndex] = valueAtIndex2Shuffle;
            }
        }
    }
}
