package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args)
	{
		
		List<String> list=new ArrayList<String>();
		list.add("Lilly");
		list.add("Reeth");
		list.add("Prashastha");
		list.add("Rinku");
		list.add("swetha");
		
		list.remove(1);
		list.remove("Lilly");
		
		
       System.out.println(list);
      
        List<String> list1=new ArrayList<String>();
		list1.add("Karthik");
		list1.add("vemuri");
		
		
        
		// list.addAll({"xyz","pqr"});
		list.addAll(list1);
       list.removeAll(list1);
		

	       Iterator itr = list.iterator();
	       while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }
	}

}
