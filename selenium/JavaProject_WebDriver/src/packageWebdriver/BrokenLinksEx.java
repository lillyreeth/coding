package packageWebdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinksEx {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/default.asp");
		driver.findElement(By.id("accept-choices")).click();
//		driver.get("https://www.facebook.com");
//		driver.findElement((By.xpath("//button[contains(text(),'Allow essential and optional cookies')]"))).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			// reading individual web element by index value and reading attributes of that
			// index which returns string value
			String url = links.get(i).getAttribute("href");

			if (url.startsWith("https"))

				System.out.println(url);

		}

		for (int i = 0; i < links.size(); i++) {

			// reading individual web element by index value and reading attributes of that
			// index which returns string value
			String url = links.get(i).getAttribute("href");
			if (url.startsWith("https"))
			{

			// to convert string to url we use url class(constructor)
			URL link = new URL(url);

			// to open url we use https class which connects to server and asking to open
			// that links

			HttpURLConnection http = (HttpURLConnection) link.openConnection();
			http.connect();

			int responsecode = http.getResponseCode();

			if (responsecode > 400) {
				System.out.println(url + "----> is broken link");

			} else
				System.out.println(url + "----> is valid link");
		
		}
		Thread.sleep(3000);

		driver.quit();

	}

	}
}
