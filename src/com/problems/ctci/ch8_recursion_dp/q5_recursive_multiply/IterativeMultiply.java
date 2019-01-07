package com.problems.ctci.ch8_recursion_dp.q5_recursive_multiply;

public class IterativeMultiply {
    public static int multiply(int firstInt, int secondInt){
        if(firstInt == 0 || secondInt == 0) return 0;
        int product = 0;
        if(secondInt > 0){
            for(int i = 0; i < secondInt; i++) product += firstInt;
            return product;
        }

        if(secondInt < 0){
            secondInt = -secondInt;
            for(int i= 0; i < secondInt; i++) product += firstInt;
            return -product;
        }

        return -1;
    }
}
