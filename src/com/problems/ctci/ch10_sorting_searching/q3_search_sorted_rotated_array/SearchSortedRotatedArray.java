package com.problems.ctci.ch10_sorting_searching.q3_search_sorted_rotated_array;

public class SearchSortedRotatedArray {
    public static int findIndex(int[] arr, int target){
        int targetIdx = -1;

        //find the pivot of the rotated array
        int pivotIdx = findPivot(arr);

        //apply binary search
        if(target == arr[pivotIdx]) {
            targetIdx = pivotIdx;
        }else if(target > arr[pivotIdx] && target <= arr[arr.length - 1]){
            targetIdx = binarySearch(arr, target, pivotIdx, arr.length);
        }else{
            targetIdx = binarySearch(arr, target, -1, pivotIdx );
        }
        return targetIdx;
    }

    public static int findPivot(int[] arr){
        //verify that array is rotated else return 0
        if(arr[arr.length - 1] >= arr[0]) return 0;

        //initialize floor, ceiling and pivotIdx
        int floor = 0;
        int ceiling = arr.length - 1;
        int pivotIdx = -1;

        //while true
        while(true) {
            //initialize mid
            int mid = ((ceiling - floor)/2)+ floor;

            //if mid element > mid + 1 element mid + 1 is the pivot
            if(arr[mid] > arr[mid+1]){
                pivotIdx = mid + 1;
                break;
            }else{
                //else if start element > mid element make ceiling mid - 1
                if(arr[floor] > arr[mid]){
                    ceiling = mid - 1;
                //else make floor mid + 1
                }else{
                    floor = mid + 1;
                }
            }
        }
        //return mid+1;
        return pivotIdx;
    }

    public static int binarySearch(int[] arr, int target, int floorIdx, int ceilingIdx){

        while(floorIdx + 1  < ceilingIdx){
            int mid = ((ceilingIdx - floorIdx)/2) + floorIdx;

            if(arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                ceilingIdx = mid;
            }else{
                floorIdx = mid;
            }
        }
        return -1;
    }
}
