package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.AccountDeletedPage;
import com.ae.qa.pages.UserHomePage;
import com.ae.qa.pages.WelcomePage;
import com.ae.qa.pages.LoginPage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPage_Test extends TestBase {
    LoginPage loginPageobj;
    WelcomePage welcomePageobj;
    UserHomePage userhomeobj;
    AccountDeletedPage AccountDeteledPageObj;

    /* to call parent class constructor in this child class
     we should create constructor fot this class and by using super keyword we can call parent class constructor*/
    public LoginPage_Test() {
        super();
    }

    @BeforeClass
    public void setup() {
        initialization();
        welcomePageobj = new WelcomePage();
        loginPageobj = welcomePageobj.signupLoginPage();

    }
        @Test(priority = 1)
         public void loginpageTitle_test() throws InterruptedException {
            String title = loginPageobj.getLoginpageTitle();
            Thread.sleep(2000);
            Assert.assertEquals(title, "Automation Exercise - Signup / Login");
        }

        @Test(priority = 2)
        public void login_Testcase ()
      {
          userhomeobj = loginPageobj.login(prop.getProperty("login_email"), prop.getProperty("login_password"));
      }

//    @Test(priority = 3)
//    public void validate_userhomepage()
//    {
//
//        Assert.assertEquals(userhomeobj.loggedInUser(),prop.getProperty("loggedin_user") +" " + prop.getProperty("signup_userid"));

    //  }
    @Test(priority = 3)
    public void clickDeletedAccount() {
        AccountDeteledPageObj = userhomeobj.deleteAccountLink_click();
    }

    @Test(priority = 4)
    public void accountDelete_msg() {
        Assert.assertEquals(AccountDeteledPageObj.validate_accountDeleted(), prop.getProperty("AccountDeleted_actmsg"));
    }

    @Test(priority = 5)
    public void click_continueDeleteAccount() {

        AccountDeteledPageObj.continuebutton_click();
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
