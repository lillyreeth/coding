package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDownEx {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement((By.xpath("//button[contains(text(),'Allow essential and optional cookies')]"))).click();
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
				
		//text.sendKeys("Ilford london");
		act.keyDown(text, Keys.SHIFT).sendKeys("ilford").build().perform();
		Thread.sleep(2000);
		act.keyUp(text,Keys.SHIFT).sendKeys("london").build().perform();
		
		
	 
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
