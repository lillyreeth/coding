package com.ae.qa.util;
import com.ae.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends TestBase
{
   public static long PAGE_LOAD_TIMEOUT=20;
   public static long IMPLICIT_WAIT=10;


  //  public static JavascriptExecutor JS_SCROLLOBJ = (JavascriptExecutor) driver;
    public static WebDriverWait EXPLICIT_WAIT = new WebDriverWait(driver, 5);
    public static WebDriverWait EXTRA_EXPLICIT_WAIT = new WebDriverWait(driver, 10);



}

