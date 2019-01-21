package com.problems.ctci.ch4_trees_graphs.q7_build_order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch4_trees_graphs.q7_build_order.BuildOrderAttempt.buildOrderWrapper;

public class BuildOrderTest {

    @Test
     public void smallListTest() {
         String[] projects = {"a", "b", "c", "d", "e", "f"};
         String[][] dependencies = {
         //element 1 has to be completed before 2 can be started
         {"a", "d"},
         {"f", "b"},
         {"b", "d"},
         {"f", "a"},
         {"d", "c"}
         };
         String[] actualArray = buildOrderWrapper(projects, dependencies);
         String[] expectedArray = {"e","f","b","a","d","c"};

        Assertions.assertArrayEquals(expectedArray,actualArray);
     }

    @Test
    public void circularDependencyTest() {
        String[] projects = {"a", "b", "c"};
        String[][] dependencies = {
                {"a", "b"},
                {"b", "c"},
                {"c", "a"}
        };
        String[] actualArray = buildOrderWrapper(projects, dependencies);

        Assertions.assertNull(actualArray);
    }

    @Test
    public void largeListTest() {
        String[] projects = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[][] dependencies = {
                {"a", "b"},
                {"b", "c"},
                {"a", "c"},
                {"a", "c"},
                {"d", "e"},
                {"b", "d"},
                {"e", "f"},
                {"a", "f"},
                {"h", "i"},
                {"h", "j"},
                {"i", "j"},
                {"g", "j"}};
        String[] actualArray = buildOrderWrapper(projects, dependencies);
        String[] expectedArray = {"a","g","h","b","i","c","d","j","e","f"};

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void noDependencyTest() {
        String[] projects = {"a", "b", "c"};
        String[][] dependencies = {};
        String[] actualArray = buildOrderWrapper(projects, dependencies);
        String[] expectedArray = {"a","b","c"};

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void noProjectOrDependencyTest() {
        String[] projects = {};
        String[][] dependencies = {};
        String[] actualArray = buildOrderWrapper(projects, dependencies);

        Assertions.assertNull(actualArray);
    }

}
