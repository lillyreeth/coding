package collections;

import java.util.Iterator;
import java.util.Stack;

public class stackEx {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima"); 
		stack.add("Test");
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		
		}  
		

	}
	}
	


