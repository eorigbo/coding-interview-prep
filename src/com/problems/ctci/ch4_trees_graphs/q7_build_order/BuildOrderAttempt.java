package com.problems.ctci.ch4_trees_graphs.q7_build_order;

import java.util.List;

public class BuildOrderAttempt {
    public static String[] buildOrderWrapper(String[] projects, String[][] dependencies){
        if(projects.length == 0) return null;

        //get orderedProjects
        Project[] orderedProjects = getOrderedProjects(projects, dependencies);

        //if orderedProjects is not null, then getProjectsToStringArray and return
        if(orderedProjects != null) return projectsToString(orderedProjects);

        return null;
    }

    private static Project[] getOrderedProjects(String[] projects, String[][] dependencies){
        //build graph
        Graph projectGraph = buildGraph(projects, dependencies);

        //order projects
        Project[] orderedProjects = orderProjects(projectGraph.getProjects());

        //return ordered projects
        return orderedProjects;
    }

    private static Graph buildGraph(String[] projects, String[][] dependencies){
        if(projects.length == 0) return null;

        //add all projects to graph
        Graph projectGraph = new Graph();
        for(String project: projects) projectGraph.addProjectToGraph(project);

        //loop through dependencies and process
        for(String[] dependency: dependencies){
            String parentName = dependency[0];
            String childName = dependency[1];

            projectGraph.addDependency(parentName, childName);

        }

        //return project graph
        return projectGraph;
    }

    private static Project[] orderProjects(List<Project> projects){
        if(projects == null) return null;

        //initialize orderedProjIdx and unprocessedProjIdx and orderedProjects array
        int orderedProjIdx = 0, unprocessedProjIdx = 0;

        Project[] orderedProjects = new Project[projects.size()];

        //add non dependent projects first
        orderedProjIdx = addNonDependentProjects(projects, orderedProjects, orderedProjIdx);

        //while orderedProjIdx < projects length
        while(orderedProjIdx < orderedProjects.length){
            //get the project at unprocessedProjIdx and if null return null
            Project currProj = orderedProjects[unprocessedProjIdx];
            if(currProj == null) return null;

            //get the children of that project and decrement their dependencyCount
            List<Project> children = currProj.getChildren();

            //add non dependent projects
            for(Project child: children){
                child.decrementDependencies();
            }
            orderedProjIdx = addNonDependentProjects(children, orderedProjects, orderedProjIdx);

            //increment unprocessedProjIdx
            unprocessedProjIdx++;
        }
        //return orderedProjects array
        return orderedProjects;
    }

    private static int addNonDependentProjects(List<Project> projects, Project[] orderedProjects, int orderedProjIdx){
        for(Project project: projects){
            if(project.getNumberDependencies() == 0){
                orderedProjects[orderedProjIdx] = project;
                orderedProjIdx++;
            }
        }
        return orderedProjIdx;
    }

    private static String[] projectsToString(Project[] projects){
        if(projects != null){
            String[] projNames = new String[projects.length];
            for(int i = 0; i < projNames.length; i++){
                projNames[i] = projects[i].getName();
            }
            return projNames;
        }else{
            return null;
        }
    }
}
