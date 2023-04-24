package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WelcomePage_Test extends TestBase {

    WelcomePage welcomePageobj;

    public WelcomePage_Test() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
    }

    @Test
    public void welcomePageTitle_Test() {
        welcomePageobj = new WelcomePage();
        String welcomepage_Title = welcomePageobj.getwelcomePageTitle();
        Assert.assertEquals(welcomepage_Title, "Automation Exercise - Signup / Login");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
