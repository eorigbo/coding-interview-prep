package com.problems.interviewcake.test.dynamic_programming;

import com.problems.interviewcake.code.dynamic_programming.ItemType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.problems.interviewcake.code.dynamic_programming.BoundedKnapsack_Attempt.getMaxValue;
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
