package com.problems.ctci.ch8_recursion_dp.q6_tower_of_hanoi;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    /* Solve the Tower of Hanoi Problem. You have 3 rods and n disks.
    The goal is to move the entire stack of disks from one rod to another obeying the following rules:
    1. Only one disk can be moved at a time.
    2. A disk can only be moved if it is the uppermost on a stack.
    3. No disk may be placed on top of a smaller disk. */

    public static ArrayList<String> towerOfHanoi(int numDisks, char fromPole, char toPole, char auxPole){
        if(numDisks == 0) throw new IllegalArgumentException("No disks to move.");

        //This is purely for testing purposes
        //We are storing the outputted strings instead of
        //printing to console
        ArrayList<String> steps = new ArrayList<>();

        if (numDisks == 1){
            steps.add("Disk 1 moved from " +  fromPole + " to " + toPole);
            return steps;
        }
        //Source: fromPole; destination: auxPole; cache: toPole
        steps.addAll(towerOfHanoi(numDisks-1, fromPole, auxPole, toPole));

        steps.add("Disk " + numDisks + " moved from " +  fromPole + " to " + toPole);

        //Source: auxPole; destination: toPole: cache: fromPole
        steps.addAll(towerOfHanoi(numDisks-1, auxPole, toPole, fromPole));

        return steps;
    }
}
