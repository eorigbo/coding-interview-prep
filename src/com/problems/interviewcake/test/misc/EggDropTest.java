package com.problems.interviewcake.test.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.interviewcake.code.misc.EggDrop.getNumDrops;

public class EggDropTest {
    @Test
    public void highTest(){
        final int totalFloors = 100;
        final int targetFloor = 98;

        int expectedResult = 14;
        int actualResult = getNumDrops(targetFloor,totalFloors);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void highestTest(){
        final int totalFloors = 100;
        final int targetFloor = 100;

        int expectedResult = 13;
        int actualResult = getNumDrops(targetFloor,totalFloors);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void lowestTest(){
        final int totalFloors = 100;
        final int targetFloor = 1;

        int expectedResult = 2;
        int actualResult = getNumDrops(targetFloor,totalFloors);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void lowTest(){
        final int totalFloors = 100;
        final int targetFloor = 13;

        int expectedResult = 14;
        int actualResult = getNumDrops(targetFloor,totalFloors);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void firstDropOnlyTest(){
        final int totalFloors = 100;
        final int targetFloor = 39;

        int expectedResult = 3;
        int actualResult = getNumDrops(targetFloor,totalFloors);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void secondDropTest(){
        final int totalFloors = 100;
        final int targetFloor = 16;

        int expectedResult = 4;
        int actualResult = getNumDrops(targetFloor,totalFloors);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void exceptionTest(){
        final int totalFloors = 100;
        final int targetFloor = 116;

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            getNumDrops(targetFloor,totalFloors);
        });
    }
}
