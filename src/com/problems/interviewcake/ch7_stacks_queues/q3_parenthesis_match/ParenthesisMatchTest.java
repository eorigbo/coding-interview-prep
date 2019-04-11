package com.problems.interviewcake.ch7_stacks_queues.q3_parenthesis_match;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.ch7_stacks_queues.q3_parenthesis_match.ParenthesisMatch_Attempt.getClosingParen;
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
