package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.*;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.PrimitiveIterator;

public class SignUpPage_Test extends TestBase {
    WelcomePage welcomePageobj;
    LoginPage loginPageobj;
    SignUpPage signuppageobj;
    SignUpAccountCreatedPage signupAccountCreatedPageObj;
    UserHomePage userhomeobj;

    AccountDeletedPage AccountDeteledPageObj;

    public SignUpPage_Test()
    {
        super();
    }

    @BeforeClass
    public void setup() throws InterruptedException {
        initialization();
        welcomePageobj = new WelcomePage();
        loginPageobj = welcomePageobj.signupLoginPage();
        signuppageobj = loginPageobj.newuser_signup(prop.getProperty("signup_userid"), prop.getProperty("signup_email"));
    }

    @Test(priority = 1)
    public void enterInfo_test() throws InterruptedException {

        signupAccountCreatedPageObj= signuppageobj.enterInfo(prop.getProperty("signup_title"),
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


    }

    @Test(priority = 2)
    public void validate_accountCreatedText()
    {

        Assert.assertEquals(signupAccountCreatedPageObj.validate_accountCreated(),prop.getProperty("accountCreated_act"));

    }

    @Test(priority = 3)
    public void click_continue_accountcreated()
    {
        userhomeobj=signupAccountCreatedPageObj.continue_click();
    }

    @Test(priority = 4)
    public void validate_userhomepage()
    {
        Assert.assertEquals(userhomeobj.loggedInUser(),prop.getProperty("loggedin_user") +" " + prop.getProperty("signup_userid"));

    }
     @Test(priority = 5)
    public void validate_deleteAccount()
    {

      AccountDeteledPageObj= userhomeobj.deleteAccountLink_click();

    }
    @Test(priority = 6)
    public void validate_AccountDeletedText()
    {

        Assert.assertEquals(AccountDeteledPageObj.validate_accountDeleted(),prop.getProperty("AccountDeleted_actmsg"));

    }
    @Test(priority = 7)
    public void continue_clickDeletedAccount()
    {
        AccountDeteledPageObj.continuebutton_click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}


