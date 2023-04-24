package com.qa.pages;
import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

  public class Pages_Checkboxes extends DriverClass_parent
{

    static public void click_checkboxes(String rating[])
    {
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);

        for(int i=0;i< rating.length;i++)
        {
            System.out.println(rating[i]);
            if(rating[i].equalsIgnoreCase("2 Star"))
        {
            driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
        }
        else if (rating[i].equalsIgnoreCase("3 Star"))
        {
            driver.findElement(By.xpath("//label[@for='checkbox-2']")).click();
        }
        else if (rating[i].equalsIgnoreCase("4 star"))
        {
            driver.findElement(By.xpath("//label[@for='checkbox-3']")).click();
        } else if (rating[i].equalsIgnoreCase("5 star"))
        {
            driver.findElement(By.xpath("//label[@for='checkbox-4']")).click();
        }
        else
        {
            System.out.println("No item found");
        }

        }

    }
}
