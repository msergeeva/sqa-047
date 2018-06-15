package net.shipovalov.training.tests;

import net.shipovalov.training.model.ProjectData;
import org.testng.annotations.Test;

public class ModificationProjectTest extends TestBase {


    @Test
    public void testProjectModification(){
        openManagePage();
        openManageProjectPage();
        selectFirstProject();
        fillProjectForm(new ProjectData("Project", "Description-2"));
        submitProjectForm();
    }


}
