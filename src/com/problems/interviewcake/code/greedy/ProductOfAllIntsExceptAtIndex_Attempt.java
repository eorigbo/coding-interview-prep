package com.problems.interviewcake.code.greedy;

public class ProductOfAllIntsExceptAtIndex_Attempt {

        public static int[] getProducts(int[] theArray){
            if(theArray.length < 2){
                throw new IllegalArgumentException("The Array needs at least 2 elements.");
            }

            //create new array and populate with product after index
            int[] productExclIndex = new int[theArray.length];
            int productSoFar = 1;

            for(int i=0; i < theArray.length; i++){
                productExclIndex[i] = productSoFar;
                productSoFar *= theArray[i];
            }

            //loop through new array in reverse order and add product before index
            productSoFar = 1;
            for(int i = theArray.length - 1; i >= 0; i--){
                productExclIndex[i] *= productSoFar;
                productSoFar *= theArray[i];
            }

            //return product
            return productExclIndex;
        }

}
