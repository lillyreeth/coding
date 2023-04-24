package com.qa.tests;

import com.qa.pages.Pages_TextBoxes;
import org.testng.annotations.Test;

public class Test_TextBoxes
{

    @Test
    public void test_enterSearchText()
    {
        Pages_TextBoxes obj2=new Pages_TextBoxes();
        obj2.setUp_browser("chrome","https://jqueryui.com/checkboxradio/");
        obj2.enterSearchText("Checkbox radio ");
        obj2.tearDown();

    }
}
