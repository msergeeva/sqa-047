package net.shipovalov.training;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class CreateProjectTest {
    WebDriver driver;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        openLoginPage();
        login();
    }

    private void login() {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("luxoft");
        driver.findElement(By.cssSelector("input.button")).click();
        selectProject();
    }

    private void openLoginPage() {
        driver.get("http://shipovalov.net/login_page.php");
    }



    @Test
    public void createProjectTest() {
        openManagePage();
        openManageProjectPage();
        initProjectCreation();
        fillProjectForm();
        submitProjectForm();
    }









    private void submitProjectForm() {
        driver.findElement(By.cssSelector("input.button")).click();
    }

    private void fillProjectForm() {
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Championchip gor2014");
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("Yhis is tets fggfghghfgh");
    }

    private void initProjectCreation() {
        driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/form/input[2]")).click();
    }

    private void openManageProjectPage() {
        driver.findElement(By.linkText("Manage Projects")).click();
    }

    private void openManagePage() {
        driver.findElement(By.linkText("Manage")).click();
    }

    @AfterMethod
    public void tearDown() {
        logout();
        driver.quit();
    }

    private void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }



    private void selectProject(){
        Select select = new Select(driver.findElement(By.name("project_id")));
        select.selectByVisibleText("11122");
    }
}
