package com.mycompany.app;

import org.junit.Assert;
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

        final String username = "mojtestowyuzytkownik@test.pl";
        final String password = "test1";

        driver.get("http://automationpractice.com");
        WebElement signInButtonHomePage = driver.findElementByLinkText("Sign in");
        signInButtonHomePage.click();

        WebElement emailInputButton = driver.findElement(By.id("email"));

        emailInputButton.sendKeys(username);

        WebElement passwordInputButton = driver.findElementById("passwd");
        passwordInputButton.sendKeys(password);

        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
        signInButton.click();

        WebElement cartButton = driver.findElementByXPath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/b");
        String expectedText = "Cart";
        String actualText = cartButton.getText();
        Assert.assertEquals(expectedText,actualText);

        WebElement logOutButton = driver.findElement(By.linkText("Sign out"));
        logOutButton.click();

        driver.quit();
    }

    @Test
    public void userCanLogIn()
    {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\thepa\\Desktop\\Pax\\Selenium\\drivers2\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        ChromeDriver driver = new ChromeDriver(options);

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
