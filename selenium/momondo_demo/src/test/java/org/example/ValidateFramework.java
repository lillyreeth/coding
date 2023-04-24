package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ValidateFramework
{
    //public static void main(String[] args)

    @Test
     public void setUp()

    {

    WebDriverManager.firefoxdriver().setup();
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.momondo.co.uk");
    driver.manage().window().maximize();
    driver.quit();


    }
}
