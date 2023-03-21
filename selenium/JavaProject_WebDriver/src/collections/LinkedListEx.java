package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("karthik");
		list.add("Lilly");
		list.add("Reeth");
		list.add("Prashastha");
		list.add("Rinku");
		list.add("swetha");
		list.addFirst("First");
		list.addLast("Last");

		System.out.println(list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		LinkedList<String> list2 = new LinkedList<String>();

		list2.add("item1");
		list2.add("item2");
		list2.add("item3");
		list2.add("item4");

		list.addAll(list2);

		System.out.println(list);

		List<String> list3 = new ArrayList<String>();

		list3.add("test1");
		list3.add("test2");
		list3.add("test3");
		list.addAll(list3);
		System.out.println(list);

		// list.clear();
		// System.out.println(list);
		list.clone();
		LinkedList<String> list4 = (LinkedList<String>) list.clone();
		System.out.println("list4 items are : " + list4);
        
		Iterator itr_list4= list4.descendingIterator();
		System.out.println("list4 descending order items are : ");
		while(itr_list4.hasNext())
		{
			
		System.out.print(itr_list4.next());
		System.out.print(" ");
		}
		
		
		
		
		
		
//	   for(int i=0; i<=5; i++) {
//		   System.out.println("test");
//		}
//	   
//	   int i=0;
//	   while(i<=5) {
//		   
//		   System.out.println("test");
//		   i++;
//		}

	}

}
