package com.qa.tests;


import com.qa.pages.Pages_Radiobutton;
import org.testng.annotations.Test;

public class Test_Radiobutton
{

    @Test
    public void test_radiobutton() {
        Pages_Radiobutton obj3 = new Pages_Radiobutton();
        obj3.setUp_browser("chrome","https://jqueryui.com/checkboxradio/");
        obj3.ClickRadiobutton("london");
        //obj3.tearDown();


    }

}
