package net.shipovalov.training.application;

import net.shipovalov.training.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;

    public ProjectHelper projects() {
        return getProjectHelper;
    }

    private ProjectHelper getProjectHelper;
    private SessionHelper getSessionHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        getSessionHelper = new SessionHelper(driver);
        getProjectHelper = new ProjectHelper(driver);
        openLoginPage("http://shipovalov.net");
        getSessionHelper.login(new UserData()
                .withUserPassword("luxoft")
                .withUserName("student"));
    }

    private void openLoginPage(final String baseUrl) {
        driver.get(baseUrl + "/login_page.php");
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

}
