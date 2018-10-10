package com.problems.interviewcake.code.misc;

public class IntersectionTwoRectangles {
    private static class RangeOverlap{
        int startPoint;
        int length;

        public RangeOverlap(int startPoint, int length){
            this.startPoint = startPoint;
            this.length = length;
        }
    }

    private static RangeOverlap findRangeOverlap(int point1, int length1, int point2, int length2){
       //if the highestStartPoint is less than the lowestEndPoint, there is an overlap
       int highestStartPoint = Math.max(point1, point2);
       int lowestEndPoint = Math.min(point1 + length1, point2 + length2);

       if(highestStartPoint >= lowestEndPoint) return new RangeOverlap(0,0);

       int overlapLength = lowestEndPoint - highestStartPoint;

       return new RangeOverlap(highestStartPoint, overlapLength);
    }

    public static Rectangle findRectangularOverlap(Rectangle rec1, Rectangle rec2){
        RangeOverlap xOverlap = findRangeOverlap(rec1.leftX, rec1.width, rec2.leftX, rec2.width);
        RangeOverlap yOverlap = findRangeOverlap(rec1.bottomY, rec1.height, rec2.bottomY, rec2.height);

        if(xOverlap.length == 0 || yOverlap.length == 0) return new Rectangle();

        return new Rectangle(xOverlap.startPoint, yOverlap.startPoint,xOverlap.length, yOverlap.length);
    }
}
