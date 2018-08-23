package com.problems.interviewcake.code.greedy;

public class HighestProduct3Ints_Attempt {

    public static int highestProduct3Ints(int[] theInts){
        if(theInts.length < 3) throw new IllegalArgumentException("At least 3 ints are needed.");

        //initialize highProd3 as first 3 prod, highProd2 and lowProd2 as first 2 prod, highest as max of first 2, lowest as min of first 2
        int highProd3 = theInts[0] * theInts[1] * theInts[2];
        int highProd2 = theInts[0] * theInts[1];
        int lowProd2 = theInts[0] * theInts[1];
        int highest = Math.max(theInts[0],theInts[1]);
        int lowest = Math.min(theInts[0],theInts[1]);

        //start index from 2 (TEST)
        for(int i=2; i < theInts.length; i++){
            highProd3 = Math.max(highProd3, Math.max(highProd2 * theInts[i],
                    lowProd2 * theInts[i]));

            highProd2 = Math.max(highProd2, Math.max(highest * theInts[i],
                    lowest * theInts[i]));

            lowProd2 = Math.min(lowProd2, Math.min(highest * theInts[i],
                    lowest * theInts[i]));

            highest = Math.max(highest, theInts[i]);

            lowest = Math.min(lowest, theInts[i]);
        }

        return highProd3;
    }

}
