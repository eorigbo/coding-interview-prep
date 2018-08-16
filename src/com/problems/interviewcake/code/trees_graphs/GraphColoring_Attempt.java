package com.problems.interviewcake.code.trees_graphs;

import java.util.HashSet;
import java.util.Set;

public class GraphColoring_Attempt {
    public static void colorGraph(GraphNode[] nodes, String[] colors){

        for(GraphNode node: nodes){
            Set<GraphNode> neighbors = node.getNeighbors();

            if(neighbors.contains(node))throw new IllegalArgumentException("Node with loop cannot be legally colored.");

            Set<String> illegalColors = new HashSet<>();

            for(GraphNode neighbor: neighbors){
                if(neighbor.hasColor()) illegalColors.add(neighbor.getColor());
            }

            for(String color: colors){
                if(!illegalColors.contains(color)){
                    node.setColor(color);
                    break;
                }
            }
        }
    }
}
