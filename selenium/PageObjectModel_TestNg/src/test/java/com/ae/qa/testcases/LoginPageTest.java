package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.AccountDeletedPage;
import com.ae.qa.pages.UserHomePage;
import com.ae.qa.pages.WelcomePage;
import com.ae.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends TestBase {
    LoginPage loginPageObj;
    WelcomePage welcomePageObj;
    UserHomePage userHomePageObj;
    AccountDeletedPage accountDeteledPageObj;
    String welcomePageTitle;

    /* to call parent class constructor in this child class
     we should create constructor fot this class and by using super keyword we can call parent class constructor*/
    public LoginPageTest()
    {
        super();
    }

    @BeforeClass
    public void setUp() {
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
    public void validateLoginH2()
    {
        Assert.assertEquals(loginPageObj.getLogInAccountText(), prop.getProperty("loginPageAccountInfo_ActText"));
    }

    @Test(priority = 3)
    public void validateLoginWithValidDetails()
    {
        userHomePageObj = loginPageObj.doLoginWithValidDetails(prop.getProperty("login_email_Valid"), prop.getProperty("login_password_Valid"));
        Assert.assertEquals(userHomePageObj.getLoggedInUserName(),prop.getProperty("loggedin_user") +" " + prop.getProperty("login_UserName"));
    }

    @Test(priority = 3)
    public void validateLoginWithInValidDetails()
    {
          String failedMessage = loginPageObj.doLoginWithInvalidDetails(prop.getProperty("login_email_Invalid"), prop.getProperty("login_password_Invalid"));
          Assert.assertEquals(failedMessage, prop.getProperty("loginFailureWarningMessage"));
    }

    @Test(priority = 4)
    public void validateDeletedAccount()
    {
        accountDeteledPageObj = userHomePageObj.clickUserDeleteAccount();
        Assert.assertEquals(accountDeteledPageObj.validateAccountDeletedMessage(), prop.getProperty("AccountDeleted_actmsg"));
    }
    @Test(priority = 5)
    public void validateContinueDeleteButton()
    {
        accountDeteledPageObj.clickAccountDeletedContinueButton();
    }
    @AfterClass
    public void tearDown()
    {
        System.out.println("Quitting the browser");
        driver.quit();
    }

}
