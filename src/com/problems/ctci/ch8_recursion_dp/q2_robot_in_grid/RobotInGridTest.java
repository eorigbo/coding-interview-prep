package com.problems.ctci.ch8_recursion_dp.q2_robot_in_grid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.problems.ctci.ch8_recursion_dp.q2_robot_in_grid.RobotInGrid.getPath;

public class RobotInGridTest {
    @Test
    public void smallGridAllTrueTest(){
        boolean[][] maze = {
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}
        };

        List<Point> pathList = getPath(maze);
        System.out.println(pathList.toString());
        String expectedString = "[(0, 0), (1, 0), (2, 0), (3, 0), (3, 1), (3, 2), (3, 3)]";
        String actualString = pathList.toString();

        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    public void smallGridTwoFalseTest(){
        boolean[][] maze = {
                {true, true, true, true},
                {false, true, true, true},
                {true, false, true, true},
                {true, true, true, true}
        };

        List<Point> pathList = getPath(maze);
        System.out.println(pathList.toString());
        String expectedString = "[(0, 0), (0, 1), (1, 1), (1, 2), (2, 2), (3, 2), (3, 3)]";
        String actualString = pathList.toString();

        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    public void smallGridNoPathTest(){
        boolean[][] maze = {
                {false, true, true, true},
                {false, true, true, true},
                {true, false, true, true},
                {true, true, true, true}
        };

        List<Point> pathList = getPath(maze);

        Assertions.assertNull(pathList);
    }

    @Test
    public void medGridNoPathTest(){
        boolean[][] maze = {
                {true, true, true, true, true},
                {false, false, false, true, true},
                {true, false, true, true, false},
                {true, true, true, false, true}
        };

        List<Point> pathList = getPath(maze);

        Assertions.assertNull(pathList);
    }

    @Test
    public void emptyGridTest(){
        boolean[][] maze = {};

        List<Point> pathList = getPath(maze);

        Assertions.assertNull(pathList);
    }
}
