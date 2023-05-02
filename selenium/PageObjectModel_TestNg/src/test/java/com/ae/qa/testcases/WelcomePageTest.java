package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.CartPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class WelcomePageTest extends TestBase {

    WelcomePage welcomePageObj;
    CartPage cartPageObj;


    public WelcomePageTest()
    {
        super();

    }

    @BeforeClass
    public void setUp() {
        initialization();
        welcomePageObj = new WelcomePage();
    }

    @Test
    public void validateWelcomePageTitle() {
        String welcomepage_Title = welcomePageObj.getWelcomePageTitle();
        Assert.assertEquals(welcomepage_Title, prop.get("welcomePage_title"));
    }

    @Test
    public void validateScrolldownGetSubscriptionH2()
    {
        Assert.assertEquals(welcomePageObj.doScrollDownGetSubsH2(), prop.getProperty("scrolldown_SubscriptionH2"));
    }


    @Test
    public void validateSubscription()
    {
       // welcomePageObj.doSubscribeForUpdates(prop.getProperty("welcomepage_SubscrptionEmail"));
        Assert.assertEquals(welcomePageObj.doSubscribeForUpdates(prop.getProperty("welcomepage_SubscrptionEmail")), prop.getProperty("subscription_actmsg"));
    }

    @Test
    public void validateScrollUpWithoutArrow()
    {
        Assert.assertEquals(welcomePageObj.doScrollUpWithoutArrow(), prop.getProperty("scrollup_IntroH2"));
    }

    @Test
    public void validateScrollUpWithArrow()
    {
        Assert.assertEquals(welcomePageObj.doScrollUpWithArrow(), prop.getProperty("scrollup_IntroH2"));
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}
