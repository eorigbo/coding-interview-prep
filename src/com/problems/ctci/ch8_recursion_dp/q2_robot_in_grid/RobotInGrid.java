package com.problems.ctci.ch8_recursion_dp.q2_robot_in_grid;
import com.problems.ctci.AssortedMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RobotInGrid {

    public static ArrayList<Point> getPath(boolean[][] maze) {
        if (maze == null || maze.length == 0) return null;
        ArrayList<Point> path = new ArrayList<>();
        HashSet<Point> failedPoints = new HashSet<>();
        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
            return path;
        }
        return null;
    }

    public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
        /* If out of bounds or row value is false, return.*/
        if (col < 0 || row < 0 || !maze[row][col]) return false;

        Point point = new Point(row, col);

        /* If we've already visited this cell, return.
        * We override the hashCode method, so the
        * contains method can compare correctly*/
        if (failedPoints.contains(point)) { return false; }

        boolean isAtOrigin = (row == 0) && (col == 0);

        /* If there's a path from the start to my current location, add my location.*/
        if (isAtOrigin || getPath(maze, row, col - 1, path, failedPoints) || getPath(maze, row - 1, col, path, failedPoints)) {
            path.add(point);
            return true;
        }

        failedPoints.add(point); // Cache result
        return false;
    }

}
