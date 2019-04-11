package com.problems.interviewcake.ch1_arrays.q6_sub_array_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SubarraySumTest {

    @Test
    public void sumNotExistsTest(){
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 97;

        boolean expectedResult = false;
        boolean actualResult = SubarraySum_Attempt.subArraySum(arr,sum);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumExistsTest(){
        int arr[] = {15, 2, 4, 7, 9, 5, 10, 13};
        int sum = 25;

        boolean expectedResult = true;
        boolean actualResult = SubarraySum_Attempt.subArraySum(arr,sum);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
