package packageWebdriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) 
	{
	   List integers=new ArrayList();
	   
//	   integers.add(1);
//	   integers.add(2);
	   
	   for(int i=1;i<=10;i++)
	   {
	 
		   integers.add(i);
		   
	   }
	   System.out.println(integers);
	   
	   
	   LinkedList list=new LinkedList();
	   LinkedList list2=new LinkedList();
	   list.add(20);
	   list.add(12);
	   System.out.println(list);
	   
	   Iterator itr= integers.iterator();
	   while(itr.hasNext())
	   {
		   
		list2.add(itr.next());
		   
	   }
	   System.out.println(list2);
	   
	   
	   
	   
	
	   
	   
	   
	   
	   
	   
	   
	
	}   

	}
	


