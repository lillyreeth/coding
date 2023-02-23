

class Test
{
  int sno;
  String sname;
  String department;
  Test(){}

  Test(int x,String y,String z)
  {
   sno=x;
   sname=y;
   department=z;
 }
 /*  display()
 {
    System.out.println("The student details are:" + sno +sname +department );

 }*/

}
class Sample
{
   public static void main(String args[])
   {
    
    Test s1=new Test(1,"Karthik","IT");
    Test s2=new Test(2,"Reeth","ECE");
    Test s3=new Test(3,"Deepu","CSE");

    System.out.println("The student details are :");
    System.out.println("------------------------------");
    System.out.println( s1.sno+" | " +s1.sname  + " |  " + s1.department );
    System.out.println( s2.sno+" | " +s2.sname  + " |  " + s2.department );
    System.out.println( s3.sno+" | " +s3.sname  + " |  " + s3.department );
    System.out.println("------------------------------");
    /*s1.display();
    s2.display();
    s3.display();*/ 

   }
}