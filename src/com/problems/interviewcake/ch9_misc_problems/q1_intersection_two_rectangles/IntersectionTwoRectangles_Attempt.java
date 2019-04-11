package com.problems.interviewcake.ch9_misc_problems.q1_intersection_two_rectangles;

public class IntersectionTwoRectangles_Attempt {

    private static class Overlap{
        int startPoint;
        int length;

        public Overlap(int startPoint, int length){
            this.startPoint = startPoint;
            this.length = length;
        }
    }

    private static Overlap getOverlap(int startPoint1, int length1, int startPoint2, int length2){
        int highestStart = Math.max(startPoint1, startPoint2);
        int lowestEnd = Math.min(startPoint1 + length1, startPoint2 + length2);

        if(lowestEnd <= highestStart) return new Overlap(0,0);

        return new Overlap(highestStart, lowestEnd - highestStart);
    }

    public static Rectangle findRectangularOverlap(Rectangle rect1, Rectangle rect2){
        //find overlap between lengths, return startpoint and length
        Overlap xOverlap = getOverlap(rect1.leftX, rect1.width, rect2.leftX, rect2.width);

        //find overlap between heights, return startpoint and length
        Overlap yOverlap = getOverlap(rect1.bottomY, rect1.height, rect2.bottomY, rect2.height);

        //if any overlap is 0 return empty rectangle
        if(xOverlap.length == 0 || yOverlap.length == 0) return new Rectangle();

        //else return new Rectangle
        return new Rectangle(xOverlap.startPoint, yOverlap.startPoint, xOverlap.length, yOverlap.length);
    }
}
