package com.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverClass_parent
{
   static  public WebDriver driver;

   static  public void  setUp_browser(String browser, String url)
    {

        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("disable-infobars");
            options.addArguments("start-maximized");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            driver= new ChromeDriver(options);
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);


        } else if (browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        }
        else
        {
            System.out.println("Invalid Browser Name");
        }

    }

    static public void tearDown()
    {
        driver.quit();

    }

}
