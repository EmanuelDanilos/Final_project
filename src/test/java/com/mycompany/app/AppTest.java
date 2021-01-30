package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void userCanLogInAndLogOut() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:/Users/mmart/Desktop/SDA Tester/Github/Selenium_AutomationPractice/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.example.com");
        WebElement element = driver.findElement(By.linkText("More information..."));
        element.click();
        driver.quit();
    }
}
