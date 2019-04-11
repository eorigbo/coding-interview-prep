package com.problems.interviewcake.ch6_dynamic_programming.q5_unbounded_knapsack_problem;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.ch6_dynamic_programming.q5_unbounded_knapsack_problem.UnboundedKnapsack_Attempt.getMaxValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnboundedKnapsackTest {    

    @Test
    public void oneItemTest() {
        final ItemType[] ItemTypes = {new ItemType(2, 1)};
        final int weightCapacity = 9;
        final long expected = 4;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void twoItemsTest() {
        final ItemType[] ItemTypes = {new ItemType(4, 4), new ItemType(5, 5)};
        final int weightCapacity = 9;
        final long expected = 9;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void onlyTakeLessValuableItemTest() {
        final ItemType[] ItemTypes = {new ItemType(4, 4), new ItemType(5, 5)};
        final int weightCapacity = 12;
        final long expected = 12;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void lotsOfItemsTest() {
        final ItemType[] ItemTypes = {
                new ItemType(2, 3), new ItemType(3, 6), new ItemType(5, 1),
                new ItemType(6, 1), new ItemType(7, 1), new ItemType(8, 1)
        };
        final int weightCapacity = 7;
        final long expected = 12;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void valueToWeightRatioIsNotOptimalTest() {
        final ItemType[] ItemTypes = {new ItemType(51, 52), new ItemType(50, 50)};
        final int weightCapacity = 100;
        final long expected = 100;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void zeroCapacityTest() {
        final ItemType[] ItemTypes = {new ItemType(1, 2)};
        final int weightCapacity = 0;
        final long expected = 0;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void ItemWithZeroValueAndWeightTest() {
        final ItemType[] ItemTypes = {new ItemType(0, 0), new ItemType(2, 1)};
        final int weightCapacity = 7;
        final long expected = 3;
        final long actual = getMaxValue(ItemTypes, weightCapacity);
        assertEquals(expected, actual);
    }

    @Test
    public void ItemWithNonZeroValueAndZeroWeightTest() {
        final ItemType[] ItemTypes = {new ItemType(0, 5)};
        final int weightCapacity = 5;
        assertThrows(Exception.class,()->{
            getMaxValue(ItemTypes, weightCapacity);
        });

    }

}
