package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","/JavaProject_WebDriver/External_Files");
		
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     // Browser commands
	     driver.get("https://www.facebook.com/");
	     System.out.println("Title is: " + (driver.getTitle()));
	     System.out.println("Current URL is: " + (driver.getCurrentUrl()));
	     
	     
	     //code to open link in a new tab
	     String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
	     driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).sendKeys(selectLinkOpeninNewTab);
	     Thread.sleep(5000);
	     
	     driver.close();
	     Thread.sleep(5000);
	     driver.quit();
	     
		
        
	}
	
}
