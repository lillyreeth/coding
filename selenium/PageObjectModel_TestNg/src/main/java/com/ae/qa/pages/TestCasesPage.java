package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage extends TestBase
{



    public TestCasesPage()
    {
        System.out.println("This is WelcomePage constructor: loading welcome page web elements");
        PageFactory.initElements(driver,this);
    }
    public String testcases()
    {

       return driver.getTitle();

    }

}
