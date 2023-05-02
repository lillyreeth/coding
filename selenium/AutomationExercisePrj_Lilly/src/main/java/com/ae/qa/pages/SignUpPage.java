package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static com.ae.qa.util.TestUtil.EXPLICIT_WAIT;

public class SignUpPage extends TestBase
{

    @FindBy(xpath="//b[contains(text(),'Enter Account Information')]")
    WebElement webElementEnterAccountInfoText;
    @FindBy(xpath="//input[@id='id_gender1']")
    WebElement webElementSignUpTitleRadio1;
    @FindBy(xpath="//div[@id='uniform-id_gender2']")
    WebElement webElementSignUpTitleRadio2;
    @FindBy(xpath="//input[@id='password']")
    WebElement webElementSignUpPasswordInput;
    @FindBy(xpath="//select[@id='days']")
    WebElement webElementSignUpDaySelect;
    @FindBy(xpath="//select[@id='months']")
    WebElement webElementSignUpMonthSelect;
    @FindBy(xpath="//select[@id='years']")
    WebElement webElementSignUpYearSelect;
    @FindBy(xpath="//label[contains(text(),'Sign up for our newsletter!')]")
    WebElement webElementSignUpCheckBox1;
    @FindBy(xpath="//input[@id='optin']")
    WebElement webElementSignUpCheckBox2;
    @FindBy(xpath="//input[@id='first_name']")
    WebElement webElementSignUpFirstNameInput;
    @FindBy(xpath="//input[@id='last_name']")
    WebElement webElementSignUpLastNameInput;
    @FindBy(xpath="//input[@id='company']")
    WebElement webElementSignUpCompanyInput;
    @FindBy(xpath="//input[@id='address1']")
    WebElement webElementSignUpAddress1Input;
    @FindBy(xpath="//input[@id='address2']")
    WebElement webElementSignUpAddress2Input;
    @FindBy(xpath="//select[@id='country']")
    WebElement webElementSignUpCountrySelect;
    @FindBy(xpath="//input[@id='state']")
    WebElement webElementSignUpStateInput;
    @FindBy(xpath="//input[@id='city']")
    WebElement webElementSignUpCityInput;
    @FindBy(xpath="//input[@id='zipcode']")
    WebElement webElementSignUpZipCodeInput;
    @FindBy(xpath="//input[@id='mobile_number']")
    WebElement webElementSignUpMobileNoInput;
    @FindBy(xpath="//button[contains(text(),'Create Account')]")
    WebElement webElementSignUpCreateAccountButton;


    public SignUpPage(){
        System.out.println("This is loginpage/signuppage constructor");
        PageFactory.initElements(driver,this);

    }

    public String verifyAccountInfoText()
    {
        return webElementEnterAccountInfoText.getText();

    }
    public SignUpAccountCreatedPage doFillSignUpForm(
                           String title,
                           String password,
                           String day,
                           String month,
                           String year,
                           String firstname,
                           String lastname,
                           String company,
                           String address1,
                           String address2,
                           String country,
                           String state,
                           String city,
                           String zipcode,
                           String mobileno)
    {
        if(title.equalsIgnoreCase("Mr"))
        {
            webElementSignUpTitleRadio1.click();
        }
        else
        {
            webElementSignUpTitleRadio2.click();
        }
        webElementSignUpPasswordInput.sendKeys(password);
        Select sel_day=new Select(webElementSignUpDaySelect);
        sel_day.selectByVisibleText(day);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpMonthSelect));
        Select sel_month = new Select(webElementSignUpMonthSelect);
        sel_month.selectByVisibleText(month);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpYearSelect));
        Select sel_year=new Select(webElementSignUpYearSelect);
        sel_year.selectByVisibleText(year);
        webElementSignUpCheckBox1.click();
        webElementSignUpCheckBox2.click();
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpFirstNameInput)).sendKeys(firstname);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpLastNameInput)).sendKeys(lastname);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpCompanyInput)).sendKeys(company);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpAddress1Input)).sendKeys(address1);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpAddress2Input)).sendKeys(address2);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpCountrySelect));
        Select sel_country=new Select(webElementSignUpCountrySelect);
        sel_country.selectByVisibleText(country);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpStateInput)).sendKeys(state);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpCityInput)).sendKeys(city);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpZipCodeInput)).sendKeys(zipcode);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpMobileNoInput)).sendKeys(mobileno);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSignUpCreateAccountButton)).click();
        return new SignUpAccountCreatedPage();
    }

}
