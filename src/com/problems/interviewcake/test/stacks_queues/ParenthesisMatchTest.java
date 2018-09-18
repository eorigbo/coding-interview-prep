package com.problems.interviewcake.test.stacks_queues;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.stacks_queues.ParenthesisMatch_Attempt.getClosingParen;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParenthesisMatchTest {
    @Test
    public void allOpenersThenClosersTest() {
        final int expected = 7;
        final int actual = getClosingParen("((((()))))", 2);
        assertEquals(expected, actual);
    }

    @Test
    public void mixedOpenersAndClosersTest() {
        final int expected = 10;
        final int actual = getClosingParen("()()((()()))", 5);
        assertEquals(expected, actual);
    }

    @Test
    public void noMatchingCloserTest() {
        assertThrows(IllegalArgumentException.class,()->{
            getClosingParen("()(()", 2);
        });

    }
}
