package com.mycompany.app;

import static org.junit.Assert.assertTrue;
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
        //System.setProperty("webdriver.chrome.driver","D:\\Kurs\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.quit();
    }
}
