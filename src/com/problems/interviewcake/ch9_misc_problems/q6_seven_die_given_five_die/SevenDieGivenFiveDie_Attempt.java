package com.problems.interviewcake.ch9_misc_problems.q6_seven_die_given_five_die;

import java.util.Random;

public class SevenDieGivenFiveDie_Attempt {
    private static int rand5(){
        Random rand = new Random();
        return rand.nextInt(5)+1;
    }

    public static int rand7(){
        while(true) {
            int roll1 = rand5();
            int roll2 = rand5();

            int outcome = ((roll1 - 1) * 5) + roll2;
            if(outcome > 21) continue;

            return (outcome % 7) + 1;
        }

    }
}
