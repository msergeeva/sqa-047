package net.shipovalov.training.model;

public class ProjectData {
    private  String projectName;
    private  String projectDescription;


    public ProjectData withName(String projectName){
        this.projectName = projectName;
        return this;
    }


    public ProjectData withDescription(String description){
        this.projectDescription = description;
        return this;
    }



    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }



}
