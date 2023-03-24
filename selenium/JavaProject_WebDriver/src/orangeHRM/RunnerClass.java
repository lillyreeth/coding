package orangeHRM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunnerClass 
{

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        
		WebDriver myChrome= new ChromeDriver(options);//(calling chrome browser---creating an object for chromeDriver class will open an instance of the browser)
		
    	//Authentication obj1=new Authentication();
		Authentication.login(myChrome);//static method---(no need to create object,we can access directly with the class name)
		
        Admin_Search obj2=new Admin_Search();//normal method(object must be created to access non static methods)
        obj2.searchEmployee(myChrome);

		
		
		// parameterized the method, to be able to add an emplployee (non-EXCEL calling)
    	//PIM_AddEmp.AddEmployee(myChrome,"Robert","Ander","Deol","rt567","Robert456","Enabled","Welcome@1234");
    	
		
		// With Excel calling 
		PIM_AddEmp_Excel.AddEmployeeExcel(myChrome);
		
		
		Authentication.logout(myChrome);//static method
		
		
	}

}
