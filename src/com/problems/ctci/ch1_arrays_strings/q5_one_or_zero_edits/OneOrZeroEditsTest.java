package com.problems.ctci.ch1_arrays_strings.q5_one_or_zero_edits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch1_arrays_strings.q5_one_or_zero_edits.OneOrZeroEditsAttempt.hasOneOrZeroEdits;

public class OneOrZeroEditsTest {
    @Test
    public void oneEdit(){
        final String inputString = "pike";
        final String modifiedString = "poke";

        boolean expectedResult = true;
        boolean actualResult = hasOneOrZeroEdits(inputString, modifiedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oneInsert(){
        final String inputString = "pike";
        final String modifiedString = "pikes";

        boolean expectedResult = true;
        boolean actualResult = hasOneOrZeroEdits(inputString, modifiedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oneRemove(){
        final String inputString = "pike";
        final String modifiedString = "pie";

        boolean expectedResult = true;
        boolean actualResult = hasOneOrZeroEdits(inputString, modifiedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void noEdit(){
        final String inputString = "pike";
        final String modifiedString = "pike";

        boolean expectedResult = true;
        boolean actualResult = hasOneOrZeroEdits(inputString, modifiedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oneInsertOneEdit(){
        final String inputString = "pike";
        final String modifiedString = "pokes";

        boolean expectedResult = false;
        boolean actualResult = hasOneOrZeroEdits(inputString, modifiedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oneCharOneEdit(){
        final String inputString = "e";
        final String modifiedString = "p";

        boolean expectedResult = true;
        boolean actualResult = hasOneOrZeroEdits(inputString, modifiedString);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
