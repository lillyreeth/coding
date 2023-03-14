package packageWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesEx {

	public static void main(String[] args)
	{
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
      
		
		
		try {
			 driver.get("https://www.w3schools.com/html/html_tables.asp");
      Thread.sleep(2000);
      driver.quit();
      }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
