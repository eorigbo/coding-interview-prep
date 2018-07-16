package com.problems.interviewcake.test.greedy;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.greedy.SellStockOnce.getMaxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SellStockOnce {

    @Test
    public void priceGoesUpThenDownTest() {
        final int actual = getMaxProfit(new int[] {1, 5, 3, 2});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownThenUpTest() {
        final int actual = getMaxProfit(new int[] {7, 2, 8, 9});
        final int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesUpAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 6, 7, 9});
        final int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownAllDayTest() {
        final int actual = getMaxProfit(new int[] {9, 7, 4, 1});
        final int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    public void priceStaysTheSameAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 1, 1, 1});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void exceptionWithOnePriceTest() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    getMaxProfit(new int[] {5});
                },
                "Getting a profit requires at least 2 stocks");
    }

    @Test
    public void exceptionWithEmptyPricesTest() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    getMaxProfit(new int[] {});
                },
                "Getting a profit requires at least 2 stocks");
    }
}
