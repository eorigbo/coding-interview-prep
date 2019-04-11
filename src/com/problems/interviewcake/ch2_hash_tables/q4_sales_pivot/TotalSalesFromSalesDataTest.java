package com.problems.interviewcake.ch2_hash_tables.q4_sales_pivot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TotalSalesFromSalesDataTest {

    @Test
    public void aggregateSalesTest(){
        final int[][] sales = {{37, 10}, {41, 65}, {37, 13}};
        final int[][] expected = {{37, 23}, {41, 65}};
        final int[][] actual = TotalSalesFromSalesData_Attempt.totalSalesFromSalesData(sales);
        assertArrayEquals(expected, actual);
    }
}
