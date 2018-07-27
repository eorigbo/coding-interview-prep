package com.problems.interviewcake.code.greedy;

import java.util.Random;

public class ShuffleArrayInPlace_Attempt{

    private static Random rand = new Random();

    private static int getRandom(int floor, int ceiling){
        return rand.nextInt((ceiling - floor)+1)+floor;

    }

    public static void shuffleArrayInPlace(int[] theArray){

        if(theArray.length <= 1)return;

        for(int i=0; i<theArray.length-1; i++){
            int randomIndex = getRandom(i,theArray.length-1);

            if(randomIndex != i){
                int valueAtI = theArray[i];
                theArray[i] = theArray[randomIndex];
                theArray[randomIndex] = valueAtI;
            }
        }
    }

}
