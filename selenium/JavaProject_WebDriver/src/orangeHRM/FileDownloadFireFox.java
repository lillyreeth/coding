package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadFireFox {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("Webdriver.gecko.driver", "/JavaProject_WebDriver/External_Files");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Sample Text file");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
		
		
		
		

	}

}
