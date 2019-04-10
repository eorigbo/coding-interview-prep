package com.problems.ctci.ch8_recursion_dp.q2_robot_in_grid;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobotInGridAttempt {
    public static List<Point> getPath(boolean[][] maze){
        //if maze is null or empty return null
        if(maze == null || maze.length == 0) return null;

        //initialize path and failed points
        Set<Point> failedPoints = new HashSet<>();
        List<Point> path = new ArrayList<>();

        //if get path of the last column returns a path return the path
        if(getPath(maze, path, maze.length - 1, maze[0].length - 1, failedPoints)) return path;

        //return null
        return null;
    }

    private static boolean getPath(boolean[][] maze, List<Point> path, int row, int col, Set<Point> failedPoints){
        if(row < 0 || col < 0 || !maze[row][col]) return false;

        Point point = new Point(row, col);

        if(failedPoints.contains(point)) return false;

        boolean isAtOrigin = (row == 0 && col == 0);

        if(isAtOrigin || getPath(maze, path, row, col - 1, failedPoints) || getPath(maze, path, row - 1, col, failedPoints)){
            path.add(point);
            return true;
        }

        failedPoints.add(point);

        return false;
    }
}
