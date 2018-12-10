package com.problems.ctci.ch8_recursion_dp.q2_robot_in_grid;

public class Point {
    public int row, column;
    public Point(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + column + ")";
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

}
