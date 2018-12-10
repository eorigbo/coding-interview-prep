package com.problems.ctci.ch8_recursion_dp.q4_power_set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.problems.ctci.ch8_recursion_dp.q4_power_set.PowerSet.getSubsets;

public class PowerSetTest {

    @Test
    public void zeroToTwoSetTest() {
        ArrayList<Integer> inputList = getInputList(0,3);//list from 0 - 2

        ArrayList<ArrayList<Integer>> actualSubsets = getSubsets(inputList);

        ArrayList<ArrayList<Integer>> expectedSubsets = getExpectedSubsetsZeroToThree();
        Assertions.assertEquals(expectedSubsets, actualSubsets);
    }

    @Test
    public void oneToTwoSetTest() {
        ArrayList<Integer> inputList = getInputList(1,3);//list from 1 - 2

        ArrayList<ArrayList<Integer>> actualSubsets = getSubsets(inputList);

        ArrayList<ArrayList<Integer>> expectedSubsets = getExpectedSubsetsOneToTwo();
        Assertions.assertEquals(expectedSubsets, actualSubsets);
    }

    @Test
    public void emptyInputListSetTest() {
        ArrayList<Integer> inputList = getInputList(0,0);//empty input list

        ArrayList<ArrayList<Integer>> actualSubsets = getSubsets(inputList);

        ArrayList<ArrayList<Integer>> expectedSubsets = new ArrayList<>();
        expectedSubsets.add(new ArrayList<>());

        Assertions.assertEquals(expectedSubsets, actualSubsets);
    }

    private ArrayList<ArrayList<Integer>> getExpectedSubsetsOneToTwo(){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        ArrayList<Integer> subset1 = new ArrayList<>();
        subsets.add(subset1);

        ArrayList<Integer> subset2 = new ArrayList<>();
        subset2.add(1);
        subsets.add(subset2);

        ArrayList<Integer> subset3 = new ArrayList<>();
        subset3.add(2);
        subsets.add(subset3);

        ArrayList<Integer> subset4 = new ArrayList<>();
        subset4.add(1);
        subset4.add(2);
        subsets.add(subset4);

        return subsets;
    }

    private ArrayList<ArrayList<Integer>> getExpectedSubsetsZeroToThree(){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        ArrayList<Integer> subset1 = new ArrayList<>();
        subsets.add(subset1);

        ArrayList<Integer> subset2 = new ArrayList<>();
        subset2.add(0);
        subsets.add(subset2);

        ArrayList<Integer> subset3 = new ArrayList<>();
        subset3.add(1);
        subsets.add(subset3);

        ArrayList<Integer> subset4 = new ArrayList<>();
        subset4.add(0);
        subset4.add(1);
        subsets.add(subset4);

        ArrayList<Integer> subset5 = new ArrayList<>();
        subset5.add(2);
        subsets.add(subset5);

        ArrayList<Integer> subset6 = new ArrayList<>();
        subset6.add(0);
        subset6.add(2);
        subsets.add(subset6);

        ArrayList<Integer> subset7 = new ArrayList<>();
        subset7.add(1);
        subset7.add(2);
        subsets.add(subset7);

        ArrayList<Integer> subset8 = new ArrayList<>();
        subset8.add(0);
        subset8.add(1);
        subset8.add(2);
        subsets.add(subset8);

        return subsets;
    }

    private ArrayList<Integer> getInputList(int start, int end){
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            inputList.add(i);
        }
        return inputList;
    }
}
