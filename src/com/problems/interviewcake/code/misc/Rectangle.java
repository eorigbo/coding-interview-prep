package com.problems.interviewcake.code.misc;

public class Rectangle {
    public int leftX;
    public int bottomY;

    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle(int leftX, int bottomY, int width, int height){
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        final Rectangle r = (Rectangle) o;
        return leftX == r.leftX && bottomY == r.bottomY
                && width == r.width && height == r.height;
    }
}
