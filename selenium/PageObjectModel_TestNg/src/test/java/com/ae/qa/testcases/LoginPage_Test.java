package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.WelcomePage;
import com.ae.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage_Test extends TestBase {
    LoginPage loginPageobj;
    WelcomePage welcomePageobj;

    /* to call parent class constructor in this child class
     we should create constructor fot this class and by using super keyword we can call parent class constructor*/
    public LoginPage_Test() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        welcomePageobj = new WelcomePage();
       loginPageobj = welcomePageobj.signupLoginPage();

    }

    @Test(priority = 1)
    public void login_Testcase() {
        loginPageobj.login(prop.getProperty("login_email"), prop.getProperty("login_password"));
    }

    @Test(priority = 2)
    public void loginpageTitle_test() {
        String title = loginPageobj.getLoginpageTitle();
        Assert.assertEquals(title, "Automation Exercise - Signup / Login");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
