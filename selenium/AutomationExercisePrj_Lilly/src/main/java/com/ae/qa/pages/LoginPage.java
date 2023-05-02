package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ae.qa.util.TestUtil.EXPLICIT_WAIT;

public class LoginPage extends TestBase {
    //page Factory / Object Repository
    @FindBy(xpath="//h2[contains(text(),'Login to your account')]")
    WebElement webElementLoginTextH2;
    @FindBy(name = "email")
    WebElement webElementLoginEmailInput;
    @FindBy(name = "password")
    WebElement webElementLoginPasswordInput;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement webElementLoginButton;
    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    WebElement webElementNewUserSignUpH2;
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement webElementSignupNameInput;
    @FindBy(xpath = "//div[@class='signup-form']//input[@placeholder='Email Address']")
    WebElement webElementSignUpEmailInput;
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement webElementSignUpButton;
    @FindBy(xpath="//p[contains(text(),'Email Address already exist!')]")
    WebElement webElementSignUpWarning;

    public LoginPage(){
        System.out.println("This is loginpage/signuppage constructor");
        PageFactory.initElements(driver, this);
    }

    public String getLoginpageTitle()
    {
        return driver.getTitle();
    }

    public String getLogInAccountText()
    {
        return webElementLoginTextH2.getText();
    }

    public UserHomePage doLoginWithValidDetails(String email, String pswrd)
    {
        webElementLoginEmailInput.sendKeys(email);
        webElementLoginPasswordInput.sendKeys(pswrd);
        webElementLoginButton.click();
        return new UserHomePage();

    }

    public String doLoginWithInvalidDetails(String email, String pswrd)
    {
        webElementLoginEmailInput.sendKeys(email);
        webElementLoginPasswordInput.sendKeys(pswrd);
        webElementLoginButton.click();
        System.out.println("button clicked");
        WebElement loginFailedText = driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]"));
        System.out.println("returning text");
        return loginFailedText.getText();

    }

    public String getNewUserSignUpTextH2()
    {
        return webElementNewUserSignUpH2.getText();
    }


    public SignUpPage doNewUserSignUp(String name, String email)
    {
        System.out.println("New User signup method: clicking signup button");
        webElementSignupNameInput.sendKeys(name);
        webElementSignUpEmailInput.sendKeys(email);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpButton));
        webElementSignUpButton.click();
        return new SignUpPage();
    }

    public void doExsitingUserSignUp(String name, String email)
    {

        webElementSignupNameInput.sendKeys(name);
        webElementSignUpEmailInput.sendKeys(email);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpButton));
        webElementSignUpButton.click();

    }

    public String getWarningMessage()
    {
       return webElementSignUpWarning.getText();
    }

}
