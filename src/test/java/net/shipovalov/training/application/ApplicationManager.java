package net.shipovalov.training.application;

import net.shipovalov.training.model.ProjectData;
import net.shipovalov.training.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;
    private SessionHelper getSessionHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        getSessionHelper = new SessionHelper(driver);
        openLoginPage("http://shipovalov.net");
        getSessionHelper.login(new UserData()
                .withUserPassword("luxoft")
                .withUserName("student"));
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
        getSessionHelper.logout();
        driver.quit();
    }

    public boolean selectFirstProject() {
        return true;
    }
}
