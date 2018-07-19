package com.problems.interviewcake.test.hash_tables;

import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.hash_tables.TotalSalesFromSalesData_Attempt.totalSalesFromSalesData;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TotalSalesFromSalesDataTest {

    @Test
    public void aggregateSalesTest(){
        final int[][] sales = {{37, 10}, {41, 65}, {37, 13}};
        final int[][] expected = {{37, 23}, {41, 65}};
        final int[][] actual = totalSalesFromSalesData(sales);
        assertArrayEquals(expected, actual);
    }
}
