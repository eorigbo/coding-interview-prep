package com.problems.interviewcake.code.hash_tables;

import java.util.LinkedHashMap;
import java.util.Map;

public class TotalSalesFromSalesData_Attempt{
    public static int[][] totalSalesFromSalesData(int[][] salesData){
        //add sales data to linkedhashmap
        Map<Integer,Integer> salesPivot = new LinkedHashMap<>();

        for(int i=0; i < salesData.length; i++){
            int productID = salesData[i][0];
            int salesQuantity = salesData[i][1];

            if(salesPivot.containsKey(productID)){
                salesQuantity = salesQuantity + salesPivot.get(productID);
            }

            salesPivot.put(productID,salesQuantity);
        }

        //create new array
        int[][] salesByProduct = new int[salesPivot.keySet().size()][2];
        int currSalesIndex = 0;


        //populate new array with contents of linkedHashmap and return
        for(int key: salesPivot.keySet()){
            salesByProduct[currSalesIndex][0] = key;
            salesByProduct[currSalesIndex][1] = salesPivot.get(key);
            currSalesIndex++;
        }

        return salesByProduct;

    }

}
