package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args)
	{
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay"); 
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
     
	}

}
