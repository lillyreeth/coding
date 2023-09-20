package excercise;

 class Parent
{
	 
	String name="Reeth";
	void method1(int a,int b)
	{
	 System.out.println(a-b);
		
	}
	
}
 
 class child extends Parent
 {
	 
	 void method1(int p,int q)
	 {
        
		 System.out.println(p+q);
		 super.method1(p,q);
		 System.out.println(super.name);
	 }
 }


public class MethodOverrideEx {

	public static void main(String[] args) 
	{
		
	  child obj=new child();
	  obj.method1(10, 5);
      
		

	}

}



