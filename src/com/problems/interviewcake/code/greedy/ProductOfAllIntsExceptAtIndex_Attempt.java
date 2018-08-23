package com.problems.interviewcake.code.greedy;

public class ProductOfAllIntsExceptAtIndex_Attempt {

    public static int[] getProducts(int[] theArray){
        if(theArray.length < 2) throw new IllegalArgumentException("not enough");

        int[] prodAllExceptIndex = new int[theArray.length];

        int prodSoFar=1;
        for(int i=0; i < theArray.length; i++){
            prodAllExceptIndex[i] = prodSoFar;
            prodSoFar *= theArray[i];
        }

        prodSoFar=1;
        for(int i=theArray.length-1; i >= 0; i--){
            prodAllExceptIndex[i] *= prodSoFar;
            prodSoFar *= theArray[i];
        }
        return prodAllExceptIndex;
    }

}
