package com.problems.ctci.ch4_trees_graphs.q7_build_order;

import java.util.ArrayList;

public class BuildOrder {
    public static String[] buildOrderWrapper(String[] projects, String[][] dependencies) {
        Project[] buildOrder = findBuildOrder(projects, dependencies);
        if (buildOrder == null) return null;
        String[] buildOrderString = projectsToStringArray(buildOrder);
        return buildOrderString;
    }

    public static Project[] findBuildOrder(String[] projects, String[][] dependencies) {
        Graph graph = buildGraph(projects, dependencies);
        return orderProjects(graph.getProjects());
    }

    public static Graph buildGraph(String[] projects, String[][] dependencies) {

        Graph graph = new Graph();
        for (String project : projects) {
            graph.addProjectToGraph(project);
        }

        for (String[] dependency : dependencies) {
            String first = dependency[0];
            String second = dependency[1];
            graph.addDependency(first, second);
        }
        return graph;
    }

    public static Project[] orderProjects(ArrayList<Project> rawProjects) {
        if(rawProjects.size() == 0) return null;

        Project[] orderedProjects = new Project[rawProjects.size()];

        /* Add “roots” to the build order first.*/
        int orderedProjIdx = addNonDependent(orderedProjects, rawProjects, 0);

        int unprocessedProjIdx = 0;
        while (unprocessedProjIdx < orderedProjects.length) {
            Project current = orderedProjects[unprocessedProjIdx];

            /* We have a circular dependency since there are no remaining
             * projects with zero dependencies. */
            if (current == null) { return null;}

            /* Remove myself as a dependency. */
            ArrayList<Project> children = current.getChildren();
            for (Project child : children) { child.decrementDependencies();}

            /* Add children that have no one depending on them. */
            orderedProjIdx = addNonDependent(orderedProjects, children, orderedProjIdx);

            unprocessedProjIdx++;
        }
        return orderedProjects;
    }

    /* A helper function to insert projects with zero dependencies
     * into the order array, starting at orderedProjIdx */
    public static int addNonDependent(Project[] orderedProjects, ArrayList<Project> rawProjects, int orderedProjIdx) {
        for (Project project : rawProjects) {
            if (project.getNumberDependencies() == 0) {
                orderedProjects[orderedProjIdx] = project;
                orderedProjIdx++;
            }
        }
        return orderedProjIdx;
    }

    public static String[] projectsToStringArray(Project[] projects) {
        String[] buildOrder = new String[projects.length];
        for (int i = 0; i < projects.length; i++) {
            buildOrder[i] = projects[i].getName();
        }
        return buildOrder;
    }
}
