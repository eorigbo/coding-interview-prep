package com.problems.ctci.ch3_stacks_queues.q1_3stacks_1array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EmptyStackException;

public class FixedMultiStackTest {
    @Test
    public void pushStack1Test() throws FullStackException {
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.push(0,2);
        fixedMultiStack.push(0,4);
        fixedMultiStack.push(0,6);

        int[] expectedResult = new int[]{2,4,6,0,0,0,0,0,0};
        int[] actualResult = fixedMultiStack.getStackValues();
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void pushStack2Test()throws FullStackException{
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.push(1,2);
        fixedMultiStack.push(1,5);
        fixedMultiStack.push(1,8);

        int[] expectedResult = new int[]{0,0,0,2,5,8,0,0,0};
        int[] actualResult = fixedMultiStack.getStackValues();
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void pushStack3Test()throws FullStackException{
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.push(2,3);
        fixedMultiStack.push(2,6);
        fixedMultiStack.push(2,9);

        int[] expectedResult = new int[]{0,0,0,0,0,0,3,6,9};
        int[] actualResult = fixedMultiStack.getStackValues();
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void validateStackNumTest()throws FullStackException{
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            fixedMultiStack.push(3,3);
        },String.format("stackNum can only be between 0 and %d.",fixedMultiStack.numStacks - 1));
    }

    @Test
    public void fullStackExceptionTest()throws FullStackException{
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.push(2,3);
        fixedMultiStack.push(2,6);
        fixedMultiStack.push(2,9);

        Assertions.assertThrows(FullStackException.class,()->{
            fixedMultiStack.push(2,12);
        });
    }

    @Test
    public void emptyStackExceptionTest(){
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        Assertions.assertThrows(EmptyStackException.class,()->{
            fixedMultiStack.pop(1);
        });
    }

    @Test
    public void popAndPushLastItemTest() throws FullStackException{
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.push(2,3);
        fixedMultiStack.push(2,6);
        fixedMultiStack.push(2,9);

        fixedMultiStack.pop(2);
        fixedMultiStack.push(2,12);

        int[] expectedResult = new int[]{0,0,0,0,0,0,3,6,12};
        int[] actualResult = fixedMultiStack.getStackValues();
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void popAndPeekTest()throws FullStackException{
        FixedMultiStack fixedMultiStack = new FixedMultiStack(3);
        fixedMultiStack.push(1,3);
        fixedMultiStack.push(1,6);
        fixedMultiStack.push(1,9);

        fixedMultiStack.pop(1);
        int actualResult = fixedMultiStack.peek(1);

        int expectedResult = 6;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
