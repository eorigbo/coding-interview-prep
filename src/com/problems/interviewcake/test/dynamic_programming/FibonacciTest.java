package com.problems.interviewcake.test.dynamic_programming;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.dynamic_programming.Fibonacci_Attempt.fib;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    public void zerothFibonacciTest() {
        final int actual = fib(0);
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void firstFibonacciTest() {
        final int actual = fib(1);
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondFibonacciTest() {
        final int actual = fib(2);
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void thirdFibonacciTest() {
        final int actual = fib(3);
        final int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void fifthFibonacciTest() {
        final int actual = fib(5);
        final int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void tenthFibonacciTest() {
        final int actual = fib(10);
        final int expected = 55;
        assertEquals(expected, actual);
    }

    @Test
    public void negativeFibonacciTest() {
        assertThrows(IllegalArgumentException.class,()->{
            fib(-1);
        });
    }
}
