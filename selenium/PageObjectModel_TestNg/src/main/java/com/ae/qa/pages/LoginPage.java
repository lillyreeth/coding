package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //page Factory / Object Repository

    @FindBy(name = "email")
    WebElement user_email;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login_button;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement signup_name;
    @FindBy(xpath = "//div[@class='signup-form']//input[@placeholder='Email Address']")
    WebElement signup_email;
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement signup_button;

    public LoginPage() {
        System.out.println("This is loginpage/signuppage constructor");
        PageFactory.initElements(driver, this);
    }

    public String getLoginpageTitle() {
        return driver.getTitle();
    }

    public HomePage login(String email, String pswrd) {

        user_email.sendKeys(email);
        password.sendKeys(pswrd);
        login_button.click();
        return new HomePage();

    }

    public SignUpPage newuser_signup(String name, String email) throws InterruptedException {
        System.out.println("newuser_signup method: clicking signup button");
        signup_name.sendKeys(name);
        signup_email.sendKeys(email);
        Thread.sleep(5000);
        signup_button.click();
        return new SignUpPage();
    }


}
