package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends TestBase
{

    @FindBy(xpath="//b[contains(text(),'Account Deleted!')]")
    WebElement AccountDeleted_heading;
    @FindBy(xpath="//a[@class='btn btn-primary']")
    WebElement continue_button;




    public String validate_accountDeleted()
    {

       String accountdeleteMsg= AccountDeleted_heading.getText();
        return accountdeleteMsg;
    }

    public WelcomePage continuebutton_click()
    {
        continue_button.click();
        return new WelcomePage();
    }






}
