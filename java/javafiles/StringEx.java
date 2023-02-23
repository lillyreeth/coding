

class StringEx
{

public static void main(String args[])

{
  //String concatination
   String S="Welcome to";
   String s1=S.concat(" String topic");

   System.out.println("Concatinated string is: " + s1);

   //character at?
   String s2="This is Testing class";
   char c= s2.charAt(2);
   System.out.println("Character at index 2 is: " + c);

   //Length of the string
    int len=s2.length();
    System.out.println("Length of the String: " + len);

    //compare two string  (result will be 0 if it has equal string value and +ve number if s2>s3 and -ve num if s2<s3)
    String s3="This is testing class";
    int res= s3.compareTo(s2);
    System.out.println("Result is of campareTo is : " + res);
    //compare to ignore case means it ignores case sensitive

    int res1=s3.compareToIgnoreCase(s2);
    System.out.println("Result is of campareToIgnoreCase is : " + res1);
  //Equal

  System.out.println("equals result is : " + s3.equals(s2));
  System.out.println("equalsIgnoreCase result is : " + s3.equalsIgnoreCase(s2));










   


}



}