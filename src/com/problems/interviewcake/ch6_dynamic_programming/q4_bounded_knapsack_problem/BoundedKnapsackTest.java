package com.problems.interviewcake.ch6_dynamic_programming.q4_bounded_knapsack_problem;

import com.problems.interviewcake.ch6_dynamic_programming.q5_unbounded_knapsack_problem.ItemType;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.ch6_dynamic_programming.q4_bounded_knapsack_problem.BoundedKnapsack_Attempt.getMaxValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundedKnapsackTest {

    @Test
    public void smallSack(){
        final ItemType[] items = {new ItemType(1,1),
            new ItemType(3,4),
            new ItemType(4,5),
            new ItemType(5,7)};

        int wt = 7;
        final int expectedValue = 9;
        final int actualValue = getMaxValue(items,wt);

        assertEquals(expectedValue,actualValue);

    }
}
