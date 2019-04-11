package com.problems.interviewcake.ch9_misc_problems.q5_five_die_given_seven_die;

import java.util.Random;

public class FiveDieGivenSevenDie_Attempt {
    private static int rand7(){
        Random rand = new Random();
        return rand.nextInt(7)+1;
    }

    public static int rand5(){
        int result = 7;
        while(result > 5){
            result = rand7();
        }
        return result;
    }
}
