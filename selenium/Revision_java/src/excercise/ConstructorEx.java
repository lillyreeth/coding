package excercise;

public class ConstructorEx 
{
	
	int x;
	
   public  ConstructorEx()
	{
		System.out.println("Constructor without parameters");
	
	}
	
	public ConstructorEx(int x)
	{
		System.out.println("Constructor with parameters " + x);
	
	}
	

	public static void main(String[] args) 
	{
		
     ConstructorEx obj=new ConstructorEx();
     ConstructorEx obj1=new ConstructorEx(5);
     
	}

}
