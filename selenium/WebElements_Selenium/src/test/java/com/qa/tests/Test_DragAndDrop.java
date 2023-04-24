package com.qa.tests;

import com.qa.pages.Pages_DragAndDrop;
import org.testng.annotations.Test;

public class Test_DragAndDrop
{


    @Test
    public void testDragDrop()
    {
        Pages_DragAndDrop obj=new Pages_DragAndDrop();
        obj.setUp_browser("firefox","https://jqueryui.com/droppable/");
        obj.dragAndDrop();

    }
}
