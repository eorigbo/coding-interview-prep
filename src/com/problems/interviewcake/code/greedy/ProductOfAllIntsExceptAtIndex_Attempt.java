package com.problems.interviewcake.code.greedy;

public class ProductOfAllIntsExceptAtIndex_Attempt {

    public static int[] getProducts(int[] arr){
        if(arr.length < 2) throw new IllegalArgumentException("At least 2 elements are needed in array.");

        int[] prodAllExc = new int[arr.length];

        int prod = 1;

        for(int i = 0; i < prodAllExc.length; i++){
            prodAllExc[i] = prod;
            prod *= arr[i];
        }

        prod = 1;

        for(int i = prodAllExc.length - 1; i >= 0; i--){
            prodAllExc[i] *= prod;
            prod *= arr[i];
        }

        return prodAllExc;
    }

}
