package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginBeforeCheckoutTest extends TestBase
{

    WelcomePage welcomePageObj;
    UserHomePage userHomePageObj;
    LoginPage loginPageObj;
    ProductsPage productsPageObj;
    CartPage cartPageObj;
    CheckoutPage checkoutPageObj;
    PayAndConfirmPage payAndConfirmPageObj;

    public LoginBeforeCheckoutTest()
    {
        super();
    }

    @BeforeClass
    public void setUp()
    {
        initialization();
        welcomePageObj=new WelcomePage();
    }

    @Test(priority = 1)
    public void validateWelcomePageTitle()
    {
        Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
    }

    @Test(priority = 2)
    public void validateLoginWithValidDetails()
    {
        loginPageObj=welcomePageObj.clickSignUpOrLoginLink();
        userHomePageObj = loginPageObj.doLoginWithValidDetails(prop.getProperty("login_email_Valid"), prop.getProperty("login_password_Valid"));
        Assert.assertEquals(userHomePageObj.getLoggedInUserName(),prop.getProperty("loggedin_user") +" " + prop.getProperty("login_UserName"));
    }

    @Test(priority = 3)
    public void validateProductsLink()
    {

        productsPageObj= userHomePageObj.clickProductsLink();
        Assert.assertEquals(productsPageObj.getAllProductsH2(),prop.getProperty("productsPageH2"));
    }

    @Test(priority = 4)
    public void validateAddToCartInProductPage()
    {
        cartPageObj=productsPageObj.clickAddToCartInProductPage();
        checkoutPageObj =cartPageObj.clickCheckout();
    }

    @Test(priority = 5)
    public void validateAddressVisibility()
    {
        Assert.assertEquals(checkoutPageObj.getAddressVisibility(),true);

    }
    @Test(priority = 6)
    public void validateOrderVisibility()
    {
        Assert.assertEquals(checkoutPageObj.getOrderVisibility(),true);

    }
    @Test(priority = 7)
    public void validatePlaceOrder()
    {
        payAndConfirmPageObj=checkoutPageObj.clickPlaceOrder(prop.getProperty("checkoutComments"));
                payAndConfirmPageObj.fillCardDetails(prop.getProperty("card_name"),
                prop.getProperty("card_no"),
                prop.getProperty("card_cvc"),
                prop.getProperty("card_exp"),
                prop.getProperty("card_year"));

    }
    @Test(priority = 8)
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
