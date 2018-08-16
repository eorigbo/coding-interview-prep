package com.problems.interviewcake.code.dynamic_programming;

public class Fibonacci {
    public static int fib(int n){
        if(n < 0) throw new IllegalArgumentException("Index was negative.");

        if(n == 0 || n == 1) return n;

        int prevPrev = 0;
        int prev = 1;
        int current = 0;

        for(int i = 1; i < n; i++){
            //iteration 1: current = 2nd fibonacci
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }
        return current;
    }
}
