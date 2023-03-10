package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Authentication

{

	static public void login(WebDriver myChrome) throws InterruptedException 
	{		
	
		myChrome.manage().window().maximize();
		myChrome.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		myChrome.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		myChrome.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(1000);
        myChrome.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(2000);
	}

	static public void logout(WebDriver myChrome) throws InterruptedException 
	{
		
		myChrome.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	
	    myChrome.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    
	    Thread.sleep(2000);
        myChrome.quit();

	}

}
