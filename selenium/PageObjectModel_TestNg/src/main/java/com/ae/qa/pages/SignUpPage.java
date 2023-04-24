package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends TestBase
{

    @FindBy(xpath="//input[@id='id_gender1']")
    WebElement Mr;
    @FindBy(xpath="//div[@id='uniform-id_gender2']")
    WebElement Mrs;
    @FindBy(xpath="//input[@id='password']")
    WebElement password;
    @FindBy(xpath="//select[@id='days']")
    WebElement day;
    @FindBy(xpath="//select[@id='months']")
    WebElement month;
    @FindBy(xpath="//select[@id='years']")
    WebElement year;
    @FindBy(xpath="//label[contains(text(),'Sign up for our newsletter!')]")
    WebElement checkbox1;
    @FindBy(xpath="//input[@id='optin']")
    WebElement checkbox2;
    @FindBy(xpath="//input[@id='first_name']")
    WebElement firstname;
    @FindBy(xpath="//input[@id='last_name']")
    WebElement lastname;
    @FindBy(xpath="//input[@id='company']")
    WebElement company;
    @FindBy(xpath="//input[@id='address1']")
    WebElement address1;
    @FindBy(xpath="//input[@id='address2']")
    WebElement address2;
    @FindBy(xpath="//select[@id='country']")
    WebElement country;

    @FindBy(xpath="//input[@id='state']")
    WebElement state;
    @FindBy(xpath="//input[@id='city']")
    WebElement city;
    @FindBy(xpath="//input[@id='zipcode']")
    WebElement zipcode;
    @FindBy(xpath="//input[@id='mobile_number']")
    WebElement mobileno;
    @FindBy(xpath="//button[contains(text(),'Create Account')]")
    WebElement creataccount_button;


    public SignUpPage()
    {
        System.out.println("This is loginpage/signuppage constructor");
        PageFactory.initElements(driver,this);

    }
    public void enterInfo( String title,
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
        this.password.sendKeys("");
        Select sel_day=new Select(this.day);
        sel_day.selectByVisibleText(day);
        Select sel_month=new Select(this.month);
        sel_day.selectByVisibleText(month);
        Select sel_year=new Select(this.year);
        sel_day.selectByVisibleText(year);
        checkbox1.click();
        checkbox2.click();
        this.firstname.sendKeys();
        this.lastname.sendKeys();
        this.company.sendKeys();
        this.address1.sendKeys();
        this.address2.sendKeys();
        Select sel=new Select(this.country);
        sel.selectByVisibleText(country);
        this.state.sendKeys();
        this.city.sendKeys();
        this.zipcode.sendKeys();
        this.mobileno.sendKeys();
        this.creataccount_button.click();

    }

}
