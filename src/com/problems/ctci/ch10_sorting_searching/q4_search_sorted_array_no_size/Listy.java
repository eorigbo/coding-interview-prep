package com.problems.ctci.ch10_sorting_searching.q4_search_sorted_array_no_size;

public class Listy {

    int[] arr;

    public Listy(int[] arr) {
        this.arr = arr.clone();
    }

    public int elementAt(int index) {
        if (index >= arr.length) {
            return -1;
        }
        return arr[index];
    }

}
