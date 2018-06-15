package net.shipovalov.training;

public class ProjectData {
    private final String projectName;
    private final String projectDescription;

    public ProjectData(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }
}
