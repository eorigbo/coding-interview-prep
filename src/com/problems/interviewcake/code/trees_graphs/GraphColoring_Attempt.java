package com.problems.interviewcake.code.trees_graphs;

import java.util.HashSet;
import java.util.Set;

public class GraphColoring_Attempt {
    public static void colorGraph(GraphNode[] graph, String[] colors){

        //Loop through graph array and get neighbors
        for(GraphNode node: graph){
            Set<GraphNode> neighbors = node.getNeighbors();
            if(neighbors.contains(node)) throw new IllegalArgumentException("Node cannot be legally colored as it has a loop.");

            Set<String> illegalColors = new HashSet<>();

            //for each neighbor add colors for those with colors into illegalcolors set
            for(GraphNode neighbor: neighbors){
                if(neighbor.hasColor()) illegalColors.add(neighbor.getColor());
            }

            //loop through colors and apply the first legal color to the node then break;
            for(String color: colors){
                if(!illegalColors.contains(color)){
                    node.setColor(color);
                    break;
                }
            }

        }

    }
}
