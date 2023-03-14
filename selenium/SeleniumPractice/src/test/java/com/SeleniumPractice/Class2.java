package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {
 
	
	public static void main(String args[]) throws InterruptedException
	{
		
		
     	 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
	      Thread.sleep(5000);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 
		driver.close();
		
	}
}
