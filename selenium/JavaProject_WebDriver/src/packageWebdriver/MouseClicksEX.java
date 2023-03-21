package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseClicksEX {

	public static void main(String[] args) throws InterruptedException
	{
		
        System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
		WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
		WebElement e3=driver.findElement(By.xpath("//ul[contains(@class,'childmenu')]//a[contains(text(),'Dynamic')]"));
		
	    Actions act=new Actions(driver);
	    act.moveToElement(e1).moveToElement(e2).moveToElement(e3).click().build().perform();
	    
	    Thread.sleep(1000);
	    
	    driver.quit();
	    
	    
		
		
		

	}

}