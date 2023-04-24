package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pages_Tooltip extends DriverClass_parent
{
   static public void tooltip_Verify(String Expected_Tooltip)
    {

        WebElement tooltip=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']"));
        String actual_Tooltip=tooltip.getAttribute("title");
        System.out.println("actual_Tooltip string is "+ actual_Tooltip );
        String tooltip_text=tooltip.getText();
        System.out.println("tooltip_text is "+ tooltip_text );
        if(actual_Tooltip.equalsIgnoreCase(Expected_Tooltip))
        {
            System.out.println("Verifying Tooltip Testcase passed");
        }
        else
            System.out.println("Verifying Tooltip Testcase failed");

    }
}
