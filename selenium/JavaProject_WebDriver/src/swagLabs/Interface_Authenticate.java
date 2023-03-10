package swagLabs;

import org.openqa.selenium.WebDriver;

public interface Interface_Authenticate 
{

	 public void login(WebDriver chromeObj,String url) throws InterruptedException;
	 
	 public void logout(WebDriver chromeObj) throws InterruptedException;
	
	
}
