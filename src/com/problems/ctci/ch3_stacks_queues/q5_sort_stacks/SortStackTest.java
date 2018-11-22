package com.problems.ctci.ch3_stacks_queues.q5_sort_stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class SortStackTest {
    @Test
    public void smallStackTest(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(2);

        int[] expected = new int[]{2,3,4,5};

        SortStackAttempt.sort(stack);
        int[] actual = stackToArray(stack);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneItemStackTest(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(4);

        int[] expected = new int[]{4};

        SortStackAttempt.sort(stack);
        int[] actual = stackToArray(stack);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyStackTest(){
        Deque<Integer> stack = new ArrayDeque<>();

        SortStackAttempt.sort(stack);

        Assertions.assertTrue(stack.isEmpty());
    }

    public int[] stackToArray(Deque<Integer> stack){
        int[] arr = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }
}

