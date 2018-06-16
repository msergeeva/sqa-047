package net.shipovalov.training.tests;

import net.shipovalov.training.model.ProjectData;
import org.testng.annotations.Test;

public class ModificationProjectTest extends TestBase {


    @Test
    public void testProjectModification(){
        app.openManagePage();
        app.openManageProjectPage();
        app.selectFirstProject();
        app.fillProjectForm(new ProjectData().withDescription("").withName(""));
        app.submitProjectForm();
    }


}
