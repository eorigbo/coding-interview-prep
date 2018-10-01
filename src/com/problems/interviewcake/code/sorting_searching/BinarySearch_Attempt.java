package com.problems.interviewcake.code.sorting_searching;

public class BinarySearch_Attempt {
    public static boolean binarySearch(int[] arr, int target){

        int floor = -1;
        int ceiling = arr.length;

        while(floor + 1 < ceiling){
            int mid = (ceiling - floor)/2 + floor;
            if (arr[mid] == target) return true;
            else if(arr[mid] > target)ceiling = mid;
            else floor = mid;
        }
        return false;
    }



}
