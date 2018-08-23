package com.problems.interviewcake.code.hash_tables;

import java.util.LinkedHashMap;
import java.util.Map;

public class TotalSalesFromSalesData_Attempt{
    public static int[][] totalSalesFromSalesData(int[][] salesData){

        if(salesData == null || salesData.length <= 1) return salesData;

        //create a linkedhashmap to hold the sales data pivoted by productID
        Map<Integer, Integer> pivot= new LinkedHashMap<>();

        //loop through salesData and populate hashmap
        for(int[] sale: salesData){
            int productID = sale[0];
            int qty = sale[1];

            if(pivot.containsKey(productID)) qty = qty + pivot.get(productID);

            pivot.put(productID,qty);

        }

        //create new array to hold pivoted data
        int[][] prodSales = new int[pivot.keySet().size()][2];
        int pivotIndex = 0;

        //loop through keys of hashmap and have a counter for new array. assign data to relevant fields
        for(int key: pivot.keySet()){
            prodSales[pivotIndex][0] = key;
            prodSales[pivotIndex][1] = pivot.get(key);
            pivotIndex++;
        }

        return prodSales;

    }

}
