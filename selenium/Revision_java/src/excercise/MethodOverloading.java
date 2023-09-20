package excercise;

public class MethodOverloading 
{
	
	static void add()
	{
		System.out.println("Method without arguments");
	}
    
	static void add(int x,int y)
	{
		System.out.println("Method with two arguments:" + (x+y));
	}
	
	static void add(int x,int y,int z)
	{
		System.out.println("Method with three arguments:" + (x+y+z));
	}
	
	static void add(String name,String surname)
	{
		System.out.println("Method with String arguments:" + name+surname);
	}
	
	
	public static void main(String[] args)
	{
		
		add();
		add(2,3);
		add(2,3,4);
		add("Reethu","Sali");
		

	}

}
