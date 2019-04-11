package com.problems.interviewcake.ch9_misc_problems.q7_egg_drop;

public class EggDrop_Attempt {
    public static int quadraticSolver(int totalFloors){
        //initialize a, b, and c
        int a = 1, b = 1, c = -2 * totalFloors;

        //calculate discriminant
        double discriminant = Math.sqrt((b * b) - (4 * a * c));

        double root1 = (- b + discriminant)/(2 * a);

        double root2 = (- b - discriminant)/(2 * a);

        //calculate root1 and root2
        double result;

        if(root1 > root2){
            result = root1;
        }else{
            result = root2;
        }

        //return the larger root as an int
        return (int)Math.ceil(result);
    }

    public static int getNumDrops(int targetFloor, int totalFloors){

        //initialize firstDrop, prevFirstDrop, secondDrop and stepsCounter
        int firstDrop = 0, prevFirstDrop = 0, secondDrop = 0, stepsCounter = 0;

        //if targetfloor > totalFloors throw exception
        if(targetFloor > totalFloors) throw new IllegalArgumentException("Target floor cannot be greater than total floors.");

        //move first step and increment steps counter
        int stepsToMove = quadraticSolver(totalFloors);
        firstDrop += stepsToMove;
        stepsCounter++;

        //start while loop
        while(true){
            //if firstDrop greater than targetFloor,
            //assign prevFirstDrop to second floor and increment secondDrop and stepsCounter while less than target floor
            //outside loop break
            if(firstDrop > targetFloor){
                secondDrop = prevFirstDrop;
                while(secondDrop < targetFloor){
                    secondDrop++;
                    stepsCounter++;
                }
                break;
                //if firstDrop equal to targetFloor break
            }else if(firstDrop == targetFloor){
                break;
                //if firstDrop less than targetFloor
                //assign firstDrop to prevFirstDrop, decrement stepsToMove, and increment firstDrop by stepsToMove
            }else{
                prevFirstDrop = firstDrop;
                stepsToMove--;
                firstDrop += stepsToMove;
                stepsCounter++;
            }

        }
        return stepsCounter;

    }
}
