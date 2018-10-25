package com.problems.interviewcake.test.misc;

import com.problems.interviewcake.code.misc.TempTracker_Attempt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TempTrackerTest {

    @Test
    public void temperatureTrackerTest(){
        final double precision = 1e-6;

        final TempTracker_Attempt t = new TempTracker_Attempt();

        t.insert(50);
        assertEquals( 50, t.getMax(), "step 1: max:");
        assertEquals( 50, t.getMin(), "step 1: min:");
        assertEquals( 50.0, t.getMean(), precision, "step 1: mean:");
        assertEquals( 50, t.getMode(), "step 3: mode:");

        t.insert(80);
        assertEquals( 80, t.getMax(), "step 2: max:");
        assertEquals( 50, t.getMin(), "step 2: min:");
        assertEquals(65.0, t.getMean(), precision, "step 2: mean:");
        assertTrue( t.getMode() == 50 || t.getMode() == 80, "step 2: mode:");

        t.insert(80);
        assertEquals(80, t.getMax(), "step 3: max:");
        assertEquals( 50, t.getMin(), "step 3: min:");
        assertEquals( 70.0, t.getMean(), precision, "step 3: mean:");
        assertEquals(80, t.getMode(), "step 3: mode:");

        t.insert(30);
        assertEquals( 80, t.getMax(), "step 4: max:");
        assertEquals( 30, t.getMin(), "step 4: min:");
        assertEquals( 60.0, t.getMean(), precision, "step 4: mean:");
        assertEquals( 80, t.getMode(), "step 4: mode:");
    }

}
