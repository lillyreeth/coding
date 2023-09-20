package excercise;

abstract class Ex1
{
	
    abstract void abstractmethod1();
	
	public void method2()
	{
		System.out.println("Concrete method");
	}
	
}

class Ex2 extends Ex1
{

	@Override
	void abstractmethod1() 
	{
		System.out.println("Abstract method");
		
	}
	
	
}
 public class AbstractEx
 {
	public static void main(String[] args)
	{
		
		Ex2 obj=new Ex2();
		obj.abstractmethod1();
		obj.method2();
				

		
	}
 }

