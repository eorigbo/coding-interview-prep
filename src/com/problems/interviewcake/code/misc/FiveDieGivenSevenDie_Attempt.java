package com.problems.interviewcake.code.misc;

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
