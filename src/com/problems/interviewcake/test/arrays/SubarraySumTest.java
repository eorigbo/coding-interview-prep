package com.problems.interviewcake.test.arrays;

import com.problems.interviewcake.code.arrays.SubarraySum_Attempt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.arrays.SubarraySum_Attempt.subArraySum;


public class SubarraySumTest {

    @Test
    public void sumNotExistsTest(){
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 97;

        boolean expectedResult = false;
        boolean actualResult = subArraySum(arr,sum);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumExistsTest(){
        int arr[] = {15, 2, 4, 7, 9, 5, 10, 13};
        int sum = 25;

        boolean expectedResult = true;
        boolean actualResult = subArraySum(arr,sum);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
