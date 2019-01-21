package com.problems.ctci.ch4_trees_graphs.q7_build_order;

import java.util.ArrayList;
import java.util.List;

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
            String parent = dependency[0];
            String child = dependency[1];
            graph.addDependency(parent, child);
        }
        return graph;
    }

    public static Project[] orderProjects(List<Project> rawProjects) {
        if(rawProjects.size() == 0) return null;

        Project[] orderedProjects = new Project[rawProjects.size()];

        /* Add all non dependent projects to the ordered projects array, and return orderedProjIdx*/
        int orderedProjIdx = addNonDependentProjects(orderedProjects, rawProjects, 0);

        int unprocessedProjIdx = 0;
        while (unprocessedProjIdx < orderedProjects.length) {
            //grab the next project to be processed from the ordered projects array
            Project current = orderedProjects[unprocessedProjIdx];

            /* If no projects is available to process, and we haven't processed all projects,
                we have a circular dependency */
            if (current == null) { return null;}

            /* Since the current project is already done, remove it as a dependency from all its children. */
            List<Project> children = current.getChildren();
            for (Project child : children) { child.decrementDependencies();}

            /* Add children that have no one depending on them. */
            orderedProjIdx = addNonDependentProjects(orderedProjects, children, orderedProjIdx);

            unprocessedProjIdx++;
        }
        return orderedProjects;
    }

    /* A helper function to insert projects with zero dependencies
     * into the order array, starting at orderedProjIdx */
    public static int addNonDependentProjects(Project[] orderedProjects, List<Project> rawProjects, int orderedProjIdx) {
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
