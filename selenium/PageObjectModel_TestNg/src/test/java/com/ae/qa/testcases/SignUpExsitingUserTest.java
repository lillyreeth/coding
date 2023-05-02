package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.LoginPage;
import com.ae.qa.pages.UserHomePage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpExsitingUserTest extends TestBase
{
    LoginPage loginPageObj;
    WelcomePage welcomePageObj;
    UserHomePage userHomePageObj;

    public SignUpExsitingUserTest()
    {
        super();
    }

    @BeforeClass
    public void setUp() {
        initialization();
        welcomePageObj = new WelcomePage();
    }


    @Test(priority = 1)
    public void validateWelcomePageTitle()
    {
        Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
    }


}
