package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.CartPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPageTest extends TestBase {

    WelcomePage welcomePageObj;
    CartPage cartPageObj;
    String welcomePageTitle;

    public CartPageTest() {
        super();

    }

    @BeforeClass
    public void setup() {
        initialization();
        welcomePageObj = new WelcomePage();
        welcomePageTitle = null;
        welcomePageTitle = welcomePageObj.getWelcomePageTitle();
        cartPageObj = welcomePageObj.clickCartLink();

    }

    @Test
    public void validateWelcomePageTitle() {
        Assert.assertEquals(welcomePageTitle, prop.get("welcomePage_title"));
    }

    @Test
    public void validateCartPageTitle() {
        Assert.assertEquals(cartPageObj.getCartPageTitle(), prop.getProperty("cartPage_Title"));
    }

    @Test
    public void validateScrollDownGetSubscriptionH2() {
        Assert.assertEquals(cartPageObj.doScrollDownGetSubscriptionH2(), prop.getProperty("scrolldown_SubscriptionH2"));
    }

    @Test
    public void validateCartSubscription() {
        String subscriptionConfirmText = cartPageObj.getCartSubscriptionSuccessMessage(prop.getProperty("signup_email"));
        Assert.assertEquals(subscriptionConfirmText, prop.getProperty("subscription_actmsg"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
