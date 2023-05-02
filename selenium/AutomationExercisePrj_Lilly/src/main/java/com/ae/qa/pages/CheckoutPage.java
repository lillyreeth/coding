package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.apache.commons.lang.StringEscapeUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends TestBase
{

    @FindBy(xpath="//h2[contains(text(),'Address Details')]")
    WebElement webElementAddressDetails;
    @FindBy(xpath="//h2[contains(text(),'Review Your Order')]")
    WebElement webElementReviewOrder;
    @FindBy(xpath="//textarea[@name='message']")
    WebElement webElementCartMessageInput;
    @FindBy(xpath="//a[contains(text(),'Place Order')]")
    WebElement webElementPlaceOrder;
    @FindBy(xpath="(//ul[@id='address_delivery']//li)[2]")
    WebElement webElementDeliveryAddName;
    @FindBy(xpath="(//ul[@id='address_delivery']//li)[3]")
    WebElement webElementDeliveryAddCompany;

    @FindBy(xpath="(//ul[@id='address_invoice']//li)[2]")
    WebElement webElementBillingAddName;
    @FindBy(xpath="(//ul[@id='address_invoice']//li)[3]")
    WebElement webElementBillingAddComapny;



    public CheckoutPage(){
        System.out.println("This is Checkout page constructor");
        PageFactory.initElements(driver, this);
    }

    public boolean getAddressVisibility()
    {

        return webElementAddressDetails.isDisplayed();

    }
    public boolean getOrderVisibility()
    {

        return webElementAddressDetails.isDisplayed();
    }

    public PayAndConfirmPage clickPlaceOrder(String message)
    {

        webElementCartMessageInput.sendKeys(message);
        webElementPlaceOrder.click();
        return new PayAndConfirmPage();
    }

    public boolean checkDeliveryAddress()
    {
        boolean result=false;
        String name=webElementDeliveryAddName.getText();
        System.out.println(name);
        String company=webElementDeliveryAddCompany.getText();
        System.out.println(company);
        String signupName=prop.getProperty("signup_title")+". " +prop.getProperty("signup_firstname")+" "+prop.getProperty("signup_lastname");
        System.out.println(signupName);
        if(name.equalsIgnoreCase(signupName) && company.equalsIgnoreCase(prop.getProperty("signup_company")))
            result= true;
        return result;
    }

    public boolean checkBillingAddress()
    {
        boolean result=false;
        String name=webElementBillingAddName.getText();
        System.out.println(name);
        String company=webElementBillingAddComapny.getText();
        System.out.println(company);
        String signupName=prop.getProperty("signup_title")+". " +prop.getProperty("signup_firstname")+" "+prop.getProperty("signup_lastname");
        System.out.println(signupName);
        if(name.equalsIgnoreCase(signupName) && company.equalsIgnoreCase(prop.getProperty("signup_company")))
            result= true;
        return result;
    }
}
