package net.shipovalov.training;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateProjectTest {
    WebDriver driver;
    
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void createProjectTest() {
        driver.get("http://shipovalov.net/login_page.php");
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("luxoft");
        driver.findElement(By.cssSelector("html")).click();
        driver.findElement(By.cssSelector("input.button")).click();
        driver.findElement(By.linkText("Manage")).click();
        driver.findElement(By.linkText("Manage Projects")).click();
        driver.findElement(By.xpath("//table[3]/tbody/tr[1]/td/form/input[2]")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Championchip gor2014");
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("Yhis is tets fggfghghfgh");
        driver.findElement(By.cssSelector("input.button")).click();
        driver.findElement(By.linkText("Proceed")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
