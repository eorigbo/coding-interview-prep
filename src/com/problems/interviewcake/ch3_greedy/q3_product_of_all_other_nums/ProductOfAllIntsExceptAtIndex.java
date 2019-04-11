package com.problems.interviewcake.ch3_greedy.q3_product_of_all_other_nums;

public class ProductOfAllIntsExceptAtIndex {

    public static int[] getProducts(int[] intArray){
        if (intArray.length < 2){
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers.");
        }

        int[] productOfAllIntsExceptAtIndex = new int[intArray.length];

        int productSoFar = 1;
        for (int i=0; i < intArray.length; i++){
            productOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar *= intArray[i];
        }

        productSoFar = 1;
        for (int i = intArray.length - 1; i >= 0; i--){
            productOfAllIntsExceptAtIndex[i] *= productSoFar;
            productSoFar *= intArray[i];
        }

        return productOfAllIntsExceptAtIndex;
    }

}
