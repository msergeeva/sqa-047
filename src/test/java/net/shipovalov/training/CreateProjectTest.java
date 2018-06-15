package net.shipovalov.training;

import org.testng.annotations.Test;


public class CreateProjectTest extends TestBase{


    @Test
    public void testCreateProject() {
        openManagePage();
        openManageProjectPage();
        initProjectCreation();
        fillProjectForm(new ProjectData("Championchip gor2014", "Yhis is tets fggfghghfgh"));
        submitProjectForm();
    }

    @Test
    public void testCreateProjectWithEmptyDescription() {
        openManagePage();
        openManageProjectPage();
        initProjectCreation();
        fillProjectForm(new ProjectData("Championchip gor2014", ""));
        submitProjectForm();
    }


}
