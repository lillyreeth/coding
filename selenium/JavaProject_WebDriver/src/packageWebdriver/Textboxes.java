package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("lillyreeth.sali@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("access125");
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("email")).getAttribute("type"));
		Thread.sleep(2000);
		driver.quit();
		 
		
		
		
		

	}

}
