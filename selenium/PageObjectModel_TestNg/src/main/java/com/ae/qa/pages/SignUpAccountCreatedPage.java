package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpAccountCreatedPage extends TestBase
{
    @FindBy(xpath="//b[contains(text(),'Account Created!')]")
    WebElement webElementSignUpAccountCreatedH2;
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement webElementSignUpContinueButton;


    public SignUpAccountCreatedPage(){
        System.out.println("This is SignUp AccountCreated Page constructor");
        PageFactory.initElements(driver,this);
    }

    public String validateSignUpAccountCreatedHMessage()
    {
       String heading= webElementSignUpAccountCreatedH2.getText();
       return heading;

    }
    public UserHomePage clickSignUpContinue()
    {

        webElementSignUpContinueButton.click();

        try{
        Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        return new UserHomePage();

    }








}
