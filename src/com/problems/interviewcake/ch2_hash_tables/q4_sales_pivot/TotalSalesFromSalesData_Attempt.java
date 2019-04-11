package com.problems.interviewcake.ch2_hash_tables.q4_sales_pivot;

import java.util.LinkedHashMap;
import java.util.Map;

public class TotalSalesFromSalesData_Attempt{
    public static int[][] totalSalesFromSalesData(int[][] salesData){

        //create linkedhashmap to pivot sales
        Map<Integer, Integer> salesPivot = new LinkedHashMap<>();

        //loop through salesData and populate salesPivot
        for(int[] sale: salesData){
            int productId = sale[0];
            int qty = sale[1];

            if(salesPivot.containsKey(productId)) qty = qty + salesPivot.get(productId);

            salesPivot.put(productId, qty);
        }

        //create aggregated salesByProduct array
        int[][] salesByProduct = new int[salesPivot.keySet().size()][2];
        int salesProdIdx = 0;

        //populate by looping through array and adding data from salesPivot
        for(int product: salesPivot.keySet()){
            salesByProduct[salesProdIdx][0] = product;
            salesByProduct[salesProdIdx][1] = salesPivot.get(product);
            salesProdIdx++;
        }

        //return the salesByProduct
        return salesByProduct;
    }

}
