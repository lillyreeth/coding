package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterBeforeCheckOutTest extends TestBase
{
    WelcomePage welcomePageObj;
    LoginPage loginPageObj;
    SignUpPage signupPageObj;
    SignUpAccountCreatedPage signupAccountCreatedPageObj;
    UserHomePage userHomePageObj;
    ProductsPage productsPageObj;
    CartPage cartPageObj;
    CheckoutPage checkoutPageObj;
    PayAndConfirmPage payAndConfirmPageObj;

    String welcomePageTitle;

    public RegisterBeforeCheckOutTest()
    {
        super();
    }

    @BeforeClass
    public void setUp()
    {
        initialization();
        welcomePageObj = new WelcomePage();
        welcomePageTitle=welcomePageObj.getWelcomePageTitle();
        loginPageObj = welcomePageObj.clickSignUpOrLoginLink();
    }

    @Test(priority = 1)
    public void validateWelcomePageTitle()
    {
        Assert.assertEquals(welcomePageTitle, prop.get("welcomePage_title"));
    }

    @Test(priority = 2)
    public void validateSignUpH2()
    {
        Assert.assertEquals(loginPageObj.getNewUserSignUpTextH2(), prop.getProperty("signUpH2_NewUser"));
    }

    @Test(priority = 3)
    public void validateSignUpNewUser()
    {
        signupPageObj = loginPageObj.doNewUserSignUp(prop.getProperty("signup_userid"), prop.getProperty("signup_email"));
    }

    @Test(priority = 4)
    public void validateSignUpAccountInfoH2()
    {
        Assert.assertEquals(signupPageObj.verifyAccountInfoText(),prop.getProperty("signup_info_actmsg"));
    }

    @Test(priority = 5)
    public void validateSignUp()
    {
        signupAccountCreatedPageObj= signupPageObj.doFillSignUpForm(prop.getProperty("signup_title"),
                prop.getProperty("signup_password"),
                prop.getProperty("signup_day"),
                prop.getProperty("signup_month"),
                prop.getProperty("signup_year"),
                prop.getProperty("signup_firstname"),
                prop.getProperty("signup_lastname"),
                prop.getProperty("signup_company"),
                prop.getProperty("signup_address1"),
                prop.getProperty("signup_address2"),
                prop.getProperty("signup_country"),
                prop.getProperty("signup_state"),
                prop.getProperty("signup_city"),
                prop.getProperty("signup_zipcode"),
                prop.getProperty("signup_mobileno"));
        Assert.assertEquals(signupAccountCreatedPageObj.validateSignUpAccountCreatedHMessage(),prop.getProperty("accountCreated_act"));
    }

    @Test(priority = 6)
    public void validateLoggedInUserName()
    {
        //After signUp, click continue and then verify the Loggedin User name
        userHomePageObj=signupAccountCreatedPageObj.clickSignUpContinue();
        Assert.assertEquals(userHomePageObj.getLoggedInUserName(),prop.getProperty("loggedin_user")+ " " +prop.getProperty("signup_userid"));
    }

    @Test(priority = 7)
    public void validateProductsLink()
    {

        productsPageObj= welcomePageObj.clickProductsLink();
        Assert.assertEquals(productsPageObj.getAllProductsH2(),prop.getProperty("productsPageH2"));
    }

    @Test(priority = 8)
    public void validateAddToCartInProductPage()
    {
        cartPageObj=productsPageObj.clickAddToCartInProductPage();
        checkoutPageObj =cartPageObj.clickCheckout();
    }

    @Test(priority = 9)
    public void validateAddressVisibility()
    {
      Assert.assertEquals(checkoutPageObj.getAddressVisibility(),true);

    }
    @Test(priority = 9)
    public void validateOrderVisibility()
    {
        Assert.assertEquals(checkoutPageObj.getOrderVisibility(),true);

    }
    @Test(priority = 10)
    public void validatePlaceOrder()
    {
        payAndConfirmPageObj=checkoutPageObj.clickPlaceOrder(prop.getProperty("checkoutComments"));
        payAndConfirmPageObj.fillCardDetails(prop.getProperty("card_name"),
                                            prop.getProperty("card_no"),
                                            prop.getProperty("card_cvc"),
                                            prop.getProperty("card_exp"),
                                            prop.getProperty("card_year"));
    }

    @Test(priority = 11)
    public void validateDownloadInvoice()
    {
        OrderPlacedPage orderPlacedPageObj=new OrderPlacedPage();
        orderPlacedPageObj.clickDownloadInvoice();
    }

    @Test(priority = 12)
    public void validateDeleteAccount()
    {
        OrderPlacedPage orderPlacedPageObj=new OrderPlacedPage();
        orderPlacedPageObj.clickDeleteButton();
    }

     @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
