package packageWebdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablesEx {

	public static void main(String[] args)
	{
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		//WebDriver driver = new ChromeDriver();
		
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
     	WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.id("accept-choices")).click();
		
		System.out.println("before table assignment");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		
		// This method getText() gives complete table data which looks ugly
		//System.out.println(table.getText());
		
		System.out.println("before list assignment");
		List <WebElement> table_header=table.findElements(By.xpath("//div[@class='w3-example']//tr[1]//th"));
		
		System.out.println("after list assignment");
		
		System.out.println(table_header.size());
		//System.out.println(table_header.get(1).getText());
		//Finding the table header row count and printing the web elements
		for(int i=0;i<table_header.size();i++)
		{
			System.out.println(table_header.get(i).getText());
		}
		
		List <WebElement> table_row1=table.findElements(By.xpath("//div[@class='w3-example']//tr[2]//td"));
		for(int i=0;i<table_row1.size();i++)
		{
		System.out.println(table_row1.get(i).getText());
		}
		
		
		try {

			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.quit();
		}
		
	}

}
