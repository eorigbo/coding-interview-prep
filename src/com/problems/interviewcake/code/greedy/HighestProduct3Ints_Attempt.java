package com.problems.interviewcake.code.greedy;

public class HighestProduct3Ints_Attempt {

    public static int highestProduct3Ints(int[] theArray){

        if(theArray.length < 3) throw new IllegalArgumentException("The array must have at least 3 integers.");

        int highestProd3 = theArray[0] * theArray[1] * theArray[2];
        int highestProd2 = theArray[0] * theArray[1];
        int lowestProd2 = theArray[0] * theArray[1];
        int highest = Math.max(theArray[0], theArray[1]);
        int lowest = Math.min(theArray[0], theArray[1]);

        for(int i = 2; i < theArray.length; i++){
            int currInt = theArray[i];

            highestProd3 = Math.max(Math.max(highestProd3,
                    highestProd2 * currInt),
                    lowestProd2 * currInt);

            highestProd2 = Math.max(Math.max(highestProd2,
                    highest * currInt),
                    lowest * currInt);

            lowestProd2 = Math.min(Math.min(lowestProd2,
                    highest * currInt),
                    lowest * currInt);

            highest = Math.max(highest,currInt);

            lowest = Math.min(lowest, currInt);

        }

        return highestProd3;
    }

}
