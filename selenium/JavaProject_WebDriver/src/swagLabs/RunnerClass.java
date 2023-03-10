package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		WebDriver chromeObj=new ChromeDriver();
		
		Class_Authenticate obj1=new Class_Authenticate();
		obj1.login(chromeObj,"https://www.saucedemo.com");
		obj1.logout(chromeObj);
		
		
		

	}

}
