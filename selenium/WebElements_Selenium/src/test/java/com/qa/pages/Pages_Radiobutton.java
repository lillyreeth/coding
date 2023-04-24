package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pages_Radiobutton extends DriverClass_parent

{

    WebElement radiobutton;
    public void ClickRadiobutton(String location)
    {

        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        switch(location.toLowerCase())
        {
            case "newyork":
               driver.findElement(By.xpath("//label[@for='radio-1']")).click();
               break;
            case "paris":
                driver.findElement(By.xpath("//label[@for='radio-2']")).click();
                break;
            case "london":
                driver.findElement(By.xpath("//label[@for='radio-3']")).click();
                break;
            default:
                System.out.println("Invalid Location");

        }


//        if(location.equalsIgnoreCase("Newyork"))
//        {
//            radiobutton = driver.findElement(By.xpath("//label[@for='radio-1']"));
//        }
//        else if(location.equalsIgnoreCase("paris"))
//        {
//            radiobutton = driver.findElement(By.xpath("//label[@for='radio-2']"));
//        }
//        else if (location.equalsIgnoreCase("London"))
//        {
//            radiobutton = driver.findElement(By.xpath("//label[@for='radio-3']"));
//        }
//        else
//       {
//           System.out.println("Invalid location");
//       }
//        radiobutton.click();
    }
}
