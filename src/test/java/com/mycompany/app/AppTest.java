package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void LogInAndLogOut()
    {
        assertTrue( true );
        //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        options.setHeadless(true);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



        final String userName = "mojtestowyuzytkownik@test.pl";
        final String password = "test1";

        driver.get("http://automationpractice.com/");

        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
        signInButton.click();


        WebElement login_input = driver.findElement(By.xpath("//*[@id='email']"));
        login_input.sendKeys(userName);

        WebElement password_input = driver.findElement(By.cssSelector("#passwd"));
        password_input.sendKeys(password);

        WebElement sign_in_button = driver.findElement(By.name("SubmitLogin"));
        sign_in_button.click();

        WebElement cart = driver.findElement(By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > b"));
        String trueCart = "Cart";
        Assert.assertEquals(cart.getText(), trueCart);
        System.out.println("\nTest wykazał, że wskazane pole nazywa się: " + cart.getText() + " i jest zgodne z nazwą, która miała się wyświetlić czyli: " + trueCart + "\n");

        WebElement log_out_button = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
        log_out_button.click();
        driver.quit();
        }
}
