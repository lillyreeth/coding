package com.ae.qa.util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.ae.qa.base.TestBase.driver;

public class TestUtil
{
   public static long PAGE_LOAD_TIMEOUT=20;
   public static long IMPLICIT_WAIT=10;

    public static WebDriverWait EXPLICIT_WAIT = new WebDriverWait(driver, 20);
    public static JavascriptExecutor JS_SCROLLOBJ = (JavascriptExecutor) driver;








}

