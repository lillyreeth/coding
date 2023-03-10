package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesEx {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.w3schools.com");
//		driver.findElement((By.xpath("//*[@id=\"accept-choices\"]"))).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"navbtn_exercises\"]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.linkText("Courses")).click();
//		
		//Thread.sleep(4000);
		driver.get("https://www.facebook.com");
		//driver.findElement(By.id("u_0_e_8E")).click();
		//driver.findElement(By.xpath("//*[@id=\"u_0_e_rA\"]")).click();
		//driver.findElement(By.linkText("Allow essential and optional cookies")).click();
		//driver.findElement(By.className("_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Allow essential and optional cookies')]")).click();
		//driver.quit();
		
	
		//id="u_0_e_8E"
		//_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy
		//_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy
		

	}

}
