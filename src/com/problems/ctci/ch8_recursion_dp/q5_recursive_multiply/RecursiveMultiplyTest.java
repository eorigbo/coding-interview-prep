package com.problems.ctci.ch8_recursion_dp.q5_recursive_multiply;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch8_recursion_dp.q5_recursive_multiply.IterativeMultiply.multiply;

public class RecursiveMultiplyTest {
    @Test
    public void twoPositiveIntsTest(){
        int firstInt = 5;
        int secondInt = 4;

        int expectedProduct = 20;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void twoNegativeIntsTest(){
        int firstInt = -2;
        int secondInt = -7;

        int expectedProduct = 14;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void secondIntNegativeTest(){
        int firstInt = 6;
        int secondInt = -4;

        int expectedProduct = -24;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void onePositiveOneNegativeIntTest(){
        int firstInt = -3;
        int secondInt = 9;

        int expectedProduct = -27;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void oneAndNegativeOneTest(){
        int firstInt = -1;
        int secondInt = 1;

        int expectedProduct = -1;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void secondIntZeroTest(){
        int firstInt = -3;
        int secondInt = 0;

        int expectedProduct = 0;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void firstIntZeroTest(){
        int firstInt = 0;
        int secondInt = 18;

        int expectedProduct = 0;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void twoZeroesTest(){
        int firstInt = 0;
        int secondInt = 0;

        int expectedProduct = 0;
        int actualProduct = multiply(firstInt, secondInt);

        Assertions.assertEquals(expectedProduct, actualProduct);
    }
}
