package com.problems.interviewcake.code.dynamic_programming;

public class Fibonacci_Attempt {

    public static int fib(int n){
        if(n < 0) throw new IllegalArgumentException("Wrong input");
        if(n == 0 || n == 1) return n;

        int prev = 1;
        int prevPrev = 0;
        int current = 0;

        for(int i = 1; i < n; i++){
            current = prevPrev + prev;
            prevPrev = prev;
            prev = current;
        }
        return current;
    }
}
