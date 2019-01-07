package com.problems.ctci.ch8_recursion_dp.q6_tower_of_hanoi;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    public static ArrayList<String> towerOfHanoi(int numDisks, char fromPole, char toPole, char auxPole){
        if(numDisks == 0) throw new IllegalArgumentException("No disks to move.");

        ArrayList<String> steps = new ArrayList<>();

        if (numDisks == 1)
        {
            steps.add("Disk 1 moved from " +  fromPole + " to " + toPole);
            return steps;
        }
        steps.addAll(towerOfHanoi(numDisks-1, fromPole, auxPole, toPole));
        steps.add("Disk " + numDisks + " moved from " +  fromPole + " to " + toPole);
        steps.addAll(towerOfHanoi(numDisks-1, auxPole, toPole, fromPole));

        return steps;
    }
}
