package com.problems.interviewcake.ch3_greedy.q2_highest_product_3_ints;

public class HighestProduct3Ints_Attempt {

    public static int highestProduct3Ints(int[] arr){
        if(arr.length < 3) throw new IllegalArgumentException("At least 3 ints are required in array.");

        int highProd3 = arr[0] * arr[1] * arr[2];
        int highProd2 = arr[0] * arr[1];
        int lowProd2 = arr[0] * arr[1];
        int high = Math.max(arr[0], arr[1]);
        int low = Math.min(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++){
            highProd3 = Math.max(highProd3, Math.max(arr[i] * highProd2, arr[i] * lowProd2));
            highProd2 = Math.max(highProd2, Math.max(arr[i] * high, arr[i] * low));
            lowProd2 = Math.min(lowProd2, Math.min(arr[i] * high, arr[i] * low));
            high = Math.max(high, arr[i]);
            low = Math.min(low, arr[i]);
        }
        return highProd3;
    }

}
