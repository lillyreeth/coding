package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpAccountCreatedPage extends TestBase
{
    @FindBy(xpath="//b[contains(text(),'Account Created!')]")
    WebElement AccountCreated_h2;
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement continue_button;


    public SignUpAccountCreatedPage()
    {
        System.out.println("This is SignUp AccountCreated Page constructor");
        PageFactory.initElements(driver,this);
    }

    public String validate_accountCreated()
    {
       String heading= AccountCreated_h2.getText();
       return heading;

    }
    public UserHomePage continue_click()
    {

        continue_button.click();

        try{
        Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        return new UserHomePage();

    }








}
