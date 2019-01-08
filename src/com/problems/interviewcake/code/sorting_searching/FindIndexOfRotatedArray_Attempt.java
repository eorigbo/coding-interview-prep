package com.problems.interviewcake.code.sorting_searching;

public class FindIndexOfRotatedArray_Attempt {

    public static int findIndexOfRotatedArray(String[] arr){
        if(arr.length < 2) throw new IllegalArgumentException("At least 2 elements are needed for rotation.");

        String firstWord = arr[0];

        if(arr[arr.length - 1].compareTo(firstWord) >= 0) return 0;

        int floor = 0;
        int ceiling = arr.length-1;
        int targetIdx = -1;

        while(true){
            //cal midpoint and compare to firstWord, if > 0 move floor to midpoint
            int mid = (ceiling - floor)/2 + floor;

            if(arr[mid].compareTo(arr[mid+1]) >= 0){
                targetIdx = mid + 1;
                break;
            }else{
                if(arr[floor].compareTo(arr[mid]) >= 0){
                    ceiling = mid - 1;
                }else{
                    floor = mid + 1;
                }
            }

        }
        return targetIdx;
    }

}
