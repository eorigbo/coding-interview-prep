package com.problems.ctci.ch10_sorting_searching.q5_sparse_search;

public class SparseSearch {
    public static int findIndex(String[] strings, String target){
        //Initialize floor and ceiling
        int floor = 0;
        int ceiling = strings.length - 1;

        //start while loop for binary search
        while(floor <= ceiling) {
            //find mid with call to getMidIndex method
            int mid = getMidIndex(strings, floor, ceiling);

            if(mid == -1) return -1;

            //continue regular binary search
            int compare = strings[mid].compareTo(target);
            if (compare == 0) {
                return mid;
            } else if (compare > 0) {
                ceiling = mid - 1;
            } else {
                floor = mid + 1;
            }
        }
        return -1;
    }

    public static int getMidIndex(String[] strings, int floor, int ceiling){
        int mid = ((ceiling - floor)/2) + floor;

        if(strings[mid] == ""){
            int left = mid - 1;
            int right = mid + 1;

            while(true){
                if(left < floor && right > ceiling) return -1;

                if(left >= floor && strings[left] != ""){
                   return left;
                }else if(right <= ceiling && strings[right] != ""){
                    return right;
                }
                left--;
                right++;
            }
        }
        return mid;

    }
}
