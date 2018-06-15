package net.shipovalov.training.tests;

import net.shipovalov.training.model.ProjectData;
import org.testng.annotations.Test;


public class CreateProjectTest extends TestBase {


    @Test
    public void testCreateProject() {
        openManagePage();
        openManageProjectPage();
        initProjectCreation();
        fillProjectForm(new ProjectData().
                withName("Name2").
                withDescription("Same description"));
        submitProjectForm();
    }

    @Test
    public void testCreateProjectWithEmptyDescription() {
        openManagePage();
        openManageProjectPage();
        initProjectCreation();
        fillProjectForm(new ProjectData().
                withName("Name3").
                withDescription("Same description"));
        submitProjectForm();
    }


}
