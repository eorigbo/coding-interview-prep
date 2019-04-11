package com.problems.interviewcake.ch9_misc_problems.q7_egg_drop;

public class EggDrop {
    private static int quadraticSolver(int totalFloors){
        int a = 1, b = 1, c = -2 * totalFloors;

        int discriminant = (b * b) - (4 * a * c);

        double root1 = (- b + Math.sqrt(discriminant))/(2 * a);
        double root2 = (- b - Math.sqrt(discriminant))/(2 * a);

        double result;

        if(root1 > root2){
            result = root1;
        }else{
            result = root2;
        }

        return (int)Math.ceil(result);
    }

    public static int getNumDrops(int targetFloor, int totalFloors){
        int firstDrop = 0;
        int prevFirstDrop = 0;
        int secondDrop = 0;
        //We want to skip as few steps as possible the first time we drop the egg
        //We also want to be able to reduce the number of steps we skip by 1 until we reach the highest floor
        //A mathematical equation for this is n + (n-1) + (n-2) ... + 1 = highest floor
        //The left side of the equation is essentially summing all numbers from 1 to n, so we use the ((n*n) + n)/2 formula
        //This translates into the quadratic equation that we solve using our quadraticSolver function
        int stepsToMove = quadraticSolver(totalFloors);
        firstDrop += stepsToMove;
        int stepsCounter = 1;

        if(targetFloor > totalFloors) throw new IllegalArgumentException("Target floor is greater than total floors");

        while(true){

            // if firstDrop is greater than target (egg is broken)
            if(firstDrop == targetFloor) {
                break;
            }else if(firstDrop > targetFloor){
                //assign secondDrop to prevFirstDrop (last known drop that didn't break the egg)
                secondDrop = prevFirstDrop;
                //while secondDrop is less than target, increment and increment counter
                while(secondDrop < targetFloor){
                    secondDrop++;
                    stepsCounter++;
                }
                //Outside while loop we have reached the target so break out of parent while loop
                break;
            }else {
                //assign firstDrop to prevFirstDrop
                prevFirstDrop = firstDrop;
                //Move firstDrop by stepsToMove - 1 steps to the next step and increment steps counter
                stepsToMove--;
                firstDrop += stepsToMove;
                stepsCounter++;
            }

        }
        return stepsCounter;

    }
}
