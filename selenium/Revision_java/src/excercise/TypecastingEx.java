package excercise;

public class TypecastingEx {

	public static void main(String[] args) 
	{
		//widening casting(automatically converting a smaller type to a larger type )
		
		int wideint=10;
		float widefloat=wideint;
		double widedouble=wideint;
		System.out.println(wideint);
		System.out.println(widefloat);
		System.out.println(widedouble);
		
		
		//narrowing casting (manually converting larger type to smaller type)
		
		double narrowdouble=28731369876.98d;
		
		float narrowfloat=(float) narrowdouble;
		
		int narrowint=(int) narrowdouble;
		
		System.out.println(narrowdouble);
		System.out.println(narrowfloat);
		System.out.println(narrowint);
		


	}

}
