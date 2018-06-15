package net.shipovalov.training.application;

import net.shipovalov.training.model.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SessionHelper {

    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void login(UserData userData) {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(userData.getUsername());
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(userData.getPassword());
        driver.findElement(By.cssSelector("input.button")).click();
    }

    protected void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }
}
