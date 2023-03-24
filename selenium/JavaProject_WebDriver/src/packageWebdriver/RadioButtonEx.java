package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonEx {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
        driver.findElement(By.xpath("//button[contains(text(),'Allow essential and optional cookies')]")).click();
		
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath( "//label[contains(text(),'Female')]")).click();
        Thread.sleep(2000);
        
       WebElement element= driver.findElement(By.xpath( "//label[contains(text(),'Male')]"));
       
       if(element.isSelected())
       {
    	  System.out.println("Already selected");
       }
       else
    	    element.click();
    
        
       Thread.sleep(1000);
        driver.quit();
        
        
		

	}

}
