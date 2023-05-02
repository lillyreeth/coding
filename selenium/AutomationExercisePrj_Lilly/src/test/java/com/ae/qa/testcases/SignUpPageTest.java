package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class SignUpPageTest extends TestBase {
    WelcomePage welcomePageObj;
    LoginPage loginPageObj;
    SignUpPage signupPageObj;
    SignUpAccountCreatedPage signupAccountCreatedPageObj;
    UserHomePage userHomePageObj;
    AccountDeletedPage accountDeteledPageObj;
    String welcomePageTitle;

    public SignUpPageTest()
    {
        super();
    }

    @BeforeTest
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
        Assert.assertEquals(welcomePageTitle,prop.getProperty("welcomePage_title"));
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
    @Test(priority = 3)
    public void validateSignUpExistingUser()
    {
        loginPageObj.doExsitingUserSignUp(prop.getProperty("login_UserName"),prop.getProperty("login_email_Valid"));
        Assert.assertEquals(loginPageObj.getWarningMessage(),prop.getProperty("signUp_exsitingUserWarningMsg"));
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
      public void validateDeleteAccount()
     {
      accountDeteledPageObj= userHomePageObj.clickUserDeleteAccount();
      Assert.assertEquals(accountDeteledPageObj.validateAccountDeletedMessage(),prop.getProperty("AccountDeleted_actmsg"));

     }
    @Test(priority = 8)
    public void validateContinueDeletedButton()
    {
        accountDeteledPageObj.clickAccountDeletedContinueButton();
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}


