package com.problems.ctci.ch8_recursion_dp.q5_recursive_multiply;

public class RecursiveMultiply {

    public static int multiply(int firstInt, int secondInt) {

        /* 0 multiplied with anything gives 0 */
        if (firstInt == 0 || secondInt == 0) return 0;

        /* Add firstInt one by one */
        if (secondInt > 0) return (firstInt + multiply(firstInt, secondInt - 1));

        /* the case where y is negative */
        if (secondInt < 0) return -multiply(firstInt, -secondInt);

        return -1;
    }

}
