package com.qa.tests;

import com.qa.pages.Pages_Checkboxes;
import org.testng.annotations.Test;

public class Test_Checkboxes
{
    @Test
    public void test_clickCheckboxes()
    {
        Pages_Checkboxes.setUp_browser("chrome","https://jqueryui.com/checkboxradio/");
        String array_ratings[]={"2 Star","3 star","4 star","5 star"};
        Pages_Checkboxes.click_checkboxes(array_ratings);


    }
}

