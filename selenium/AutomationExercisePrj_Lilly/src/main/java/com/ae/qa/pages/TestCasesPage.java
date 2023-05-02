package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage extends TestBase
{
    @FindBy(xpath="//b[contains(text(),'Test Cases')]")
    WebElement webElementTestCasesHeading;


    public TestCasesPage(){
        System.out.println("This is WelcomePage constructor: loading welcome page web elements");
        PageFactory.initElements(driver,this);
    }

    public String getTestCasesTitle()
    {

       return driver.getTitle();

    }

    public String getTestCasesHeading()
    {
        return webElementTestCasesHeading.getText();
    }

}
