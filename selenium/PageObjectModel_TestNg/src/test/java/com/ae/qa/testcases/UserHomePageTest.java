package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.LoginPage;
import com.ae.qa.pages.UserHomePage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserHomePageTest extends TestBase
{
    WelcomePage welcomePageObj;
    LoginPage loginPageObj;
    UserHomePage userHomePageObj;


   public UserHomePageTest()
    {
        super();
    }

    @BeforeClass
    public void setUp()
    {
        initialization();
        welcomePageObj = new WelcomePage();
    }

    @Test(priority = 1)
    public void validateWelcomePageTitle() {
        Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
    }

    @Test(priority = 2)
    public void validateLoginLink() {
        loginPageObj = welcomePageObj.clickSignUpOrLoginLink();
        Assert.assertEquals(loginPageObj.getLoginpageTitle(),prop.getProperty("loginPage_title"));

    }
    @Test(priority = 3)
    public void validateLoginInfoH2()
    {
        Assert.assertEquals(loginPageObj.getLogInAccountText(), prop.getProperty("loginPageAccountInfo_ActText"));
    }

    @Test(priority = 4)
    public void validateLoginWithValidData()
    {
        userHomePageObj = loginPageObj.doLoginWithValidDetails(prop.getProperty("login_email_Valid"), prop.getProperty("login_password_Valid"));
    }

    @Test(priority = 5)
    public void validateLoggedInUserName()
    {
        Assert.assertEquals(userHomePageObj.getLoggedInUserName(),prop.getProperty("loggedin_user")+ " " +prop.getProperty("login_UserName"));
    }

    @Test(priority = 6)
    public void validateLogoutButton()
    {
       loginPageObj=userHomePageObj.clickLogOutButton();
    }

    @Test(priority = 7)

    public void verifyLoginPageTitle()
    {
       Assert.assertEquals(loginPageObj.getLoginpageTitle(),prop.getProperty("loginPage_title"));
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
