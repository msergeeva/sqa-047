package net.shipovalov.training.application;

import net.shipovalov.training.model.ProjectData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectHelper {
    private  WebDriver driver;

    public ProjectHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void submitProjectForm() {
        driver.findElement(By.cssSelector("input.button")).click();
    }

    public void fillProjectForm(ProjectData projectData) {
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys(projectData.getProjectName());
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys(projectData.getProjectDescription());
    }

    public void initProjectCreation() {
        driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/form/input[2]")).click();
    }

    public boolean selectFirstProject() {
        return true;
    }
}
