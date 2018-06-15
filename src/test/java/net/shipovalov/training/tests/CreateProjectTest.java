package net.shipovalov.training.tests;

import net.shipovalov.training.model.ProjectData;
import org.testng.annotations.Test;


public class CreateProjectTest extends TestBase {


    @Test
    public void testCreateProject() {
        app.openManagePage();
        app.openManageProjectPage();
        app.initProjectCreation();
        app.fillProjectForm(new ProjectData().
                withName("Name23").
                withDescription("Same description"));
        app.submitProjectForm();
    }

    @Test
    public void testCreateProjectWithEmptyDescription() {
        app.openManagePage();
        app.openManageProjectPage();
        app.initProjectCreation();
        app.fillProjectForm(new ProjectData().
                withName("Name3").
                withDescription("Same description"));
        app.submitProjectForm();
    }


}
