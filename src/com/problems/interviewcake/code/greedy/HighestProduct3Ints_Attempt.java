package com.problems.interviewcake.code.greedy;

public class HighestProduct3Ints_Attempt {

        public static int highestProduct3Ints(int[] intArray){
            //check if array has at least 3 ints
            if(intArray.length < 3){
                throw new IllegalArgumentException("Array must have at least 3 integers");
            }

            //initialize highestProd3, highestProd2, lowestProd2, highest, lowest
            int highestProd3 = intArray[0] * intArray[1] * intArray[2];
            int highestProd2 = intArray[0] * intArray[1];
            int lowestProd2 = intArray[0] * intArray[1];
            int highest = Math.max(intArray[0],intArray[1]);
            int lowest = Math.min(intArray[0],intArray[1]);

            //loop through array starting at i = 2 and calculate all vars
            for(int i=2; i < intArray.length; i++){
                highestProd3 = Math.max(Math.max(
                        highestProd3,
                        highestProd2 * intArray[i]),
                        lowestProd2 * intArray[i]);


                highestProd2 = Math.max(Math.max(
                        highestProd2,
                        highest * intArray[i]),
                        lowest * intArray[i]);

                lowestProd2 = Math.min(Math.min(
                        lowestProd2,
                        highest * intArray[i]),
                        lowest * intArray[i]);

                highest = Math.max(highest, intArray[i]);

                lowest = Math.min(lowest,intArray[i]);
            }

            return highestProd3;
        }

}
