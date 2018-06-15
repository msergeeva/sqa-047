package net.shipovalov.training;

import org.testng.annotations.Test;

public class ModificationProjectTest extends TestBase{


    @Test
    public void testProjectModification(){
        openManagePage();
        openManageProjectPage();
        selectFirstProject();
        fillProjectForm(new ProjectData("Project", "Description-2"));
        submitProjectForm();
    }


}
