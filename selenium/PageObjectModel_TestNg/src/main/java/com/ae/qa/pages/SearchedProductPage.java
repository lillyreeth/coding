package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class SearchedProductPage extends TestBase
{






   public SearchedProductPage()
    {
        System.out.println("This is Searched products page constructor");
        PageFactory.initElements(driver, this);
    }






}

