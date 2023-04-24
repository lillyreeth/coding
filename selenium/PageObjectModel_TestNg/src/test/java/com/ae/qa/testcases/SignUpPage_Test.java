package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.LoginPage;
import com.ae.qa.pages.SignUpPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPage_Test extends TestBase {
    WelcomePage welcomePageobj;
    LoginPage loginPageobj;
    SignUpPage signuppageobj;

    public SignUpPage_Test() {
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        welcomePageobj = new WelcomePage();
        loginPageobj = welcomePageobj.signupLoginPage();
        signuppageobj = loginPageobj.newuser_signup(prop.getProperty("signup_userid"), prop.getProperty("signup_email"));
        //loginPageobj.newuser_signup(prop.getProperty("signup_userid"), prop.getProperty("signup_email"));
    }

    @Test
    public void enterInfo_test() {
        signuppageobj.enterInfo(prop.getProperty("signup_title"),
                prop.getProperty("signup_password"),
                prop.getProperty("signup_day"),
                prop.getProperty("signup_month"),
                prop.getProperty("signup_year"),
                prop.getProperty("signup_firstname"),
                prop.getProperty("signup_lastname"),
                prop.getProperty("signup_company"),
                prop.getProperty("signup_address1"),
                prop.getProperty("signup_address2"),
                prop.getProperty("signup_country"),
                prop.getProperty("signup_state"),
                prop.getProperty("signup_city"),
                prop.getProperty("signup_zipcode"),
                prop.getProperty("signup_mobileno"));



    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
