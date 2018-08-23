package com.problems.interviewcake.code.scratch_pad;

import com.problems.interviewcake.code.trees_graphs.GraphNode;

import java.util.HashSet;
import java.util.Set;

public class ValidateColoringOptions {
    public static boolean getUsedColorsCheck(GraphNode[] graph) {
        final Set<String> usedColorsIC = new HashSet<>();
        final Set<String> usedColorsEO = new HashSet<>();

        for (final GraphNode node : graph) {
            final Set<GraphNode> neighbors = node.getNeighbors();
            usedColorsEO.add(node.getColor());

            for (final GraphNode neighbor : neighbors) {
                usedColorsIC.add(neighbor.getColor());
            }
        }
        return usedColorsIC.size() == usedColorsEO.size();
    }
}
