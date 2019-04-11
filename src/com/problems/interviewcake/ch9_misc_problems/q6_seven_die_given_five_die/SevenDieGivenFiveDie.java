package com.problems.interviewcake.ch9_misc_problems.q6_seven_die_given_five_die;

import java.util.Random;

public class SevenDieGivenFiveDie {
    private static int rand5(){
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }
    public static int rand7(){
        while(true){
            int roll1 = rand5();
            int roll2 = rand5();
            System.out.println("Roll1:" + roll1);

            int result = (roll1 - 1) * 5 + (roll2 - 1);

            if(result > 21) continue;

            return result % 7 + 1;
        }
    }

    public static void main(String[] args){
        rand7();
    }
}
