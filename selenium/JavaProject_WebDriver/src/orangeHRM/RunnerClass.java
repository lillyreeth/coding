package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass 
{

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
        
		WebDriver myChrome= new ChromeDriver();//(calling chrome browser---creating an object for chromeDriver class will open an instance of the browser)
		
    	//Authentication obj1=new Authentication();
		Authentication.login(myChrome);//static method---(no need to create object,we can access directly with the class name)
		
        Admin_Search obj2=new Admin_Search();//normal method(object must be created to access non static methods)
    	obj2.searchEmployee(myChrome);
		
		
		Authentication.logout(myChrome);//static method
		
		
	}

}
