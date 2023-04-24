package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pages_TextBoxes extends DriverClass_parent
{

      private WebElement searchBox;

      public void enterSearchText(String text)
      {
          WebDriverWait wait=new WebDriverWait(driver,20);
         searchBox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
//       searchBox=driver.findElement(By.xpath("//input[@placeholder='Search']"));
         searchBox.sendKeys(text);

      }

}
