package com.problems.interviewcake.code.trees_graphs;

import java.util.HashSet;
import java.util.Set;

public class GraphColoring_Attempt {
    public static void colorGraph(GraphNode[] graph, String[] colors){

        //loop through nodes
        for(GraphNode node: graph){
            Set<GraphNode> neighbors = node.getNeighbors();
            Set<String> illegalColors = new HashSet<>();

            //getneighbors
            for(GraphNode neighbor: neighbors){
                //check if loop exists
                if(neighbors.contains(node)) throw new IllegalArgumentException("Graph cannot be legally colored as it contains a loop.");

                //loop through neighbors and populate illegalColors set
                if(neighbor.hasColor()) illegalColors.add(neighbor.getColor());

            }

            //loop through colors and add first color not in illegalColors
            for(String color: colors){
                if(!illegalColors.contains(color)){
                    node.setColor(color);
                    break;
                }
            }

        }


    }
}
