package com.qa.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbExample
{
    public static void main(String[] args) throws InterruptedException {


        //System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//button[contains(text(),'Allow essential and optional cookies')]")).click();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        Select dropdownMonth = new Select(driver.findElement(By.id("month")));
        dropdownMonth.selectByIndex(4);
        Thread.sleep(2000);
        dropdownMonth.selectByValue("6");
        Thread.sleep(2000);
        dropdownMonth.selectByVisibleText("Dec");
        Thread.sleep(2000);

    }
}

