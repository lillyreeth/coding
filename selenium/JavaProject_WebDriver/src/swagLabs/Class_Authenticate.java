package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Class_Authenticate implements Interface_Authenticate 

{

	 public void login(WebDriver chromeObj,String url) throws InterruptedException
	{
		
		 chromeObj.manage().window().maximize();
		 chromeObj.get(url);
		 chromeObj.findElement(By.id("user-name")).sendKeys("standard_user");
		 chromeObj.findElement(By.id("password")).sendKeys("secret_sauce");
		 chromeObj.findElement(By.xpath("//input[@id='login-button']")).click();
		 Thread.sleep(2000);
		
	}
	
     public void logout(WebDriver chromeObj) throws InterruptedException
	{
		chromeObj.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		chromeObj.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(2000);
		chromeObj.quit();
		
	}
	
	
}
