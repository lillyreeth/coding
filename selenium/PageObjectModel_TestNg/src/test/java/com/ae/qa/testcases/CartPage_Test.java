package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.CartPage;
import com.ae.qa.pages.WelcomePage;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartPage_Test extends TestBase
{

    WelcomePage welcomePageobj;
    CartPage cartPageObj;
    public CartPage_Test()
    {
        super();

    }
    @BeforeClass
    public void setup()
    {
        initialization();
        WelcomePage welcomePageobj=new WelcomePage();
        cartPageObj= welcomePageobj.clickCartLink();
    }

    @Test(priority=1)
    public void cart_Subscription_Test()
    {
       cartPageObj.cart_subscriptionMsg(prop.getProperty("signup_email"));

    }

    @Test(priority=2)
    public void cart_SubscriptionMsgValidate_Test()
    {
        Assert.assertEquals(cartPageObj.cart_subscriptionMsg(prop.getProperty("signup_email")),prop.getProperty("subscription_actmsg"));
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    }
