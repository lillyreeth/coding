package listeners;

import junit.framework.Assert;
import org.checkerframework.checker.units.qual.A;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.MyListeners.class)
public class ListenersEx
{
    @Test(priority = 1)
    public void test1()
    {
        System.out.println("This is test1");
        Assert.assertEquals("A", "A");
    }
    @Test(priority = 2)
    public void test1_1()
    {
        System.out.println("This is test1_1");
        Assert.assertEquals("A", "A");
    }
    @Test(priority = 3)
    public void test2()
    {
        System.out.println("This is test2");
        Assert.assertEquals("A", "B");
    }
    @Test(priority = 4)
    public void test3()
    {
        System.out.println("This is test3 - this is skipping boy");
       throw new SkipException("This is skip Exception");
    }











}
