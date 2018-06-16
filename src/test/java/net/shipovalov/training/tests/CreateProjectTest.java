package net.shipovalov.training.tests;

import net.shipovalov.training.model.ProjectData;
import org.testng.annotations.Test;


public class CreateProjectTest extends TestBase {


    @Test
    public void testCreateProject() {
        app.openManagePage();
        app.openManageProjectPage();
        app.projects().initProjectCreation();
        app.projects().fillProjectForm(new ProjectData().
                withName("Name23").
                withDescription("Same description"));
        app.projects().submitProjectForm();
    }

    @Test
    public void testCreateProjectWithEmptyDescription() {
        app.openManagePage();
        app.openManageProjectPage();
        app.projects().initProjectCreation();
        app.projects().fillProjectForm(new ProjectData().
                withName("Name3").
                withDescription("Same description"));
        app.projects().submitProjectForm();
    }


}
