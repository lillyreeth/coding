package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class WelcomePage_Test extends TestBase {

    WelcomePage welcomePageobj;

    public WelcomePage_Test()
    {
        super();

    }

    @BeforeClass
    public void setup()
    {
        initialization();
        welcomePageobj = new WelcomePage();
    }

    @Test
    public void welcomePageTitle_Test()
    {
        String welcomepage_Title = welcomePageobj.getWelcomePageTitle();
        Assert.assertEquals(welcomepage_Title, "Automation Exercise - Signup / Login");
    }

    @Test(priority = 1)
    public void welcomepage_subscription() throws InterruptedException
    {
       welcomePageobj.validateSubscription(prop.getProperty("welcomepage_SubscrptionEmail"));
    }
    @Test(priority = 2)
    public void welcomepage_subscriptionMsgValidate() throws InterruptedException
    {
        Assert.assertEquals(welcomePageobj.validateSubscription(prop.getProperty("welcomepage_SubscrptionEmail")),prop.getProperty("subscription_actmsg"));
    }

    @Test
    public void scrolldown_test() throws InterruptedException
    {
        Assert.assertEquals(welcomePageobj.scrolldown(),prop.getProperty("scrolldown_actmsg"));
    }

    @Test
    public void scrollupWithoutArrow_test() throws InterruptedException
    {
        Assert.assertEquals(welcomePageobj.scrollup(),prop.getProperty("scrollup_actmsg"));
    }
    @Test
    public void scrollupWithArrow_test() throws InterruptedException
    {
        Assert.assertEquals(welcomePageobj.scrollup_witharrow(),prop.getProperty("scrollup_actmsg"));
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}
