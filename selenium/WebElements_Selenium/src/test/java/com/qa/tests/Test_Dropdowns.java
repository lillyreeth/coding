package com.qa.tests;

import com.qa.pages.Pages_Dropdowns;
import org.testng.annotations.Test;

public class Test_Dropdowns
{

    @Test
    public void dropdowns_test() {
        Pages_Dropdowns.setUp_browser("firefox","https://jqueryui.com/selectmenu/");
        Pages_Dropdowns.select_dropdowns("Faster");
    }

}
