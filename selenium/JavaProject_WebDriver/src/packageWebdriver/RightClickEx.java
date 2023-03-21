package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) throws InterruptedException 
	{
		
		

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement e=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		act.contextClick(e).build().perform();
		WebElement e2= driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-delete']//span[contains(text(),'Delete')]"));
		Thread.sleep(2000);
		act.moveToElement(e2).click().build().perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
