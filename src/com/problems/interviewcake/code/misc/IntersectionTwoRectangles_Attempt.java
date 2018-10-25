package com.problems.interviewcake.code.misc;

public class IntersectionTwoRectangles_Attempt {
    private static class RangeOverlap{
        int startPoint;
        int length;

        RangeOverlap(int startPoint, int length){
            this.startPoint = startPoint;
            this.length = length;
        }
    }

    private static RangeOverlap findOverlap(int startPoint1, int length1, int startPoint2, int length2){
        int highestStart = Math.max(startPoint1, startPoint2);
        int lowestEnd = Math.min(startPoint1 + length1, startPoint2 + length2);

        if(highestStart >= lowestEnd) return new RangeOverlap(0,0);

        int overlapLength = lowestEnd - highestStart;

        return new RangeOverlap(highestStart, overlapLength);
    }

    public static Rectangle findRectangularOverlap(Rectangle rec1, Rectangle rec2){
        RangeOverlap xOverlap = findOverlap(rec1.leftX, rec1.width, rec2.leftX, rec2.width);
        RangeOverlap yOverlap = findOverlap(rec1.bottomY, rec1.height, rec2.bottomY, rec2.height);

        if(xOverlap.length == 0 || yOverlap.length == 0) return new Rectangle();

        return new Rectangle(xOverlap.startPoint, yOverlap.startPoint, xOverlap.length, yOverlap.length);
    }
}
