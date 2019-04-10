package com.problems.ctci.ch8_recursion_dp.q5_recursive_multiply;

import static java.lang.Math.abs;

public class IterativeMultiplyAttempt {
    public static int multiply(int firstInt, int secondInt){
        if(firstInt == 0 || secondInt == 0) return 0;

        int masterInt = Math.abs(firstInt) < Math.abs(secondInt) ? firstInt : secondInt;
        int slaveInt = Math.abs(secondInt) > Math.abs(firstInt) ? secondInt: firstInt;

        int product = 0;

        if(masterInt < 0){
            masterInt = - masterInt;
            for(int i = 0; i < masterInt; i++) product += slaveInt;
            return -product;
        }

        for(int i = 0; i < masterInt; i++) product += slaveInt;
        return product;
    }
}
