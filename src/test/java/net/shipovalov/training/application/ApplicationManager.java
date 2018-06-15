package net.shipovalov.training.application;

import net.shipovalov.training.model.ProjectData;
import net.shipovalov.training.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        openLoginPage("http://shipovalov.net");
        login(new UserData()
                .withUserPassword("luxoft")
                .withUserName("student"));
    }

    private void login(UserData userData) {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(userData.getUsername());
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(userData.getPassword());
        driver.findElement(By.cssSelector("input.button")).click();
        selectProject();
    }

    private void openLoginPage(final String baseUrl) {
        driver.get(baseUrl + "/login_page.php");
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

    public void openManageProjectPage() {
        driver.findElement(By.linkText("Manage Projects")).click();
    }

    public void openManagePage() {
        driver.findElement(By.linkText("Manage")).click();
    }

    public void stop() {
        logout();
        driver.quit();
    }

    private void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    private void selectProject() {
        Select select = new Select(driver.findElement(By.name("project_id")));
        select.selectByVisibleText("11122");
    }

    public boolean selectFirstProject() {
        return true;
    }
}
