package com.problems.ctci.ch8_recursion_dp.q6_tower_of_hanoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.problems.ctci.ch8_recursion_dp.q6_tower_of_hanoi.TowerOfHanoi.towerOfHanoi;

public class TowerOfHanoiTest {
    @Test
    public void threeDiskTest(){
        List<String> expectedSteps = new ArrayList<String>();
        expectedSteps.add("Disk 1 moved from A to C");
        expectedSteps.add("Disk 2 moved from A to B");
        expectedSteps.add("Disk 1 moved from C to B");
        expectedSteps.add("Disk 3 moved from A to C");
        expectedSteps.add("Disk 1 moved from B to A");
        expectedSteps.add("Disk 2 moved from B to C");
        expectedSteps.add("Disk 1 moved from A to C");

        int numDisks = 3;
        List<String> actualSteps = towerOfHanoi(numDisks, 'A', 'C', 'B');

        Assertions.assertEquals(expectedSteps, actualSteps);
    }

    @Test
    public void twoDiskTest(){
        List<String> expectedSteps = new ArrayList<String>();
        expectedSteps.add("Disk 1 moved from A to B");
        expectedSteps.add("Disk 2 moved from A to C");
        expectedSteps.add("Disk 1 moved from B to C");

        int numDisks = 2;
        List<String> actualSteps = towerOfHanoi(numDisks, 'A', 'C', 'B');

        Assertions.assertEquals(expectedSteps, actualSteps);

    }

    @Test
    public void oneDiskTest(){
        List<String> expectedSteps = new ArrayList<String>();
        expectedSteps.add("Disk 1 moved from A to C");

        int numDisks = 1;
        List<String> actualSteps = towerOfHanoi(numDisks, 'A', 'C', 'B');

        Assertions.assertEquals(expectedSteps, actualSteps);
    }

    @Test
    public void noDiskTest(){
        int numDisks = 0;

        Assertions.assertThrows(IllegalArgumentException.class,()->{
            List<String> actualSteps = towerOfHanoi(numDisks, 'A', 'C', 'B');
        }, "No disks to move.");
    }
}
