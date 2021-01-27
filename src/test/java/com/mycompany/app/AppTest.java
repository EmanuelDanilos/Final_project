package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.chrome.ChromeDriver;
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

        System.setProperty("webdriver.chrome.driver","D:\\Kurs\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
