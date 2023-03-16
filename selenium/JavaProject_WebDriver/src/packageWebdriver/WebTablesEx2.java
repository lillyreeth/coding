package packageWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTablesEx2 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// headless argument is used to run headless browser
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.getTitle());
		// driver.findElement(By.id("accept-choices")).click();

		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> all_rows = table.findElements(By.xpath("//div[@class='w3-example']//tr"));
		System.out.println(all_rows.size());

		List<WebElement> table_header_row1 = table.findElements(By.xpath("//div[@class='w3-example']//tr[1]//th"));
		for (int j = 0; j < table_header_row1.size(); j++) {
			System.out.print(table_header_row1.get(j).getText() + " ");
		}

		for (int k = 2; k <= all_rows.size(); k++) {

			List<WebElement> table_data_row = table
					.findElements(By.xpath("//div[@class='w3-example']//tr[" + k + "]//td"));
			System.out.println(" ");

			String compareString = "Laughing Bacchus Winecellars";
			if (table_data_row.get(0).getText().contains(compareString))
				for (int i = 0; i < table_data_row.size(); i++) {

					System.out.print(table_data_row.get(i).getText() + " ");
				}
		}

		driver.quit();

	}

}
