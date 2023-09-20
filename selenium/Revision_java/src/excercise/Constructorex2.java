package excercise;



class const1
{
	
	String name="Reeth";
	void const1(int a,int b)
	{
	 System.out.println(a*b);
		
	}

}

class const2 extends const1
{
	
	void const1(int z,int q)
	{
		 System.out.println(z+q);
		 super.const1(z, q);
		 System.out.println(super.name);

	}
	
}

public class Constructorex2 {

	public static void main(String[] args) 
	{
		
		 const2 obj=new const2();
		 obj.const1(20, 10);     
	}

}
