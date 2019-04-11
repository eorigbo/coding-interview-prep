package com.problems.interviewcake.ch2_hash_tables.q4_sales_pivot;

import java.util.LinkedHashMap;
import java.util.Map;

public class TotalSalesFromSalesData {
    public static int[][] totalSalesFromSalesData(int[][] salesData){
        Map<Integer,Integer> salesPivot = new LinkedHashMap<>();
        for (int i = 0; i < salesData.length; i++){
            int productId = salesData[i][0];
            int quantity = salesData[i][1];

            if (salesPivot.containsKey(productId)){
                quantity = quantity + salesPivot.get(productId);
            }
            salesPivot.put(productId,quantity);
        }

        int[][] salesByProduct = new int[salesPivot.keySet().size()][2];
        int prodSalesIndex = 0;

        for (int key: salesPivot.keySet()){
            salesByProduct[prodSalesIndex][0] = key;
            salesByProduct[prodSalesIndex][1] = salesPivot.get(key);
            prodSalesIndex++;
        }
        return  salesByProduct;
    }
}
