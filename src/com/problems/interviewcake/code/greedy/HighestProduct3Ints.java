package com.problems.interviewcake.code.greedy;

public class HighestProduct3Ints {
    public static int highestProduct3Ints(int[] arrayOfInts){
        if(arrayOfInts.length < 3){
            throw new IllegalArgumentException("Less than 3 items!");
        }

        int highest = Math.max(arrayOfInts[0],arrayOfInts[1]);
        int lowest = Math.min(arrayOfInts[0],arrayOfInts[1]);

        int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
        int lowestProductOf2 = arrayOfInts[0] * arrayOfInts[1];

        int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

        for (int i = 2; i < arrayOfInts.length; i++){
            int currInt = arrayOfInts[i];

            highestProductOf3 = Math.max(Math.max(
                    highestProductOf3,
                    currInt * highestProductOf2),
                    currInt * lowestProductOf2);

            highestProductOf2 = Math.max(Math.max(
                    highestProductOf2,
                    currInt * highest),
                    currInt * lowest);

            lowestProductOf2 = Math.min(Math.min(
                    lowestProductOf2,
                    currInt * highest),
                    currInt * lowest);

            highest = Math.max(highest,currInt);

            lowest = Math.min(lowest,currInt);
        }

        return highestProductOf3;
    }
}
