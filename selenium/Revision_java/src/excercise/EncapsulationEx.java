
 
package excercise;

  class Student

 {	
	
	private String sname;
	 int sno;

	public String getSname() 
	{
		return sname;
	}


	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public int getSno()
	{
		return sno;
	}


	public void setSno(int sno)
	{
		this.sno = sno;
		System.out.println("set sno is :" + sno);
	}
}

     class EncapsulationEx
    
   {
    	
	public static void main(String[] args)
	
	{
		Student obj=new Student();
	
		obj.setSname("Lilly");
		obj.setSno(7);
		obj.sno=10;
		System.out.println(obj.getSname());
		System.out.println(obj.getSno());
		System.out.println(obj.getSno());
        
	}
	}


