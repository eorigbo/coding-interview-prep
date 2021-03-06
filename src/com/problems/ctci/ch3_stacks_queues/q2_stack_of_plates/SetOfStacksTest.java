package com.problems.ctci.ch3_stacks_queues.q2_stack_of_plates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Set;

public class SetOfStacksTest {
    @Test
    public void pushOverFlowTest(){
        SetOfStacksAttempt setOfStacks = new SetOfStacksAttempt(3);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);

        int expectedNumStacks = 2;
        int actualNumStacks = setOfStacks.getNumStacks();

        Assertions.assertEquals(expectedNumStacks, actualNumStacks);
    }

    @Test
    public void popOverFlowTest(){
        SetOfStacksAttempt setOfStacks = new SetOfStacksAttempt(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);

        int expectedNumStacks = 2;
        int actualNumStacks = setOfStacks.getNumStacks();

        Assertions.assertEquals(expectedNumStacks, actualNumStacks);

        setOfStacks.pop();
        setOfStacks.pop();

        expectedNumStacks = 1;
        actualNumStacks = setOfStacks.getNumStacks();

        Assertions.assertEquals(expectedNumStacks, actualNumStacks);
    }

    @Test
    public void popEmptyStackTest(){
        SetOfStacksAttempt setOfStacks = new SetOfStacksAttempt(2);
        Assertions.assertThrows(EmptyStackException.class,()->{
            setOfStacks.pop();
        });
    }

    @Test
    public void peekTest(){
        SetOfStacksAttempt setOfStacks = new SetOfStacksAttempt(2);
        setOfStacks.push(13);
        setOfStacks.push(4);

        int expectedResult = 4;
        int actualResult = setOfStacks.peek();

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void peekEmptyStackTest(){
        SetOfStacksAttempt setOfStacks = new SetOfStacksAttempt(9);
        Assertions.assertThrows(EmptyStackException.class,()->{
            setOfStacks.peek();
        });
    }
}
