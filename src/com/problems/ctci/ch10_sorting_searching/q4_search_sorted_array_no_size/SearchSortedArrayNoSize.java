package com.problems.ctci.ch10_sorting_searching.q4_search_sorted_array_no_size;

public class SearchSortedArrayNoSize {
    public static int findIndex(Listy theList, int target){
        int index = 1;
        while (theList.elementAt(index) != -1 && theList.elementAt(index) < target) {
            index *= 2;
        }
        return binarySearch(theList, target, index / 2, index);
    }

    public static int binarySearch(Listy list, int target, int floor, int ceiling) {
        int mid;

        while (floor <= ceiling) {
            mid = ((ceiling - floor)/2) + floor;
            int middle = list.elementAt(mid);
            if (middle > target || middle == -1) {
                ceiling = mid - 1;
            } else if (middle < target) {
                floor = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
