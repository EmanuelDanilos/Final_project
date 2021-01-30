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
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void userCanLogIn() {
        //assertTrue( true );
        // System.setProperty("webdriver.chrome.driver", "/Applications/kurs/driver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        ChromeDriver driver = new ChromeDriver(options);

        final String username = "mojtestowyuzytkownik@test.pl";
        final String password = "test1";
        driver.get("http://automationpractice.com");

        WebElement signInButton = driver.findElementByLinkText("Sign in");
        signInButton.click();

        WebElement login_input = driver.findElementById("email");
        login_input.sendKeys(username);

        WebElement password_input = driver.findElementById("passwd");
        password_input.sendKeys(password);

        WebElement sign_in_button = driver.findElement(By.id("SubmitLogin"));
        sign_in_button.click();

        WebElement log_out_button = driver.findElement(By.linkText("Sign out"));
        log_out_button.click();


        driver.quit();
    }
}
