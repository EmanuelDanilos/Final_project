package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\thepa\\Desktop\\Pax\\Selenium\\drivers2\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.example.com");
        WebElement element = driver.findElement(By.linkText("More information..."));
        element.click();
        driver.quit();
    }

    @Test
    public void userCanLogIn()
    {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\thepa\\Desktop\\Pax\\Selenium\\drivers2\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        options.setHeadless(true);

        driver.get("http://automationpractice.com/");
        WebElement signInLabelButton = driver.findElement(By.linkText("Sign in"));
        signInLabelButton.click();

        WebElement LoginInput = driver.findElement(By.id("email"));
        LoginInput.sendKeys("mojtestowyuzytkownik@test.pl");

        WebElement PasswordInput = driver.findElement(By.id("passwd"));
        PasswordInput.sendKeys("test1");

        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
        signInButton.click();

        WebElement logoutLabelButton = driver.findElement(By.linkText("Sign out"));
        logoutLabelButton.click();

        driver.quit();
    }


}
