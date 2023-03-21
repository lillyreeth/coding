package packageWebdriver;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopEx {

	public static void main(String[] args)
	{
		
		List inte=new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			
			inte.add(i);
			
		}
		System.out.println(inte);
		
		
		for(int i=0;i<inte.size();i++)
		{
			
			
			System.out.println(inte.get(i));
		}
		
		
		
		
		

	}

}
